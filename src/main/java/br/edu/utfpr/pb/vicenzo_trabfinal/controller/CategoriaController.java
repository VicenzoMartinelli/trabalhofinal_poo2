package br.edu.utfpr.pb.vicenzo_trabfinal.controller;

import br.edu.utfpr.pb.vicenzo_trabfinal.dao.CategoriaDAO;
import br.edu.utfpr.pb.vicenzo_trabfinal.dao.GenericDao;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Categoria;

public class CategoriaController extends GenericController<Categoria, Long> {

    private final CategoriaDAO dao;

    public CategoriaController() {
        this.dao = new CategoriaDAO();
    }

    @Override
    protected GenericDao<Categoria, Long> getDAO() {
        return dao;
    }
    
    
}
