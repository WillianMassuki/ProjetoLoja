package br.com.ProjetoLoja.pedido.repository;

import br.com.ProjetoLoja.item.vo.ItemVO;
import br.com.ProjetoLoja.pedido.model.Pedido;
import br.com.ProjetoLoja.pedido.vo.PedidoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.pedido.vo.PedidoVO( " +
                    " pedido.id, " +
                    " pedido.valorTotal, " +
                    " pedido.descricao, " +
                    " pedido.dataCriacao, " +
                    " pedido.dataAtualizacao, " +
                    " pedido.statusPedido " +
                    ") " +
                    " FROM " +
                    " Pedido pedido "
    )
    List<PedidoVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.pedido.vo.PedidoVO( " +
                    " pedido.id, " +
                    " pedido.valorTotal, " +
                    " pedido.descricao, " +
                    " pedido.dataCriacao, " +
                    " pedido.dataAtualizacao, " +
                    " pedido.statusPedido " +
                    ") " +
                    " FROM " +
                    " Pedido pedido " +
                    " WHERE " +
                    "pedido.id = :IdPedido"
    )
    Optional<PedidoVO> findByOne(@Param("IdPedido") Long IdPedido);
}
