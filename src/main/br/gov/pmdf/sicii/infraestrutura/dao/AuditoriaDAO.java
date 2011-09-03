package br.gov.pmdf.sicii.infraestrutura.dao;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Auditoria;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAuditoria;

@Name("repositorioAuditoria")
@AutoCreate
public class AuditoriaDAO extends AbstractDAO<Auditoria> implements RepositorioAuditoria{

	private static final long serialVersionUID = 1L;

}
