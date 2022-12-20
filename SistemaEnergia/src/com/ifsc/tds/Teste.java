package com.ifsc.tds;


public class Teste {	

	public static void main(String[] args) {
		
		Cliente testeCliente = new PessoaFisica();
		Endereco endereco1 = new Endereco();
		
		if(testeCliente instanceof PessoaFisica) {
			PessoaFisica testeCliente1 = (PessoaFisica) testeCliente;
			testeCliente1.setCPF("111.111.111-11");
			
			System.out.println(testeCliente1.toString());
			
		}
		
		
		endereco1.setCep("89253");
		endereco1.setCidade("Jaragua");
		endereco1.setEstado("sc");
		endereco1.setNumero(445);
		endereco1.setRua("FRancisco Hruschka");
		
		testeCliente.setClienteId(123);
		testeCliente.setEndereco(endereco1);
		testeCliente.setNome("Laise");
		
		System.out.println(testeCliente.toString());
		System.out.println(testeCliente.getEndereco());
		System.out.println();
	}

}
