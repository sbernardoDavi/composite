public class Conjunto extends Produto{

    private float valor;

    public Conjunto(String nome, float valor){
        super(nome);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public Conjunto setValor(float valor) {
        this.valor = valor;
        return this;
    }

    public String getProduto(){
        return "Conjunto: " +this.getDescricao()+ ", valor: "+this.valor+ "\n";
    }
}
