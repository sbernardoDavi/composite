import java.util.ArrayList;
import java.util.List;

public class Item extends Produto{
    private List<Produto> produtos;
    public Item(String descricao){
        super(descricao);
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public String getProduto(){
        String out = "";
        out = "Item: " +this.getDescricao()+ "\n";
        for (Produto produto : produtos){
            out += produto.getProduto();
        }
        return out;
    }
}
