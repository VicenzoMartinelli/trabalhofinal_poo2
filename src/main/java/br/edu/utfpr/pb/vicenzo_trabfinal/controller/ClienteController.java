package br.edu.utfpr.pb.vicenzo_trabfinal.controller;

import br.edu.utfpr.pb.vicenzo_trabfinal.dao.ClienteDAO;
import br.edu.utfpr.pb.vicenzo_trabfinal.dao.GenericDao;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Cliente;

public class ClienteController extends GenericController<Cliente, Long> {

    private final ClienteDAO dao;

    public ClienteController() {
        this.dao = new ClienteDAO();
    }

    @Override
    protected GenericDao<Cliente, Long> getDAO() {
        return dao;
    }

}
