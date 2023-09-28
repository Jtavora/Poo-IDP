// TestaTributavel.java
public class TestaTributavel {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        ContaCorrente contaCorrente = new ContaCorrente(2000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        System.out.println("Saldo da Conta Poupança: R$" + contaPoupanca.obterSaldo());
        System.out.println("Tributos da Conta Corrente: R$" + contaCorrente.calculaTributos());
        System.out.println("Tributos do Seguro de Vida: R$" + seguroDeVida.calculaTributos());

        contaCorrente.sacar(100.0);
        System.out.println("Saldo da Conta Corrente após saque: R$" + contaCorrente.obterSaldo());
    }
}
