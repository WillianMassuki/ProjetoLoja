package br.com.ProjetoLoja.formaPagamento.dto;

import br.com.ProjetoLoja.enuns.Bandeira;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class AlteracaoFormaPagamentoDTO {

    @NotNull
    @Length(max = 100)
    private String NomeCartao;

    @NotNull
    @Length(max = 100)
    private String NumeroCartao;

    @NotNull
    @Length(max = 100)
    private String CodigoSeguranca;

}
