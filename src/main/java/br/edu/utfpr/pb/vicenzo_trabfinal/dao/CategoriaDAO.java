package br.edu.utfpr.pb.vicenzo_trabfinal.dao;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.Categoria;
import java.util.List;
import javax.persistence.Query;

public class CategoriaDAO extends GenericDao<Categoria, Long> {

    public CategoriaDAO() {
        super(Categoria.class);
    }

    public List<Object[]> getCategoriaProdutos() {
        Query query = em.createQuery("Select c.descricao, "
                + "count(p) from Produto AS p "
                + "INNER JOIN p.categoria AS c "
                + "GROUP BY c.id");
        return (List<Object[]>) query.getResultList();
    }
    
    public List<Categoria> findByDescricao(String descricao){
        Query query = em.createQuery("SELECT c "
                + "FROM Categoria c "
                + "WHERE c.descricao LIKE :descricao");
        query.setParameter("descricao", "%" + descricao + "%");
        return query.getResultList();
    }
    
     public List<Object[]> getCategoriaVendaMes() {
        Query query = em.createNativeQuery("SELECT sum(vp.quantidade) as qtde, "
                + "c.descricao, DATE_PART('MONTH', v.data) AS mes "
                + "FROM venda v "
                + "INNER JOIN vendaproduto vp ON v.id = vp.venda_id "
                + "INNER JOIN produto p ON p.id = vp.produto_id "
                + "INNER JOIN categoria c ON c.id = p.categoria_id "
                + "GROUP BY c.descricao, (DATE_PART('MONTH', v.data)) "
                + "ORDER BY mes");
        return (List<Object[]>) query.getResultList();
    }

}
