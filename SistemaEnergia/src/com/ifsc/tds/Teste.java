package com.ifsc.tds;


public class Teste {	

	public static void main(String[] args) {
		Endereco endereco[] = new Endereco[100];

		
		
		PessoaFisica testeCliente = new PessoaFisica();
		Endereco endereco1 = new Endereco();
		
		endereco[i].setCep("89253");
		endereco1.setCidade("Jaragua");
		endereco1.setEstado("sc");
		endereco1.setNumero(445);
		endereco1.setRua("FRancisco Hruschka");
		
		testeCliente.setCPF("111.111.111-11");
		testeCliente.setClienteId(123);
		testeCliente.setEndereco(endereco1);
		testeCliente.setNome("Laise");
		
		System.out.println(testeCliente.toString());
		System.out.println(testeCliente.getEndereco());
		System.out.println();
	}

}
