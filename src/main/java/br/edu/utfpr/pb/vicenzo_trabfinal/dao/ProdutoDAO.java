package br.edu.utfpr.pb.vicenzo_trabfinal.dao;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.Produto;

public class ProdutoDAO extends GenericDao<Produto, Long> {

    public ProdutoDAO() {
        super(Produto.class);
    }
}
