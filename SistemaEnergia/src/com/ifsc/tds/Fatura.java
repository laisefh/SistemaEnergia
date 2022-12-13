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
		double valorfatura;
		Tarifa tarifa = new Tarifa();
		if(consumo < 0){
			valorfatura = 0;
		}else if(consumo <= 200 && consumo > 0) {
			valorfatura = consumo * tarifa.tarResidencial1;
		}else if(consumo > 200) {
			valorfatura = consumo * tarifa.tarResidencial2;
		}else if(consumo >= 500) {
			valorfatura = consumo * tarifa.tarComercial1;
		}else{
			valorfatura = consumo * tarifa.tarComercial2;
		}
		System.out.println("Valor Fatura: " + valorfatura);
		
		return valorfatura;
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
		Tarifa tarifa = new Tarifa();
		for(Fatura f : fatura) {
			double valorfatura = f.calcularValorFatura();
			valorfatura = valorfatura + (valorfatura * tarifa.icm / 100) + (valorfatura * tarifa.taxaIluminacaoPublica / 100);
			System.out.println();
			
		}
	}
}
