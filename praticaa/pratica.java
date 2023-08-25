import java.util.Scanner;

public class pratica{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite seu primeiro nome: ");
        String nome = in.nextLine();

        System.out.print("Digite seu segundo nome: ");
        String nome2 = in.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();    
        
        System.out.println();

        System.out.println(nome + " " + nome2);
        System.out.println(nome);
        System.out.println(idade);

        System.out.println();

        for(int i = 0; 3 > i; i++){
            System.out.print(nome.charAt(i));
        }

        in.close();
    }

}