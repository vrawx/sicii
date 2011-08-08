package org.domain.sicii.session;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuario;

@Name("authenticator")
public class Authenticator {

	@Logger private Log log;

    @In Identity identity;
    @In Credentials credentials;
    @In RepositorioUsuario repositorioUsuario;    
    
    public boolean authenticate()    {
        log.info("authenticating {0}", credentials.getUsername());
        //write your authentication logic here,
        //return true if the authentication was
        //successful, false otherwise
        if( repositorioUsuario.getByCredentials(credentials.getUsername(), credentials.getPassword()) ) {
        	identity.addRole("AGENTE");
        	return true;
        }        
        return false;
    }
}
