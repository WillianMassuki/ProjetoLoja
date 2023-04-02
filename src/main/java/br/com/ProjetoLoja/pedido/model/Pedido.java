package br.com.ProjetoLoja.pedido.model;

import br.com.ProjetoLoja.venda.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
