import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        String nome;
        int agencia;
        double saldo;
        int numero = 0;
    
        System.out.println("Digite o numero de contas que deseja cadastrar: ");
        int numeroContas = input.nextInt();
        input.nextLine();
        Conta[] contas = new Conta[numeroContas];

        while(true){
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Imprimir contas");
            System.out.println("5 - Sair");
            int opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    if(numero >= numeroContas){
                        System.out.println("Numero maximo de contas atingido!");
                        break;
                    }
                    System.out.println("Digite o nome do cliente: ");
                    nome = input.nextLine();
                    System.out.println("Digite a agencia do cliente: ");
                    agencia = input.nextInt();
                    System.out.println("Digite o saldo do cliente: ");
                    saldo = input.nextDouble();
                    input.nextLine();
                    contas[numero] = Conta.cria_Conta(nome, agencia, numero, saldo);
                    numero++;
                    break;
                
                case 2:
                    System.out.println("Digite o numero da conta a ser depositado: ");
                    int numeroConta = input.nextInt();
                    input.nextLine();
                    for(int i = 0; i < contas.length; i++){
                        if(contas[i].numero == numeroConta){
                            numeroConta = i;
                            break;
                        }else{
                            System.out.println("Conta nao encontrada!");
                            numeroConta = -1;
                            break;
                        }
                    }
                    if(numeroConta == -1){
                        break;
                    }
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = input.nextDouble();
                    input.nextLine();
                    Conta.depositar(contas[numeroConta], valor);
                    break;
                
                case 3:
                    System.out.println("Digite o numero da conta a ser sacado: ");
                    numeroConta = input.nextInt();
                    input.nextLine();
                    for(int i = 0; i < contas.length; i++){
                        if(contas[i].numero == numeroConta){
                            numeroConta = i;
                            break;
                        }else{
                            System.out.println("Conta nao encontrada!");
                            numeroConta = -1;
                            break;
                        }
                    }
                    if(numeroConta == -1){
                        break;
                    }
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = input.nextDouble();
                    input.nextLine();
                    Conta.sacar(contas[numeroConta], valor);
                    break;
                
                case 4:
                    for(int i = 0; i < contas.length; i++){
                        Conta.imprime_conta(contas[i]);
                    }
                    break;

                case 5:
                    System.exit(0);
                    input.close();
                    break;
            }

        }
    }
}