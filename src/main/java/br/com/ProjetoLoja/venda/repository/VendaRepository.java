package br.com.ProjetoLoja.venda.repository;

import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import br.com.ProjetoLoja.venda.model.Venda;
import br.com.ProjetoLoja.venda.vo.VendaVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository  extends JpaRepository<Venda, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.cupom.vo.VendaVO( " +
                    " venda.id, " +
                    " venda.horario, " +
                    " venda.precoTotal, " +
                    " cartao.NomeCartao, " +
                    " cupom.CodigoCupom, " +
                    " cupomproduto.quantidade" +
                    ") " +
                    " FROM " +
                    " Venda venda " +
                    " JOIN " +
                    " venda.cartao cartao " +
                    "JOIN " +
                    " venda.cupom cupom " +
                    " JOIN " +
                    " venda.cupomproduto cupomproduto"
    )
    List<VendaVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.venda.vo.VendaVO( " +
                    " venda.id, " +
                    " venda.horario, " +
                    " venda.precoTotal, " +
                    " cartao.NomeCartao, " +
                    " cupom.CodigoCupom, " +
                    " cupomproduto.quantidade" +
                    ") " +
                    " FROM " +
                    " Venda venda " +
                    " JOIN " +
                    " venda.cartao cartao " +
                    "JOIN " +
                    " venda.cupom cupom " +
                    " JOIN " +
                    " venda.cupomproduto cupomproduto" +
                    "WHERE " +
                    "venda.id  = :idVenda"
    )
    List<VendaVO> findByOne(@Param("idVenda") Long idVenda);


}
