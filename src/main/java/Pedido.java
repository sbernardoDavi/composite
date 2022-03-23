public class Pedido {
    private Produto id;

    public void setPedido(Produto id){
        this.id = id;
    }

    public String getNome(){
        if(this.id == null){
            throw new NullPointerException("Pedido sem nome");
        }
        return this.id.getProduto();
    }
}
