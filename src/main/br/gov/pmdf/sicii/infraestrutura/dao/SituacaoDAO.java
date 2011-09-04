package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Situacao;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioSituacao;

@Name("repositorioSituacao")
@AutoCreate
public class SituacaoDAO extends AbstractDAO<Situacao> implements RepositorioSituacao {

	private static final long serialVersionUID = 1L;
	private String packageName = Situacao.class.getPackage().getName();
	
	@SuppressWarnings("unchecked")
	public List<Situacao> recuperarGrupoSituacao(String sigla) {
		String query = "FROM "+packageName+".Situacao sit WHERE sit.grupo = (SELECT sit.grupo FROM "+packageName+".Situacao sit WHERE sit.sigla = :sigla) AND sit.sigla != :sigla ";
		return entityManager.createQuery(query).setParameter("sigla",sigla).getResultList();		
	}
}
