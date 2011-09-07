package br.gov.pmdf.sicii.domain.entidade;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
