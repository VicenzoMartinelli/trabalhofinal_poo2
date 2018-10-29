package br.edu.utfpr.pb.vicenzo_trabfinal.dao;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.Usuario;
import javax.persistence.Query;

public class UsuarioDAO extends GenericDao<Usuario, Long> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public Usuario findByEmailOrNameAndSenha(String filtrer, String senha) {
        Query query = em.createNamedQuery(Usuario.FIND_BY_EMAIL_AND_SENHA);
        
        query.setParameter("filtro", filtrer);
        query.setParameter("senha", senha);

        return (Usuario) query.getSingleResult();
    }
}
