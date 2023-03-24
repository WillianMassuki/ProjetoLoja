package br.com.ProjetoLoja.venda.dto;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import br.com.ProjetoLoja.produto.model.Produto;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class VendaDTO {

    @NotNull
    private Long id;

    @NotNull
    private LocalDateTime horario;

    @NotNull
    private BigDecimal precoTotal;

    @NotNull
    private FormaPagamento cartao;

    @NotNull
    private Produto produto;
/*
    @NotNull
    private Cupom cupom;

    @NotNull
    private CupomProduto cupomproduto;

 */
}
