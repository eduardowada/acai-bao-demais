package ecommerce.repository;

import ecommerce.model.Produto;
import java.util.List;

public interface ProdutoRepository {
    void adicionarProduto(Produto produto);
    List<Produto> listarProdutos();
    Produto buscarProdutoPorId(int id);
    void atualizarProduto(Produto produto);
    void deletarProduto(int id);
}
