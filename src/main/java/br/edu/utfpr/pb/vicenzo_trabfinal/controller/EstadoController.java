package br.edu.utfpr.pb.vicenzo_trabfinal.controller;

import br.edu.utfpr.pb.vicenzo_trabfinal.dao.EstadoDAO;
import br.edu.utfpr.pb.vicenzo_trabfinal.dao.GenericDao;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Estado;

public class EstadoController extends GenericController<Estado, Long> {
    private final EstadoDAO dao;
    
    public EstadoController()
    {
        this.dao = new EstadoDAO();
    }

    @Override
    protected GenericDao<Estado, Long> getDAO() {
        return dao;
    }

}
