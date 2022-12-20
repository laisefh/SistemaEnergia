package com.ifsc.tds;

public class PessoaJuridica extends Cliente{
	
	private String CNPJ;
	
	public PessoaJuridica() {
		
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String toString() {
		super.toString();
		String texto = "";
		
		texto = "-------------------------"
				+ "\n CNPJ: " + getCNPJ();
		
		return texto;
	}
	
}
