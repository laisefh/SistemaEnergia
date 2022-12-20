package com.ifsc.tds;

public class PessoaJuridica extends Cliente{
	
	private String CNPJ;
	
	public PessoaJuridica(String CNPJ, int clienteId, String nome, Endereco endereco) {
		super(clienteId, nome, endereco);

		this.CNPJ=CNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String toString() {
		this.toStringg();
		String texto = "";
		
		texto = "-------------------------"
				+ "\n CNPJ: " + getCNPJ();
		
		return texto;
	}
	
}
