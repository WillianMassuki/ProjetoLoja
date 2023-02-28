package br.com.ProjetoLoja.cupom.vo;

import br.com.ProjetoLoja.venda.model.Venda;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class CupomVO {

    private final Long id;

    private final String codigoCupom;

    private final BigDecimal precoTotal;

    private final String motivo;

    private final LocalDateTime dataCriacao;

    private final LocalDateTime dataAtualizacao;

    private final boolean aprovado;
}
