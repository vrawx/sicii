package br.gov.pmdf.sicii.domain.repositorio;

import java.util.List;

import br.gov.pmdf.sicii.domain.entidade.Assessoria;
import br.gov.pmdf.sicii.domain.entidade.Usuario;

/**
 * Interface DAO.<br>
 * Extende acesso aos metodos da Classe generica de acesso ao banco de dados.
 * 
 * @author Rogerio Pinto & Vitor
 */

public interface RepositorioAssessoria extends Repositorio<Assessoria> {

	List<Assessoria> recuperarAssessoriasUsuario(Usuario usuario);
}
