public class Main{

    public static void main(String[] args) {
        Conta cliente1 = Conta.cria_Conta("Alana", 1234, 5684, 300.10);
        Conta.imprime_conta(cliente1);

        Conta cliente2 = Conta.cria_Conta("Paulo", 5354, 400, 12.0);
        Conta.imprime_conta(cliente2);

        Conta cliente3 = Conta.cria_Conta("Dylan", 1100, 57, 1205.74);
        Conta.imprime_conta(cliente3);
    }
}