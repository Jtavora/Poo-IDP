import java.util.Scanner;

public class pratica{

    public static int soma(int a, int b){
        return a+b;
    }

    public static int subtracao(int a, int b){
        return a-b;
    }

    public static int divisao(int a, int b){
        return a/b;
    }

    public static int multiplicacao(int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);

        int a = 0, b = 0;
        
        if(args.length == 2){
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.println("Numero de argumentos obtido!");

        }else{
            System.out.print("Digite o primeiro numero: ");
            a = in.nextInt();

            System.out.print("Digite o segundo numero: ");
            b = in.nextInt();
        }
        
        System.out.println("Digite a operacao: ");
        String op = in.next();
        
        switch(op){
            case "+":
                System.out.println("Resultado: " + soma(a,b));
                break;
            case "-":
                System.out.println("Resultado: " + subtracao(a,b));
                break;
            case "/":
                System.out.println("Resultado: " + divisao(a,b));
                break;
            case "*":
                System.out.println("Resultado: " + multiplicacao(a,b));
                break;
            default:
                System.out.println("Operacao invalida");
        }

        in.close();
    }


}