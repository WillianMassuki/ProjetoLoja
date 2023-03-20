package br.com.ProjetoLoja.cupom.repository;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.cupom.vo.CupomVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.cupom.vo.CupomVO( " +
                    " cupom.id," +
                    " cupom.codigoCupom, " +
                    " cupom.motivo, " +
                    " cupom.dataCriacao, " +
                    " cupom.dataAtualizacao," +
                    " cupom.aprovado " +
                    ") " +
                    " FROM " +
                    " Cupom cupom "
    )
    List<CupomVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.cupom.vo.CupomVO( " +
                    " cupom.id," +
                    " cupom.codigoCupom, " +
                    " cupom.motivo, " +
                    " cupom.dataCriacao, " +
                    " cupom.dataAtualizacao," +
                    " cupom.aprovado " +
                    ") " +
                    " FROM " +
                    " Cupom cupom " +
                    " WHERE " +
                    "cupom.id = :IdCupom"

    )
    Optional<CupomVO> findByOne(@Param("IdCupom") Long IdCupom);
}
