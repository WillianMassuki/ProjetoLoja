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
                .valorTotal(pedidoDTO.getValorTotal())
                .descricao(pedidoDTO.getDescricao())
                .dataCriacao(pedidoDTO.getDataCriacao())
                .dataAtualizacao(pedidoDTO.getDataAtualizacao())
                .statusPedido(pedidoDTO.getStatusPedido())
                .build();

    }
}
