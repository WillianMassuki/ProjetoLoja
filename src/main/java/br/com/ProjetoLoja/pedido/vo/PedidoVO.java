package br.com.ProjetoLoja.pedido.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class PedidoVO {

    private final Long id;

    private final BigDecimal ValorTotal;


    private final String descricao;


    private final LocalDateTime DataCriacao;


    private final LocalDateTime dataAtualizacao;

    private final String StatusPedido;
}
