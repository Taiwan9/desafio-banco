package main;

import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Application {

	public static void main(String[] args) {
		
		Cliente taiwan = new Cliente();
		taiwan.setNome("Taiwan Marinho");
		
		Conta cc = new ContaCorrente(taiwan);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(taiwan);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
