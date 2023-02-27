package br.com.ProjetoLoja.venda.vo;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class VendaVO {

    private final Long id;

    private final LocalDateTime horario;

    private final BigDecimal precoTotal;

    private final FormaPagamento cartao;

    private final Cupom cupom;

    private final CupomProduto cupomproduto;
}
