package br.gov.pmdf.sicii.domain.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.jboss.seam.annotations.Name;

/**
 * Classe Parecer
 * OBJETIVO: Representar os Pareceres das Pesquisas, Investigacoes e Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="parecerSequence", sequenceName="parecerSequencePostgres")
@Name("parecer")
public class Parecer extends BaseEntity {
		
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="parecerSequence")
	@Column(name="parCodigo")
	private Integer codigoParecer;
	
	@OneToOne
	private Situacao situacao;
	
	private String parecer;		

	//get and set	
	public Integer getCodigoParecer() {
		return codigoParecer;
	}	
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public String getParecer() {
		return parecer;
	}
	public void setParecer(String parecer) {
		this.parecer = parecer;
	}	
}
