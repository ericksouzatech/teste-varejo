package testes;
import gestaoFornecedor.Fornecedor;
import gestaoFuncionario.Funcionario;
import gestaoProduto.Produto;
import interfaces.RepositorioFuncionario;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import repositorios.repositorioProdutos;
import repositorios.repositorioFuncionarios;
import repositorios.repositorioFornecedores;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

//Lista de casos que devemos fazer:
//1 caso de uso: cadastro de produto(inserir produtos)
//2 caso de uso: contabilidade do estoque (listar produtos)
//3 caso de uso: remoção do produto
//4 caso de uso: procurar um determinado produto no estoque
//5 caso de uso: cadastro de funcionario
//6 caso de uso: remoção de funcionario
//7 caso de uso: alterar especificação de funcionario
//8 caso de uso: cadastro de fornecedor
//9 caso de uso: remoção de fornecedor
//10 caso de uso: alterar especificação do fornecedor
//11 caso de uso: realiza venda
//12 caso de uso: realiza pagamento de salario

//Lista de Históricos de Usuários:



public class classeTeste {


    @Test
    public void testeProdutoCadastrado() {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produtoCadastrado = new Produto("Maçã", 001, 5.00f);
        listaProdutos.add(produtoCadastrado);

        assertNotNull(produtoCadastrado, "O produto não existe.");
    }

    @Test
    public void testeRemoverProdutoCadastrado() {
        repositorioProdutos repositorio = new repositorioProdutos();
        Produto produtoCadastrado = new Produto("Maçã", 001, 5.00f);
        repositorio.inserir(produtoCadastrado);
        assertNotNull(repositorio.procurar(001), "O produto não está cadastrado.");

        repositorio.remover(001);
        assertNull(repositorio.procurar(001), "O produto ainda está cadastrado.");
    }



    @Test
    public void testeprocurarDeterminadoProduto() {
        repositorioProdutos repositorio = new repositorioProdutos();
        Produto produtoCadastrado = new Produto("Maçã", 001, 5.00f);
        repositorio.inserir(produtoCadastrado);
        assertNotNull(repositorio.procurar(001), "O produto não está cadastrado.");

        repositorio.procurar(001);
        assertNotNull(repositorio.procurar(001), "Produto não encontrado");
    }

    @Test
    public void TestecadastroFuncionario(){

         repositorioFuncionarios repositorio = new repositorioFuncionarios();

        Funcionario funcionarioCadastrado = new Funcionario("Carlos",1110, 1531);
        repositorio.cadastrar(funcionarioCadastrado);

        assertNotNull(funcionarioCadastrado, "Funcionario inexistente");
    }


        @Test
        public void testeRemocaoFuncionario() {


            repositorioFuncionarios repositorio = new repositorioFuncionarios();

            Funcionario funcionarioCadastrado = new Funcionario("Carlos",1110, 1531);
            repositorio.cadastrar(funcionarioCadastrado);

            repositorio.remover(1110);
            assertNotNull(repositorio.procurar(1110), "O funcionario nao existe mais");

        }



    @Test
    public void testeAtualizarFuncionario(){

        repositorioFuncionarios repositorio = new repositorioFuncionarios();

        Funcionario funcionario = new Funcionario("Clint", 333,2000);

        repositorio.cadastrar(funcionario);

        assertNotNull(repositorio.procurar(333), "Funcionario inexistente");

        Funcionario funcionarioatualizado = new Funcionario("Flintson", 333, 2300);
        repositorio.atualizar(funcionarioatualizado);

        assertEquals("Flintson", repositorio.procurar(333).getNomeFuncionario(),"O funcionario não foi atualizado corretamente");


    }

    @Test
   public void testeCadastroFornecedor(){
        repositorioFornecedores listaFornecedor = new repositorioFornecedores();

        Fornecedor fornecedorProcurado = new Fornecedor("Roberval", 2222,"Carne");
        listaFornecedor.adicionar(fornecedorProcurado);

        assertNotNull(fornecedorProcurado, "Fornecedor inexistente");
    }

    @Test
    public  void testeRemocaoFornecedor(){

        repositorioFornecedores listaFornecedor = new repositorioFornecedores();

        Fornecedor fornecedorCadastrado = new Fornecedor("Roberval", 2222,"Carne");
        listaFornecedor.remover(2222);

        assertNotNull(fornecedorCadastrado, "Fornecedor não existe mais");



    }

    @Test
    public void testeAtualizacaoFornecedor() {

        repositorioFornecedores repositorio = new repositorioFornecedores();

        Fornecedor fornecedor = new Fornecedor("Fornecedor Teste", 1110, "Endereço Teste");

        repositorio.adicionar(fornecedor);

        assertNotNull(repositorio.procurar(1110), "Fornecedor inexistente");

        Fornecedor fornecedorAtualizado = new Fornecedor("Fornecedor Atualizado", 1110, "Endereço Atualizado");
        repositorio.atualizar(fornecedorAtualizado);

        assertEquals("Fornecedor Atualizado", repositorio.procurar(1110).getNomeFornecedor(), "O fornecedor não foi atualizado corretamente.");
    }


    @Test
    public void testeProcurarFornecedor(){

        repositorioFornecedores listaFornecedor = new repositorioFornecedores();

        Fornecedor fornecedorProcurado = new Fornecedor("Roberval", 2222,"Carne");
        listaFornecedor.procurar(2222);
        assertNotNull(fornecedorProcurado,"tá aí");



    }
@Test
    public void testeRealizaçaoVenda(){

            Produto produto = new Produto("Energético Monster Absolut Zero", 1110, 15.31f);

            assertEquals("Energético Monster Absolut Zero", produto.getNomeProduto(), "Nome do produto está incorreto");
            assertEquals(1110, produto.getCodProduto(), "Código do produto está incorreto");
            assertEquals(15.31f, produto.getValorProduto(), "Valor do produto está incorreto");

            produto.setNomeProduto("Produto Alterado");

            assertEquals("Produto Alterado", produto.getNomeProduto(), "Nome do produto não foi alterado corretamente");

    }

@Test
public void testePagamentoSalario(){

            repositorioFuncionarios repositorio = new repositorioFuncionarios();


            Funcionario funcionarioCadastrado = new Funcionario("Carlos",1110, 1531);

            repositorio.cadastrar(funcionarioCadastrado);


            assertNotNull(repositorio.procurar(1110), "Funcionario inexistente");

            float valorPago = funcionarioCadastrado.pagar();
            assertEquals(1531, valorPago, "O valor pago está incorreto.");
        }

}