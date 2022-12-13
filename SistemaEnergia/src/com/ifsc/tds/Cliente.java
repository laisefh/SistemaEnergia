package com.ifsc.tds;

public class Cliente {

	private int clienteId;
	private String nome;
	private Endereco endereco;
	
	public Cliente() {
		
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		String texto = "";
		texto = "-------------------------"
				+ "\n ID Cliente: " + getClienteId()
				+ "\n Nome: " + getNome()
				+ "\n Endereço: " + getEndereco();
		
		return texto;
	}
	
}
