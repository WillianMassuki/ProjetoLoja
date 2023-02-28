package br.com.ProjetoLoja.cupom.repository;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.cupom.vo.CupomVO;
import br.com.ProjetoLoja.venda.vo.VendaVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.venda.vo.CupomVO( " +
                    " cupom.id, " +
                    " cupom.codigoCupom, " +
                    " cupom.precoTotal, " +
                    " cupom.motivo, " +
                    " cupom.dataCriacao, " +
                    " cupom.dataAtualizacao," +
                    " cupom.aprovado " +
                    ") " +
                    " FROM " +
                    " Cupom cupom " +
                    " JOIN " +
                    " cupom.pedido pedido "

    )
    List<CupomVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.venda.vo.CupomVO( " +
                    " cupom.id, " +
                    " cupom.codigoCupom, " +
                    " cupom.precoTotal, " +
                    " cupom.motivo, " +
                    " cupom.dataCriacao, " +
                    " cupom.dataAtualizacao," +
                    " cupom.aprovado " +
                    ") " +
                    " FROM " +
                    " Cupom cupom " +
                    " JOIN " +
                    " cupom.pedido pedido " +
                    " WHERE " +
                    "cupom.id = :IdCupom"

    )
    List<CupomVO> findByOne(@Param("IdCupom") Long IdCupom);


}
