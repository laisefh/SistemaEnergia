package com.ifsc.tds;

public class PessoaFisica extends Cliente {
	
	private String CPF;
	
	public PessoaFisica(String CPF, int clienteId, String nome, Endereco endereco) {
		super(clienteId, nome, endereco);
		this.CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String toString() {
		this.toStringg();
		String texto = "";
		
		texto = "-------------------------"
				+ "\n CPF: " + getCPF();
		
		return texto;
	}
}
