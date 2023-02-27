package br.com.ProjetoLoja.cupom.vo;

import br.com.ProjetoLoja.venda.model.Venda;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class CupomVO {

    private final Long id;

    private final String CodigoCupom;

    private final Venda pedido;

    private final String motivo;

    private final LocalDateTime DataCriacao;

    private final LocalDateTime dataAtualizacao;

    private final boolean aprovado;
}
