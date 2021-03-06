package br.edu.utfpr.pb.vicenzo_trabfinal.dao;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.AbstractModel;
import br.edu.utfpr.pb.vicenzo_trabfinal.util.EntityManagerUtil;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public abstract class GenericDao<T extends AbstractModel, I extends Serializable> {

    @PersistenceContext()
    protected EntityManager em;

    private Class<T> persistedClass;

    public GenericDao() {
    }

    public GenericDao(Class<T> persistedClass) {
        this();
        this.persistedClass = persistedClass;
        this.em = EntityManagerUtil.getEntityManager();
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public void save(T entity) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        if (entity.getId() == null) {
            em.persist(entity);
        } else {
            em.merge(entity);
        }
        em.flush();
        t.commit();
    }

    public void insert(T entity) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(entity);
        em.flush();
        t.commit();
    }

    public void update(T entity) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(entity);
        em.flush();
        t.commit();
    }

    public void delete(I id) {
        T entity = getOne(id);
        EntityTransaction t = em.getTransaction();
        t.begin();
        T mergedEntity = em.merge(entity);
        em.remove(mergedEntity);
        em.flush();
        t.commit();
    }

    public T getOne(I id) {
        return em.find(persistedClass, id);
    }

    public List<T> getAll() {
        em.clear();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(persistedClass);
        query.from(persistedClass);
        return em.createQuery(query).getResultList();
    }

    public boolean isValid(T entity) {
        final Validator validador = Validation
                .buildDefaultValidatorFactory()
                .getValidator();

        return (validador.validate(entity).isEmpty());
    }

    public String getErros(T entity) {
        final Validator validador = Validation
                .buildDefaultValidatorFactory()
                .getValidator();

        final Set<ConstraintViolation<T>> violations = validador.validate(entity);
        String errors = "";
        if (!violations.isEmpty()) {
            errors = violations.stream().map(v -> v.getMessage() + "\n").reduce(errors, String::concat);
        }
        return errors;
    }

}
