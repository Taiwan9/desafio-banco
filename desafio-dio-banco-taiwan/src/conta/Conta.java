package conta;

public abstract class Conta implements IConta {

	protected static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 2;

	protected int agencia;
	protected int numero;
	protected float saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
	
	protected  void imprimirConta() {
		System.out.println(String.format("Nome: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


}
