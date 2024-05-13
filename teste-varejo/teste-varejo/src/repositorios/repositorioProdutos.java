package repositorios;

import gestaoProduto.Produto;
import interfaces.RepositorioProduto;

import java.util.ArrayList;
import java.util.List;

public class repositorioProdutos implements RepositorioProduto {
    List<Produto> produtos = new ArrayList<>();

    @Override
    public void inserir(Produto produto) {

        produtos.add(produto);

    }

    @Override
    public void remover(int codProduto) {
        int posicao = -1;
        for(Produto p : produtos){
            if(p.getCodProduto() == codProduto){
                posicao = produtos.indexOf(p);
                break;
            }
        }

        if(posicao != -1){
            produtos.remove(posicao);
        }
    }

    @Override
    public Produto procurar(int codProduto) {
        Produto produtoProcurado = null;
        for (Produto p : produtos){
            if(p.getCodProduto() == codProduto){
                produtoProcurado = p;
            }
        }

        return produtoProcurado;
    }



    @Override
    public List<Produto> listarProdutos() {
        return this.produtos;
    }
}




