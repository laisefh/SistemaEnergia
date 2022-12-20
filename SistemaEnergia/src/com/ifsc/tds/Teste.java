package com.ifsc.tds;


public class Teste {	

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		
		endereco.setCep("89253600");
		endereco.setCidade("Jaragua ");
		endereco.setEstado("SC");
		endereco.setNumero(445);
		endereco.setRua("Francisco");
		PessoaFisica cliente1 = new PessoaFisica("11111", 1111, "Laise", endereco);
		
			System.out.println(cliente1.toStringg());
			System.out.println(cliente1.toString());
			
			PessoaJuridica cliente2 = new PessoaJuridica("11111", 1111, "Laise", endereco);
			System.out.println(cliente2.toStringg());
			System.out.println(cliente2.toString());



			
		
	}

}
