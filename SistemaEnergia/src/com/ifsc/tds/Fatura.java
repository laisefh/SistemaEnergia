package com.ifsc.tds;
//popipo

public class Fatura {
	
	private int faturaId;
	private int mesAno;
	private int consumo;
	private boolean pago; 
	
	Uc unidadeConsumidora = new Uc();
	
	public Fatura() {}

	public int getFaturaId() {
		return faturaId;
	}

	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}

	public int getMesAno() {
		return mesAno;
	}

	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public double calcularValorFatura() {
		double resultado = 0; //criei esta variavel apenas para retornar algo e nao apresentar erro
		return resultado;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "-------------------------"
				+ "\n ID Fatura: " + getFaturaId()
				+ "\n Mês/Ano: " + getMesAno()
				+ "\n Consumo: " + getConsumo()
		        + "\n Pago: " + isPago();
		
		return texto;
	}
	
	public void imprimirFatura() {
		//arrumar este método colocando o vetor
	}
}
