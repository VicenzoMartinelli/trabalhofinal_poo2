package br.edu.utfpr.pb.vicenzo_trabfinal.controller;

import br.edu.utfpr.pb.vicenzo_trabfinal.dao.GenericDao;
import br.edu.utfpr.pb.vicenzo_trabfinal.dao.UsuarioDAO;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Usuario;
import br.edu.utfpr.pb.vicenzo_trabfinal.util.SecurityUtil;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioController extends GenericController<Usuario, Long> {

    private final UsuarioDAO dao;

    public UsuarioController() {
        this.dao = new UsuarioDAO();
    }

    @Override
    protected GenericDao<Usuario, Long> getDAO() {
        return dao;
    }

    public Usuario autenticarUsuario(String text, String password) {
        return dao.findByEmailOrNameAndSenha(text, SecurityUtil.encrypt(password));
    }

    public void teste() {
        try {
            Usuario u = new Usuario();
            u.setComissaoPerc(2f);
            u.setNome("Vicenzo");
            u.setCpf("10604575980");
            u.setEmail("vicenzo@gmail.com");
            u.setSenha(SecurityUtil.encrypt("123abc"));
            new UsuarioController().salvar(u);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
