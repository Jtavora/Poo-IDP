import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double valorVenda;
    private double valorDesconto;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0.0;

        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }

        total -= valorDesconto;

        return total;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }
}
