package br.edu.utfpr.pb.vicenzo_trabfinal.controller;

import br.edu.utfpr.pb.vicenzo_trabfinal.dao.CidadeDAO;
import br.edu.utfpr.pb.vicenzo_trabfinal.dao.GenericDao;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Cidade;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Estado;
import java.util.List;

public class CidadeController extends GenericController<Cidade, Long> {

    private final CidadeDAO dao;

    public CidadeController() {
        this.dao = new CidadeDAO();
    }

    @Override
    protected GenericDao<Cidade, Long> getDAO() {
        return dao;
    }
    
    public List<Cidade> listarPorEstado(Estado estado)
    {
        return dao.GetByEstado(estado);
    }

}
