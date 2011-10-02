package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.jboss.seam.annotations.Name;

/**
 * Classe Pesquisa
 * OBJETIVO: Representar as Pesquisas que compoem as Investigacoes dos Eventos 
 * de Investigacao
 * AUTORES: Rogerio & Vitor
 */

@Entity
@SequenceGenerator(name="pesquisaSequence", sequenceName="pesquisaSequencePostgres" )
@Name("pesquisa")
public class Pesquisa extends BaseEntity {
			
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="pesquisaSequence")
	@Column(name="pesCodigo")
	private Long codigoPesquisa;
	
	@OneToOne
	@JoinColumn
	private Situacao situacao;
	
	@OneToOne
	@JoinColumn
	private Organizacao organizacao;
	
	@OneToOne
	@JoinColumn
	private TipoPesquisa tipoPesquisa;
		
	@ManyToOne
	@JoinColumn
	private Investigacao investigacao;	
	
	private Date dataResposta;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn
	private Endereco endereco;
	
	private String dadosAdicionais;		
	
	@OneToOne
	private Documento documento;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn
	private List<Embasamento> embasamentos;
	
	public Pesquisa() {

	}

	//get and set
	public Long getCodigoPesquisa() {
		return codigoPesquisa;
	}
	public void setCodigoPesquisa(Long codigoPesquisa) {
		this.codigoPesquisa = codigoPesquisa;
	}
	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();			
		}
		return endereco;
	}	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public TipoPesquisa getTipoPesquisa() {
		return tipoPesquisa;
	}
	public void setTipoPesquisa(TipoPesquisa tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
	public Investigacao getInvestigacao() {
		return investigacao;
	}
	public void setInvestigacao(Investigacao investigacao) {
		this.investigacao = investigacao;
	}
	public Date getDataResposta() {
		return dataResposta;
	}
	public void setDataResposta(Date dataResposta) {
		this.dataResposta = dataResposta;
	}
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public List<Embasamento> getEmbasamentos() {
		return embasamentos;
	}
	public void setEmbasamentos(List<Embasamento> embasamentos) {
		this.embasamentos = embasamentos;
	}
	public Documento getDocumento() {		
		if (documento == null) {
			documento = new Documento();			
		}
		return documento;		
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
