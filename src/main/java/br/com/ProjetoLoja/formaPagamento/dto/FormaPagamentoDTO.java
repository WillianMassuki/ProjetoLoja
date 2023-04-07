package br.com.ProjetoLoja.formaPagamento.dto;

import br.com.ProjetoLoja.enuns.Bandeira;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class FormaPagamentoDTO {

    @NotNull
    private Long id;

    @NotNull
    @Length(max = 100)
    private String nomeCartao;

    @NotNull
    @Length(max = 100)
    private String numeroCartao;

    @NotNull
    @Length(max = 100)
    private String codigoSeguranca;

    @NotNull
    private Bandeira bandeira;
}
