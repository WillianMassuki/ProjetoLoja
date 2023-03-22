package br.com.ProjetoLoja.pedido.factory;

import br.com.ProjetoLoja.item.dto.ItemDTO;
import br.com.ProjetoLoja.item.model.Item;
import br.com.ProjetoLoja.pedido.dto.PedidoDTO;
import br.com.ProjetoLoja.pedido.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class PedidoFactory {

    public Pedido createFrom(PedidoDTO  pedidoDTO)
    {
        return    Pedido.builder()
                .ValorTotal(pedidoDTO.getValorTotal())
                .descricao(pedidoDTO.getDescricao())
                .DataCriacao(pedidoDTO.getDataCriacao())
                .dataAtualizacao(pedidoDTO.getDataAtualizacao())
                .StatusPedido(pedidoDTO.getStatusPedido())
                .build();

    }
}
