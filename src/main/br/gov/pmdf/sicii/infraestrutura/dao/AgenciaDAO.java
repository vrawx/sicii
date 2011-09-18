package br.gov.pmdf.sicii.infraestrutura.dao;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.pmdf.sicii.domain.entidade.Agencia;
import br.gov.pmdf.sicii.domain.repositorio.RepositorioAgencia;

@Name("repositorioAgencia")
@AutoCreate
public class AgenciaDAO extends AbstractDAO<Agencia> implements RepositorioAgencia {

	private static final long serialVersionUID = 1L;

	public List<Agencia> recuperarPorFragmento(Agencia agencia){
		return null;
	}
	
}
