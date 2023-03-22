package br.com.ProjetoLoja.item.factory;

import br.com.ProjetoLoja.formaPagamento.dto.FormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import br.com.ProjetoLoja.item.dto.ItemDTO;
import br.com.ProjetoLoja.item.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemFactory {

    public Item createFrom(ItemDTO itemDTO)
    {
        return    Item.builder()
                .quantidade(itemDTO.getQuantidade())
                .precoParcial(itemDTO.getPrecoParcial())
                .produto(itemDTO.getProduto())
                .venda(itemDTO.getVenda())
                .build();

    }
}
