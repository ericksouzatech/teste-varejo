package repositorios;

import gestaoFornecedor.Fornecedor;
import interfaces.RepositorioFornecedor;

import java.util.ArrayList;
import java.util.List;

public class repositorioFornecedores implements RepositorioFornecedor {

    List<Fornecedor> fornecedores = new ArrayList<>();

    @Override
    public void adicionar(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    @Override
    public void remover (int codFornecedor) {
        int posicao = -1;
        for (Fornecedor r : fornecedores){
            if(r.getCodFornecedor() == codFornecedor){
                posicao = fornecedores.indexOf(r);
                break;
            }
        }
    }


@Override
public void atualizar(Fornecedor fornecedorAtualizado){
        for(int i = 0; i< fornecedores.size();i++){
            if (fornecedores.get(i).getCodFornecedor() == fornecedorAtualizado.getCodFornecedor()){
                fornecedores.set(i, fornecedorAtualizado);
                break;
            }
        }
}
    @Override
    public  Fornecedor procurar (int codFornecedor) {
        Fornecedor fornecedorProcurado = null;
        for (Fornecedor r : fornecedores){
            if(r.getCodFornecedor() == codFornecedor){
                fornecedorProcurado = r;
            }
        }

        return fornecedorProcurado;
    }



    @Override
    public List<Fornecedor> listarFornecedores() {

        return this.fornecedores;

    }


}
