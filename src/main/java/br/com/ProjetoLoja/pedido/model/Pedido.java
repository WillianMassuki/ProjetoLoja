package br.com.ProjetoLoja.pedido.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private BigDecimal ValorTotal;

    @Column
    private String descricao;

    @Column
    private LocalDateTime DataCriacao;

    @Column
    private LocalDateTime dataAtualizacao;

    @Column
    private String StatusPedido;
}
