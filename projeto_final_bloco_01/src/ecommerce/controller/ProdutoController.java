package ecommerce.controller;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoController implements ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso! ID: " + produto.getId());
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtos;
    }

    @Override
    public Produto buscarProdutoPorId(int id) {
        Optional<Produto> produto = produtos.stream().filter(p -> p.getId() == id).findFirst();
        return produto.orElse(null);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        int index = -1;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == produto.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            produtos.set(index, produto);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    @Override
    public void deletarProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto deletado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}
