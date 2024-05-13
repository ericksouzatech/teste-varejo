package interfaces;

import gestaoFornecedor.Fornecedor;

import java.util.List;

public interface RepositorioFornecedor {

        void adicionar (Fornecedor fornecedor);

        void remover(int codFornecedor);

        void atualizar(Fornecedor fornecedor);
        Fornecedor procurar(int codFornecedor);
        List<Fornecedor> listarFornecedores();
}
