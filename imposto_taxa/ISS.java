public class ISS implements ImpostoTaxa {
    @Override
    public String getNome() {
        return "ISS";
    }

    @Override
    public double calcularImpostoTaxa(double valor) {
        // Alíquota de 4,6% para serviços
        return valor * 0.046;
    }
}
