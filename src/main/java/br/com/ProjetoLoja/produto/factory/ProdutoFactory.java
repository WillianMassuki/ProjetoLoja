package br.com.ProjetoLoja.produto.factory;

import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoFactory {

    public Produto createFrom(ProdutoDTO produtoDTO)
    {
    return    Produto.builder()
                .descricao(produtoDTO.getDescricao())
                .preco(produtoDTO.getPreco())
                .quantidade(produtoDTO.getQuantidade())
                .fabricante(produtoDTO.getFabricante())
                .build();

    }
}
