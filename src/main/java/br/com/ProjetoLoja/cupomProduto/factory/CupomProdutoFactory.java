package br.com.ProjetoLoja.cupomProduto.factory;

import br.com.ProjetoLoja.cupomProduto.dto.CupomProdutoDTO;
import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class CupomProdutoFactory {

    public CupomProduto createFrom(CupomProdutoDTO cupomProdutoDTO)
    {
        return    CupomProduto.builder()
                .produto(cupomProdutoDTO.getProduto())
                .cupom(cupomProdutoDTO.getCupom())
                .quantidade(cupomProdutoDTO.getQuantidade())
                .precoparcial(cupomProdutoDTO.getPrecoparcial())
                .DataCriacao(cupomProdutoDTO.getDataCriacao())
                .dataAtualizacao(cupomProdutoDTO.getDataAtualizacao())
                .build();

    }
}
