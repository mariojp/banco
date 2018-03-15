package br.edu.ucsal.banco.modelo;

public class Conta {
	
	public int agencia;
	
	public int numero;
	
	public double saldo;
	
//	public Conta() {
//		super();
//	}
	
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	

}
