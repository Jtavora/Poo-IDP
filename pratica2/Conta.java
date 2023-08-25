public class Conta{
    public String nome;
    public int agencia;
    public int numero;
    public double saldo;

    public static Conta cria_Conta(String nome, int agencia, int numero, double saldo){
        Conta c = new Conta();
        c.nome = nome;
        c.agencia = agencia;
        c.numero = numero;
        c.saldo = saldo;

        return c;
    }

    public static void imprime_conta(Conta c){
        System.out.println("Nome: " + c.nome);
        System.out.println("Agencia: " + c.agencia);
        System.out.println("Numero: " + c.numero);
        System.out.println("Saldo: " + c.saldo);
        System.out.println();
    }

}