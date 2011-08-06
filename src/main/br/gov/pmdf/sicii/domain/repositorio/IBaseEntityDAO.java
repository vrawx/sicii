/**
 * Interface DAO.<br>
 * Contém os métodos de acesso ao banco de dados.
 * 
 * @author Rogério Pinto & Vitor
 */

package br.gov.sicii.dao.interfaces;

import java.util.List;

import br.gov.sicii.domain.BaseEntity;

public interface IBaseEntityDAO<B extends BaseEntity> {

    /**
     * Insere uma entidade no Banco de Dados
     * @param entidade
     */
    void inserir(B baseEntity);

    /**
     * Altera uma entidade no Banco de Dados
     * @param entidade
     */
    void alterar(B baseEntity);

    /**
     * Remove uma entidade no Banco de Dados
     * @param entidade
     */
    void remover(B baseEntity);

    /**
     * Consulta todos os registros de determinada entidade.
     * @return Todos os registros
     */
    List<B> consultarTodos();
    
    /**
     * Consulta baseando nos atributos preenchidos
     * @param entidade
     * @return
     */
    List<B> consultar(B baseEntity);

    B consultarPorId(Integer id);
}
