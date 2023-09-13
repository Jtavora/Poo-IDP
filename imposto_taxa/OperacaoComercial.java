public class OperacaoComercial {
    private String descricao;
    private double valor;
    private ImpostoTaxa impostoTaxa;

    public OperacaoComercial(String descricao, double valor, ImpostoTaxa impostoTaxa) {
        this.descricao = descricao;
        this.valor = valor;
        this.impostoTaxa = impostoTaxa;
    }

    public double calcularTotal() {
        double impostoTaxaValor = impostoTaxa.calcularImpostoTaxa(valor);
        return valor + impostoTaxaValor;
    }

    public void exibirDetalhes() {
        double impostoTaxaValor = impostoTaxa.calcularImpostoTaxa(valor);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço original do item: R$" + valor);
        System.out.println("Imposto/Taxa (" + impostoTaxa.getNome() + "): R$" + impostoTaxaValor);
        System.out.println("Valor total: R$" + calcularTotal());
        System.out.println();
    }
}
