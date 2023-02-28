package br.com.ProjetoLoja.pedido.repository;

import br.com.ProjetoLoja.item.vo.ItemVO;
import br.com.ProjetoLoja.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.pedido.vo.PedidoVO( " +
                    " pedido.id, " +
                    " pedido.ValorTotal, " +
                    " pedido.descricao, " +
                    " pedido.DataCriacao, " +
                    " pedido.dataAtualizacao, " +
                    " pedido.StatusPedido " +
                    ") " +
                    " FROM " +
                    " Pedido pedido "
    )
    List<ItemVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.pedido.vo.PedidoVO( " +
                    " pedido.id, " +
                    " pedido.ValorTotal, " +
                    " pedido.descricao, " +
                    " pedido.DataCriacao, " +
                    " pedido.dataAtualizacao, " +
                    " pedido.StatusPedido " +
                    ") " +
                    " FROM " +
                    " Pedido pedido " +
                    " WHERE " +
                    "pedido.id = :IdPedido"
    )
    List<ItemVO> findByOne(@Param("IdPedido") Long IdPedido);
}
