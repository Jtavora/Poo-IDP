import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {

    @Test
    public void testCalculaValorTotalSemDesconto() {
        ItemVenda item1 = new ItemVenda("Produto1", 20.0, 2.0);
        ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3.0);

        Venda venda = new Venda("Cliente1");
        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        assertEquals(140.0, venda.calcularValorTotal(), 0.01);
    }

    @Test
    public void testCalculaValorTotalComDesconto() {
        ItemVenda item1 = new ItemVenda("Produto1", 20.0, 2.0);
        ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3.0);

        Venda venda = new Venda("Cliente2");
        venda.adicionarItem(item1);
        venda.adicionarItem(item2);
        venda.setValorDesconto(10.0);

        assertEquals(130.0, venda.calcularValorTotal(), 0.01);
    }

    @Test
    public void testAdicionarItem() {
        ItemVenda item1 = new ItemVenda("Produto1", 20.0, 2.0);

        Venda venda = new Venda("Cliente3");
        venda.adicionarItem(item1);

        assertEquals(1, venda.getItens().size());
    }
}
