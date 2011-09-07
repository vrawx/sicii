package br.gov.pmdf.sicii.domain.repositorio;

import br.gov.pmdf.sicii.domain.entidade.Assessoria;
import br.gov.pmdf.sicii.domain.entidade.Usuario;
import br.gov.pmdf.sicii.domain.entidade.UsuarioAssessoria;

/**
 * Interface DAO.<br>
 * Extende acesso aos metodos da Classe generica de acesso ao banco de dados.
 * 
 * @author Rogerio Pinto & Vitor
 */

public interface RepositorioUsuarioAssessoria extends Repositorio<UsuarioAssessoria> {

	Assessoria recuperarAssessoriasUsuario(Usuario usuario);	
	
}
