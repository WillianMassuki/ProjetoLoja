package br.com.ProjetoLoja.venda.factory;

import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.model.Produto;
import br.com.ProjetoLoja.venda.dto.VendaDTO;
import br.com.ProjetoLoja.venda.model.Venda;
import org.springframework.stereotype.Component;

@Component
public class VendaFactory {

    public Venda createFrom(VendaDTO vendaDTO)
    {
        return    Venda.builder()
                .horario(vendaDTO.getHorario())
                .precoTotal(vendaDTO.getPrecoTotal())
                .cartao(vendaDTO.getCartao())
                .cupom(vendaDTO.getCupom())
                .cupomproduto(vendaDTO.getCupomproduto())
                .build();

    }
}
