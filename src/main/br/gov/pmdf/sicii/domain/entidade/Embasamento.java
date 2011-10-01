package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.jboss.seam.annotations.Name;

/**
 * Classe Embasamento
 * OBJETIVO: Representar os Embasamentos das Pesquisas realizadas pelos Agentes
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="embasamentoSequence", sequenceName="embasamentoSequencePostgres")
@Name("embasamento")
public class Embasamento extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="embasamentoSequence")
	@Column(name="embCodigo")
	private Long codigoEmbasamento;
	
	@OneToOne
	@JoinColumn
	private TipoEmbasamento tipoEmbasamento;
		
	private Date adicionado;
	private String link;
	private String descricao;	
	
	@ManyToOne
	private Pesquisa pesquisa;	
	
	public Embasamento() {

	}
	//get and set
	public Long getCodigoEmbasamento() {
		return codigoEmbasamento;
	}
	public void setCodigoEmbasamento(Long codigoEmbasamento) {
		this.codigoEmbasamento = codigoEmbasamento;
	}
	public TipoEmbasamento getTipoEmbasamento() {
		return tipoEmbasamento;
	}
	public void setTipoEmbasamento(TipoEmbasamento tipoEmbasamento) {
		this.tipoEmbasamento = tipoEmbasamento;
	}
	public Date getAdicionado() {
		return adicionado;
	}
	public void setAdicionado(Date adicionado) {
		this.adicionado = adicionado;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pesquisa getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
}
