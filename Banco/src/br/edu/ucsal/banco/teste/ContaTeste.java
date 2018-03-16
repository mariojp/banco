package br.edu.ucsal.banco.teste;

import br.edu.ucsal.banco.modelo.Conta;

public class ContaTeste {

	public static void main(String[] args) {
	
		//declaração da variavel 
		Conta conta01;
		
		//Criando a conta e atribuindo a varivel
		conta01 = new Conta(1,1);
		conta01.depositar(100);
		conta01.sacar(70);
		
		Conta conta02 = new Conta(1, 2);
		conta02.depositar(1000);
		
		conta02.transferir(200, conta01);
		
		Conta conta03 = new Conta(1, 2);
		conta03.depositar(1000);
		
		Conta conta04 = conta01;
		conta04.depositar(30);
		
		
		
		
		
	}
	
	
}
