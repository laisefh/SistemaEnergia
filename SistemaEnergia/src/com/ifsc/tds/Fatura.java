package com.ifsc.tds;

//popipo

public class Fatura extends Tarifa{
	
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
		double valorfatura;
		if(consumo <= tarResidencial1) {
			valorfatura = consumo * tarResidencial1;
		}else if(consumo > tarResidencial1) {
			valorfatura = consumo * tarResidencial2;}
		
		return 0;
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
	
	public void imprimirFatura(Fatura[] fatura) {
		for(Fatura f : fatura) {
			System.out.println(f.faturaId);
		}
	}
}
