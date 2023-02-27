package br.com.ProjetoLoja.pedido.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class PedidoDTO {

    @NotNull
    private Long id;

    @NotNull
    private BigDecimal ValorTotal;

    @NotNull
    @Length(max = 100)
    private String descricao;

    @NotNull
    @Length(max = 100)
    private LocalDateTime DataCriacao;

    @NotNull
    private LocalDateTime dataAtualizacao;

    @NotNull
    @Length(max = 100)
    private String StatusPedido;
}
