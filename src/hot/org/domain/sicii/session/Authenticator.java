package org.domain.sicii.session;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("authenticator")
public class Authenticator {

	@Logger private Log log;

    @In Identity identity;
    @In Credentials credentials;
    @In RepositorioUsuario repositorioUsuario;    
    
    public boolean authenticate()    {
        log.info("authenticating {0}", credentials.getUsername());      
        
        Usuario user = repositorioUsuario.getByCredentials(credentials.getUsername(), credentials.getPassword());
        if( user != null ) {
        	//identity.addRole(user.getTipoUsuario());
        	identity.addRole("PERFILUSER");
        	return true;
        }        
        return false;
    }
}
