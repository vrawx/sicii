package br.gov.pmdf.sicii.domain.repositorio;

import java.util.List;

import br.gov.pmdf.sicii.domain.entidade.EventoInvestigacao;

/**
 * Interface DAO.<br>
 * Extende acesso aos metodos da Classe generica de acesso ao banco de dados.
 * 
 * @author Rogerio Pinto & Vitor
 */

public interface RepositorioEventoInvestigacao extends Repositorio<EventoInvestigacao> {
	
	public List<EventoInvestigacao> recuperarPorFragmento(EventoInvestigacao eventoInvestigacao);
}
