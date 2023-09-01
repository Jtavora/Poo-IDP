public class Triangulo {
    int base;
    int altura;
    int area;
    int perimetro;
    
    public static Triangulo cria_triangulo(int base, int altura) {
        Triangulo t = new Triangulo();
        t.base = base;
        t.altura = altura;
        return t;
    }

    public static int calcula_area(Triangulo t) {
        t.area = (t.base * t.altura) / 2;
        return t.area;
    }

    public static int calcula_perimetro(Triangulo t) {
        t.perimetro = 3 * t.base;
        return t.perimetro;
    }

    public static void imprime(Triangulo t) {
        System.out.println("Base: " + t.base);
        System.out.println("Altura: " + t.altura);
        System.out.println("Area: " + t.area);
        System.out.println("Perimetro: " + t.perimetro);
    }
}
