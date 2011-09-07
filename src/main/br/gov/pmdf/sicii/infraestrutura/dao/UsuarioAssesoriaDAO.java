package br.gov.pmdf.sicii.infraestrutura.dao;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Assessoria;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.entidade.UsuarioAssessoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioUsuarioAssessoria;

@Name("repositorioUsuarioAssessoria")
@AutoCreate
public class UsuarioAssesoriaDAO extends AbstractDAO<UsuarioAssessoria> implements RepositorioUsuarioAssessoria {

	private static final long serialVersionUID = 1L;
	private String packageName = UsuarioAssessoria.class.getPackage().getName();
	
	public Assessoria recuperarAssessoriasUsuario(Usuario usuario) {
		String query = "SELECT usuarioAssessoria.assessoria FROM "+packageName+".UsuarioAssessoria usuarioAssessoria "+
				" WHERE usuarioAssessoria.usuario.codigo =:usuario.codigo AND usuarioAssessoria.status =:true";		
		return (Assessoria) entityManager.createQuery(query).setParameter("usuario.codigo", usuario.getCodigoUsuario()).getSingleResult();		
	}	
}
