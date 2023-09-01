public class Quadrado {
    int lado;
    int area;
    int perimetro;

    public static Quadrado cria_quadrado(int lado){
        Quadrado q = new Quadrado();
        q.lado = lado;
        return q;
    }

    public static int calcula_area(Quadrado q){
        q.area = q.lado * q.lado;
        return q.area;
    }

    public static int calcula_perimetro(Quadrado q) {
        q.perimetro = 4 * q.lado;
        return q.perimetro;
    }

    public static void imprime(Quadrado q) {
        System.out.println("Lado: " + q.lado);
        System.out.println("Area: " + q.area);
        System.out.println("Perimetro: " + q.perimetro);
    }
}
