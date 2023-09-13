public class IPI implements ImpostoTaxa {
    @Override
    public String getNome() {
        return "IPI";
    }

    @Override
    public double calcularImpostoTaxa(double valor) {
        // Alíquota de 25% para produtos
        return valor * 0.25;
    }
}
