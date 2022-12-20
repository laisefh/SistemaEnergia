package com.ifsc.tds;

public class Endereco {
	
	private String rua;
	
	private int numero;
	
	private String cep;
	
	private String cidade;
	
	private String Estado;
	
	public Endereco(String rua, int numero, String cep, String cidade, String Estado){
		this.rua=rua;
		this.numero=numero;
		this.cep=cep;
		this.cidade=cidade;
		this.Estado=Estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "\n-------------------------"
				+ "\n Rua: " + getRua()
				+ "\n Número: " + getNumero()
				+ "\n Cep: " + getCep()
		        + "\n Cidade: " + getCidade()
		        + "\n Estado: " + getEstado();
		
		return texto;
	}
	
	

}
