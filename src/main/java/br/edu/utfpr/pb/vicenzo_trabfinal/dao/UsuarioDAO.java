package br.edu.utfpr.pb.vicenzo_trabfinal.dao;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.Usuario;

public class UsuarioDAO extends GenericDao<Usuario, Long> {

    public UsuarioDAO() {
        super(Usuario.class);
    }
}
