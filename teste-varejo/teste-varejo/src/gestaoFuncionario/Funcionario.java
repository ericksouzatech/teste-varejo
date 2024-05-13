package gestaoFuncionario;

public class Funcionario {

    private String nomeFuncionario;
    private int codFuncionario;
    private float salarioFuncionario;

    public Funcionario (String nomeFuncionario, int codFuncionario, float salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.codFuncionario = codFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public float pagar(){
        return this.salarioFuncionario;
    }
    public String getNomeFuncionario() { return nomeFuncionario; }

    public  void setNomeFuncionario(String nomeFuncionario) { this.nomeFuncionario = nomeFuncionario; }

    public int getCodFuncionario() { return codFuncionario; }

    public void setCodFuncionario(int codFuncionario) { this.codFuncionario = codFuncionario; }

    public float getSalarioFuncionario() { return salarioFuncionario; }

    public void setSalarioFuncionario(float salarioFuncionario) { this.salarioFuncionario = salarioFuncionario; }


    public String toString() {
        return "[ Nome do funcionário: " + this.nomeFuncionario + ", Código do funcionário: " + this.codFuncionario +  ", Salário do funcionário: " + this.salarioFuncionario + "]";
    }
}
