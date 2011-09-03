package br.gov.pmdf.sicii.domain.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="auditoriaSequence", initialValue=0, sequenceName="auditoriaSequencePostgres" )
public class Auditoria extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="auditoriaSequence")
	private Long id;
	
	private Usuario usuario;	
	private String acao;	
	private Date data;	
	private String alvo;	
	
	public Auditoria(Usuario usuario, String acao, Date data, String alvo) {
		this.usuario = usuario;
		this.acao = acao;
		this.data = data;
		this.alvo = alvo;
	}
	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getAlvo() {
		return alvo;
	}
	public void setAlvo(String alvo) {
		this.alvo = alvo;
	}	
}
