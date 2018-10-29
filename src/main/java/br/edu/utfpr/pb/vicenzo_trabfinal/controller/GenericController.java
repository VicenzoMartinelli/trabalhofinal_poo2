package br.edu.utfpr.pb.vicenzo_trabfinal.controller;

import br.edu.utfpr.pb.vicenzo_trabfinal.dao.GenericDao;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.AbstractModel;
import java.io.Serializable;
import java.util.List;

public abstract class GenericController<T extends AbstractModel, ID extends Serializable> {

    protected abstract GenericDao<T, ID> getDAO();

    public List<T> listar() {
        return getDAO().getAll();
    }

    public T buscar(ID id) {
        return getDAO().getOne(id);
    }

    public void salvar(T entity) throws Exception{
        if (getDAO().isValid(entity)) {
            getDAO().save(entity);
        }
        else{
            throw new Exception(getDAO().getErros(entity));
        }
    }

    public void deletar(ID id) {
        getDAO().delete(id);
    }
}
