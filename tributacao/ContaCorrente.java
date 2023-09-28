// ContaCorrente.java
class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01; // 1% do saldo
    }
}
