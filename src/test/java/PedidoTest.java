import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    
    @Test
    public void deveRetornarNomeProduto(){
        Item item1 = new Item("Produtos promocao");
        
        Item item2 = new Item("Produtos Adidas");
        Conjunto conjunto1 = new Conjunto("conjunto 1", 5);
        item2.adicionarProduto(conjunto1);
        
        Item item3 = new Item("Produtos Puma");
        Conjunto conjunto2 = new Conjunto("conjunto 2", 3);
        Conjunto conjunto3 = new Conjunto("conjunto 3", 2);
        item3.adicionarProduto(conjunto2);
        item3.adicionarProduto(conjunto3);
        
        Item id = new Item("Item 10");
        id.adicionarProduto(item1);
        id.adicionarProduto(item2);
        id.adicionarProduto(item3);
        
        Pedido pedido = new Pedido();
        pedido.setPedido(id);
        
        assertEquals("Item: Item 10\n"+
                "Item: Produtos promocao\n"+
                "Item: Produtos Adidas\n"+
                "Conjunto: conjunto 1, valor: 5.0\n"+
                "Item: Produtos Puma\n"+
                "Conjunto: conjunto 2, valor: 3.0\n"+
                "Conjunto: conjunto 3, valor: 2.0\n", pedido.getNome()
                );

    }

    @Test
    public void deveRetornarExcecaoPedidoSemNome(){
        try{
            Pedido pedido = new Pedido();
            pedido.getNome();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Pedido sem nome", e.getMessage());
        }
    }

}