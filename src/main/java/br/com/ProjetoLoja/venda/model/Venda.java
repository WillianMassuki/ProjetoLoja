package br.com.ProjetoLoja.venda.model;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import br.com.ProjetoLoja.produto.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Long id;

    @Column
    private LocalDateTime horario;

    @Column
    private BigDecimal precoTotal;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pagamento")
    private FormaPagamento cartao;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_produto")
    private Produto produto;

    /*
    @OneToOne
    @JoinColumn
    private Cupom cupom;

    @OneToOne
    @JoinColumn
    private CupomProduto cupomproduto;

     */

}
