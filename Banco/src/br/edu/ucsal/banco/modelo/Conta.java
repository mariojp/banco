package br.edu.ucsal.banco.modelo;

public class Conta {
	
	private int agencia;
	
	private int numero;
	
	private double saldo = 0;
	
	public Conta(int agencia, int numero) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 0;
	}
	
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	
	public void transferir(double valor, Conta conta) {
		this.saldo = this.saldo - valor;
		conta.saldo = conta.saldo + valor; 
	}
	
	

}
