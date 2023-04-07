package br.com.ProjetoLoja.cupom.dto;


import br.com.ProjetoLoja.venda.model.Venda;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CupomDTO {

    @NotNull
    private Long id;

    @NotNull
    @Length(max = 100)
    private String codigoCupom;

    @NotNull
    private Venda pedido;

    @NotNull
    @Length(max = 100)
    private String motivo;

    @NotNull
    private LocalDateTime dataCriacao;

    @NotNull
    private LocalDateTime dataAtualizacao;

   @NotNull
    private boolean aprovado;
}
