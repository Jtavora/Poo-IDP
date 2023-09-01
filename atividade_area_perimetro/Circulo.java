public class Circulo {
    int raio;
    int area;
    int perimetro;

    public static Circulo cria_circulo(int raio) {
        Circulo c = new Circulo();
        c.raio = raio;
        return c;
    }

    public static int calcula_area(Circulo c) {
        c.area = 3 * c.raio * c.raio;
        return c.area;
    }

    public static int calcula_perimetro(Circulo c) {
        c.perimetro = 2 * 3 * c.raio;
        return c.perimetro;
    }

    public static void imprime(Circulo c) {
        System.out.println("Raio: " + c.raio);
        System.out.println("Area: " + c.area);
        System.out.println("Perimetro: " + c.perimetro);
    }
}
