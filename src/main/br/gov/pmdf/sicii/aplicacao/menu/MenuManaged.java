package br.gov.pmdf.sicii.aplicacao.menu;

import java.io.Serializable;

import org.jboss.seam.annotations.Name;

@Name("menuManaged")
public class MenuManaged implements Serializable{

	private static final long serialVersionUID = 1L;

	public String eventoInvestigacao(){
		return "evento";
	}
	public String investigado(){
		return "investigado";
	}
}
