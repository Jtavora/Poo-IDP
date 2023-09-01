import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1 - Triangulo");
            System.out.println("2 - Circulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Retangulo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            System.out.println();

            switch(opcao){
                case 1:
                    System.out.print("Digite a base do triangulo:");
                    int base = scanner.nextInt();
                    System.out.print("Digite a altura do triangulo:");
                    int altura = scanner.nextInt();
                    Triangulo t = Triangulo.cria_triangulo(base, altura);
                    Triangulo.calcula_area(t);
                    Triangulo.calcula_perimetro(t);
                    Triangulo.imprime(t);
                    System.out.println();
                    break;
                
                case 2:
                    System.out.print("Digite o raio do circulo:");
                    int raio = scanner.nextInt();
                    Circulo c = Circulo.cria_circulo(raio);
                    Circulo.calcula_area(c);
                    Circulo.calcula_perimetro(c);
                    Circulo.imprime(c);
                    System.out.println();
                    break;
                
                case 3:
                    System.out.print("Digite o lado do quadrado:");
                    int lado = scanner.nextInt();
                    Quadrado q = Quadrado.cria_quadrado(lado);
                    Quadrado.calcula_area(q);
                    Quadrado.calcula_perimetro(q);
                    Quadrado.imprime(q);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Digite a base do retangulo:");
                    int base1 = scanner.nextInt();
                    System.out.print("Digite a altura do retangulo:");
                    int altura2 = scanner.nextInt();
                    Retangulo r = new Retangulo();
                    Retangulo.cria_retangulo(base1, altura2);
                    Retangulo.calcula_area(r);
                    Retangulo.calcula_perimetro(r);
                    Retangulo.imprime(r);
                    System.out.println();
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }


}