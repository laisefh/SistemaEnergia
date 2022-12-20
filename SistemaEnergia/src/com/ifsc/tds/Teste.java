package com.ifsc.tds;

import java.util.Scanner;

public class Teste {	

	public static void main(String[] args) {
		Endereco[] endereco = new Endereco[100];
		PessoaFisica[] pessoaf = new PessoaFisica[100];
		PessoaJuridica[] pessoaj = new PessoaJuridica[100];
		int pf = 0;
		int c = 0;
		int d = 0;
		int pj = 0;
		int m =0;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de Pessoas Físicas: ");
		pf = teclado.nextInt();
		
		while(c < pf) {
			System.out.println("Digite o cpf: ");
			String cpf = teclado.next();
			
			System.out.println("Digite o id: ");
			int id = teclado.nextInt();
			
			System.out.println("Digite o nome: ");
			String nome = teclado.next();
			
			System.out.println("Digite a rua: ");
			String rua = teclado.next();
			
			System.out.println("Digite o n: ");
			int n = teclado.nextInt();
			
			System.out.println("Digite o cep: ");
			String cep = teclado.next();
			
			System.out.println("Digite a cidade: ");
			String cidade = teclado.next();
			
			System.out.println("Digite o estado: ");
			String estado = teclado.next();
			
			endereco[c] = new Endereco(rua, n, cep, cidade, estado);
			pessoaf[c] = new PessoaFisica(cpf, id, nome, endereco[c]);
			
			c++;
		}
		while(d < pf) {
			System.out.println(pessoaf[d].toString());
			System.out.println(pessoaf[d].toStringg());
			d++;
		}
		
		System.out.println("Digite a quantidade de Pessoas Jurídicas: ");
		pj = teclado.nextInt();
		
		while(m < pj) {
			System.out.println("Digite o cnpj: ");
			String cnpj = teclado.next();
			
			System.out.println("Digite o id: ");
			int id = teclado.nextInt();
			
			System.out.println("Digite o nome: ");
			String nome = teclado.next();
			
			System.out.println("Digite a rua: ");
			String rua = teclado.next();
			
			System.out.println("Digite o n: ");
			int n = teclado.nextInt();
			
			System.out.println("Digite o cep: ");
			String cep = teclado.next();
			
			System.out.println("Digite a cidade: ");
			String cidade = teclado.next();
			
			System.out.println("Digite o estado: ");
			String estado = teclado.next();
			
			endereco[m] = new Endereco(rua, n, cep, cidade, estado);
			pessoaj[m] = new PessoaJuridica(cnpj, id, nome, endereco[m]);
			
			m++;
		}
		d=0;
		while(d < pj) {
			System.out.println(pessoaj[d].toString());
			System.out.println(pessoaj[d].toStringg());
			d++;
		}
		
	
	}

}
