package com.ifsc.tds;

public class PessoaFisica extends Cliente {
	
	private String CPF;
	
	public PessoaFisica() {
		
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String toString() {
		super.toString();
		String texto = "";
		
		texto = "-------------------------"
				+ "\n CPF: " + getCPF();
		
		return texto;
	}
}
