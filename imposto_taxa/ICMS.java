public class ICMS implements ImpostoTaxa {
    @Override
    public String getNome() {
        return "ICMS";
    }

    @Override
    public double calcularImpostoTaxa(double valor) {
        // Alíquota de 17% para produtos e serviços
        return valor * 0.17;
    }
}
