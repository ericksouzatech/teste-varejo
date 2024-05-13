package interfaces;

import gestaoFuncionario.Funcionario;
import java.util.List;

public interface RepositorioFuncionario {

    void cadastrar(Funcionario funcionario);

    void remover (int codFuncionario);

    void atualizar(Funcionario funcionario);
    Funcionario procurar(int codFuncionario);

    List<Funcionario> listarFuncionarios();


}

