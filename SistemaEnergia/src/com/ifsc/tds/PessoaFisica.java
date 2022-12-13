package com.ifsc.tds;

public class PessoaFisica extends Cliente {
	
	private String CPF;
	
	public PessoaFisica() {
		super(int clienteId, String nome, String endereco);
		
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "-------------------------"
				+ "\n CPF: " + getCPF();
		
		return texto;
	}
}
