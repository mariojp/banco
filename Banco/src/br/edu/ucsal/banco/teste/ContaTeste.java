package br.edu.ucsal.banco.teste;

import br.edu.ucsal.banco.modelo.Conta;

public class ContaTeste {

	public static void main(String[] args) {
	
		//declaração da variavel 
		Conta conta01;
		
		//Criando a conta e atribuindo a varivel
		conta01 = new Conta();
		
		conta01.agencia = 1;
		conta01.numero = 1;
		conta01.saldo = 0;
		conta01.depositar(100);
		conta01.sacar(70);
		
		
		
		
		
		
		
	}
	
	
}
