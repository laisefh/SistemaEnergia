package com.ifsc.tds;

public class Uc {

	private int ucld;
	private int leituraAnterior;
	private int leituraAtual;
	private Cliente cliente;
	

	public Uc() {
		
	}

	public int getUcld() {
		return ucld;
	}

	public void setUcld(int ucld) {
		this.ucld = ucld;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String toString() {
		String texto = "";
		
		texto = "-------------------------"
				+ "\n UCLD: " + getUcld()
				+ "\n Leitura Anterior: " + getLeituraAnterior()
				+ "\n Leitura Atual: " + getLeituraAtual()
				+ "\n Cliente: " + getCliente()
				+ "\n Id da Unidade Consumidora: " + getUcld();
		
		return texto;
	}
	
	public int faturar(int leitura) {
		leituraAnterior = leituraAtual;
		leituraAtual = leitura;
		return pegarConsumo();
	}
	//c
	
	public int pegarConsumo() {
		int consumo = leituraAnterior - leituraAtual;
		System.out.println("Diferença de consumo: " + consumo);
		return consumo;
	}
}
