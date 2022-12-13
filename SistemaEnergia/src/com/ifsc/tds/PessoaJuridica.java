package com.ifsc.tds;

public class PessoaJuridica extends Cliente{
	
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "-------------------------"
				+ "\n CPF: " + getCNPJ();
		
		return texto;
	}
	
}
