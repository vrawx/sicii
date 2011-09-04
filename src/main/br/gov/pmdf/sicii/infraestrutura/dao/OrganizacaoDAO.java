package br.gov.pmdf.sicii.infraestrutura.dao;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import br.gov.pmdf.sicii.domain.entidade.Organizacao;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioOrganizacao;

@Name("repositorioOrganizacao")
@AutoCreate
public class OrganizacaoDAO extends AbstractDAO<Organizacao> implements	RepositorioOrganizacao {

	private static final long serialVersionUID = 1L;

	
}
