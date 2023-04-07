package br.com.ProjetoLoja.formaPagamento.model;

import br.com.ProjetoLoja.enuns.Bandeira;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Long id;

    @Column
    private String nomeCartao;

    @Column
    private String numeroCartao;

    @Column
    private String codigoSeguranca;

    @Column
    @Enumerated(EnumType.STRING)
    private Bandeira bandeira;


}
