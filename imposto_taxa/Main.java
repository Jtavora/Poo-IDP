public class Main {
    public static void main(String[] args) {
        // Exemplo de operações comerciais
        OperacaoComercial operacao1 = new OperacaoComercial("Serviço de Consultoria", 1000, new ISS());
        OperacaoComercial operacao2 = new OperacaoComercial("Produto Eletrônico", 500, new ICMS());
        OperacaoComercial operacao3 = new OperacaoComercial("Produto Alimentício", 200, new IPI());

        // Exibindo detalhes das operações
        operacao1.exibirDetalhes();
        operacao2.exibirDetalhes();
        operacao3.exibirDetalhes();
    }
}
