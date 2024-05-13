package gestaoFornecedor;

public class Fornecedor {

    private String nomeFornecedor;

    private int codFornecedor;

    private String txtFornece;


    public Fornecedor (String nomeFornecedor, int codFornecedor, String Fornece){
        this.nomeFornecedor = nomeFornecedor;
        this.codFornecedor = codFornecedor;
        this.txtFornece = txtFornece;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getTxtFornece() {
        return txtFornece;
    }

    public void setTxtFornece(String txtFornece) {
        this.txtFornece = txtFornece;
    }
}
