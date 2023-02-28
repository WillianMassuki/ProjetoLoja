package br.com.ProjetoLoja.formaPagamento.repository;

import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO( " +
                    " formapagamento.id, " +
                    " formapagamento.NomeCartao, " +
                    " formapagamento.NumeroCartao, " +
                    " formapagamento.CodigoSeguranca " +
                    " formapagamento.bandeira " +
                    ") " +
                    " FROM " +
                    " FormaPagamento formapagamento "
    )
    List<FormaPagamentoVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO( " +
                    " formapagamento.id, " +
                    " formapagamento.NomeCartao, " +
                    " formapagamento.NumeroCartao, " +
                    " formapagamento.CodigoSeguranca " +
                    " formapagamento.bandeira " +
                    ") " +
                    " FROM " +
                    " FormaPagamento formapagamento " +
                    " WHERE " +
                    " formapagamento.id = :idFormaPagamento "
    )
    List<FormaPagamentoVO> findByOne(@Param("idProduto") Long idProduto);
}
