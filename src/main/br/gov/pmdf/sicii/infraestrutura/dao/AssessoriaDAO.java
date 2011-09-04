package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Assessoria;
import br.gov.pmdf.sicii.domain.entidade.Investigado;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAssessoria;

@Name("repositorioAssessoria")
@AutoCreate
public class AssessoriaDAO extends AbstractDAO<Assessoria> implements RepositorioAssessoria {

	private static final long serialVersionUID = 1L;
	
	private final String packageName = Investigado.class.getPackage().getName();
	
	@SuppressWarnings("unchecked")
	public List<Assessoria> recuperarAssessoriasUsuario(Usuario usuario) {
		String query = "SELECT ass FROM "+packageName+".Assessoria ass WHERE ass.usuarios.codigo =:usuario.codigo";		
		return entityManager.createQuery(query).setParameter("usuario.codigo", usuario.getCodigoUsuario()).getResultList();		
	}
}
