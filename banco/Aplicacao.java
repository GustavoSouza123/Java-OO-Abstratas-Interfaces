package banco;

public class Aplicacao {
	public static void main(String[] args) {
		// instanciar conta corrente e conta investimento
		ContaBancaria contaCorrente = new ContaCorrente();
		ContaBancaria contaInvestimento = new ContaInvestimento();
		
		// depositar, sacar e transferir (conta corrente)
		contaCorrente.depositar(1500);
		contaCorrente.sacar(250);
		contaCorrente.transferir(700, contaInvestimento);
		
		// depositar, sacar e transferir (conta investimento)
		contaInvestimento.depositar(950);
		contaInvestimento.sacar(400);
		contaInvestimento.transferir(50, contaCorrente);
		
		// imprimir saldo das contas
		System.out.println("Saldo conta corrente: " + contaCorrente.calcularSaldo());
		System.out.println("Saldo conta investimento: " + contaInvestimento.calcularSaldo());
	}
}