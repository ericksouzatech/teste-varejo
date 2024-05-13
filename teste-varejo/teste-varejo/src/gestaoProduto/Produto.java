package gestaoProduto;

public class Produto {
    private String nomeProduto;
    private int codProduto;
    private float valorProduto;

    public Produto(String nomeProduto, int codProduto, float valorProduto){
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.valorProduto = valorProduto;
    }

    public Produto() {

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }



    public String toString(){
        return "[Nome do produto: " + this.nomeProduto + ", Código do produto: " + this.codProduto + ", Valor do produto: " + this.valorProduto + "]";
    }
}
