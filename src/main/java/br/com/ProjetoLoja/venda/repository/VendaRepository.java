package br.com.ProjetoLoja.venda.repository;

import br.com.ProjetoLoja.venda.model.Venda;
import br.com.ProjetoLoja.venda.vo.VendaVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendaRepository  extends JpaRepository<Venda, Long> {

    @Query(
            " SELECT " +
                    " new  br.com.ProjetoLoja.venda.vo.VendaVO( " +
                    " venda.id, " +
                    " venda.horario, " +
                    " venda.precoTotal " +
                    ") " +
                    " FROM " +
                    " Venda venda "


    )
    List<VendaVO> findAllBy();

    @Query(
            " SELECT " +
                    " new  br.com.ProjetoLoja.venda.vo.VendaVO( " +
                    " venda.id, " +
                    " venda.horario, " +
                    " venda.precoTotal " +
                    ") " +
                    " FROM " +
                    " Venda venda " +
                    "WHERE " +
                    "venda.id  = :idVenda"
    )
    Optional<VendaVO> findByOne(@Param("idVenda") Long idVenda);


}
