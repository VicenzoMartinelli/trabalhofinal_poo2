package br.edu.utfpr.pb.vicenzo_trabfinal.dao;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.Cidade;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Estado;
import java.util.List;
import javax.persistence.Query;

public class CidadeDAO extends GenericDao<Cidade, Long> {

    public CidadeDAO() {
        super(Cidade.class);
    }
    
    public List<Cidade> GetByEstado(Estado estado)
    {
        Query query = em.createQuery("SELECT c FROM Cidade c where c.estado = :estado");
        query.setParameter("estado", estado);
        
        return query.getResultList();
    }
}
