package interfaces;
import gestaoProduto.Produto;

import java.util.List;

public interface RepositorioProduto {
    void inserir(Produto produto);

    void remover(int codProduto);

    Produto procurar(int codProduto);

    List<Produto> listarProdutos();

}
