package com.ifsc.tds;

public class Tarifa {
	
	double tarResidencial1 = 0.3879;
	double tarResidencial2= 0.405;
	double tarComercial1 = 0.4255;
	double tarComercial2 = 0.45113;
	double icm = 27;
	double taxaIluminacaoPublica = 7.8;
	
	public Tarifa() {}

	public double getTarResidencial1() {
		return tarResidencial1;
	}

	public void setTarResidencial1(double tarResidencial1) {
		this.tarResidencial1 = tarResidencial1;
	}

	public double getTarResidencial2() {
		return tarResidencial2;
	}

	public void setTarResidencial2(double tarResidencial2) {
		this.tarResidencial2 = tarResidencial2;
	}

	public double getTarComercial1() {
		return tarComercial1;
	}

	public void setTarComercial1(double tarComercial1) {
		this.tarComercial1 = tarComercial1;
	}

	public double getTarComercial2() {
		return tarComercial2;
	}

	public void setTarComercial2(double tarComercial2) {
		this.tarComercial2 = tarComercial2;
	}

	public double getIcm() {
		return icm;
	}

	public void setIcm(double icm) {
		this.icm = icm;
	}

	public double getTaxaIluminacaoPublica() {
		return taxaIluminacaoPublica;
	}

	public void setTaxaIluminacaoPublica(double taxaIluminacaoPublica) {
		this.taxaIluminacaoPublica = taxaIluminacaoPublica;
	}
	
}
