package repositorios;

import gestaoFuncionario.Funcionario;
import interfaces.RepositorioFuncionario;

import java.util.ArrayList;
import java.util.List;

public class repositorioFuncionarios implements RepositorioFuncionario {

    List<Funcionario> funcionarios = new ArrayList<>();


    @Override
    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public Funcionario procurar(int codFuncionario) {
        Funcionario funcionarioProcurado = null;
        for (Funcionario f : funcionarios) {
            if (f.getCodFuncionario() == codFuncionario) {
                funcionarioProcurado = f;
            }
        }

        return funcionarioProcurado;
    }


    @Override
    public void remover(int codFuncionario) {
        int posicao = -1;
        for (Funcionario f : funcionarios) {
            if (f.getCodFuncionario() == codFuncionario) {
                posicao = listarFuncionarios().indexOf(f);
                break;
            }
        }
    }

    @Override
    public void atualizar(Funcionario funcionarioatualizado) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getCodFuncionario() == funcionarioatualizado.getCodFuncionario()) {
                funcionarios.set(i, funcionarioatualizado);
                break;
            }
        }
    }


    @Override
    public List<Funcionario> listarFuncionarios() {
        return this.funcionarios;
    }

}