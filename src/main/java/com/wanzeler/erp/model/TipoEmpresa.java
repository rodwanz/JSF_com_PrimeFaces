package com.wanzeler.erp.model;

public enum TipoEmpresa {
	
	MEI("Microempreendedor Individal"),
	EIRELI("Empresa Individal de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anõnima");
	
	private String descricao;
	
	TipoEmpresa(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
