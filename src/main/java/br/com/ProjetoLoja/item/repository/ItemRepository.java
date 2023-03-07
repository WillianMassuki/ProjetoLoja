package br.com.ProjetoLoja.item.repository;

import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.item.model.Item;
import br.com.ProjetoLoja.item.vo.ItemVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.item.vo.ItemVO( " +
                    " item.id, " +
                    " item.quantidade, " +
                    " item.precoParcial, " +
                    " produto.descricao, " +
                    " venda.horario " +
                    ") " +
                    " FROM " +
                    " Item item " +
                    " JOIN " +
                    "item.produto produto " +
                    " JOIN " +
                    "item.venda venda "
    )
    List<ItemVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.item.vo.ItemVO( " +
                    " item.id, " +
                    " item.quantidade, " +
                    " item.precoParcial, " +
                    " produto.descricao, " +
                    " venda.horario " +
                    ") " +
                    " FROM " +
                    " Item item " +
                    " JOIN " +
                    "item.produto produto " +
                    " JOIN " +
                    "item.venda venda " +
                    " WHERE " +
                    " item.id = :idItem "
    )
    List<ItemVO> findByOne(@Param("idItem") Long idItem);

}
