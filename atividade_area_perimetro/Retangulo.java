public class Retangulo {
    int base;
    int altura;
    int area;
    int perimetro;
    
    public static Retangulo cria_retangulo(int base, int altura) {
        Retangulo r = new Retangulo();
        r.base = base;
        r.altura = altura;
        return r;
    }

    public static int calcula_area(Retangulo r) {
        r.area = r.base * r.altura;
        return r.area;
    }

    public static int calcula_perimetro(Retangulo r) {
        r.perimetro = 2 * (r.base + r.altura);
        return r.perimetro;
    }

    public static void imprime(Retangulo r) {
        System.out.println("Base: " + r.base);
        System.out.println("Altura: " + r.altura);
        System.out.println("Area: " + r.area);
        System.out.println("Perimetro: " + r.perimetro);
    }
}
