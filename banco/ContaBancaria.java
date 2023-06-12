package banco;

public abstract class ContaBancaria {
	// atributo saldo
	protected double saldo;
	
	// metodo depositar
	public void depositar(double valor) {
		if(valor >= 0) saldo += valor;
	}
	
	// metodo sacar
	public void sacar(double valor) {
		if(valor >= 0) saldo -= valor;
	}
	
	// metodo transferir
	public void transferir(double valor, ContaBancaria conta) {
		if(valor >= 0) {
			saldo -= valor;
			conta.saldo += valor;
		}
	}
	
	// metodo abstrato calcularSaldo (deve ser implementado pelas subclasses)
	public abstract double calcularSaldo();
}