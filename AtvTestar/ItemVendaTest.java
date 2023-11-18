import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemVendaTest {

    @Test
    public void testCalculaSubtotal() {
        ItemVenda item = new ItemVenda("Produto3", 25.0, 4.0);

        assertEquals(100.0, item.calcularSubtotal(), 0.01);
    }

    @Test
    public void testDescricaoItem() {
        ItemVenda item = new ItemVenda("Produto4", 30.0, 2.0);

        assertEquals("Produto4", item.getDescricao());
    }

    @Test
    public void testQuantidadeItem() {
        ItemVenda item = new ItemVenda("Produto5", 15.0, 3.0);

        assertEquals(3.0, item.getQuantidade(), 0.01);
    }
}
