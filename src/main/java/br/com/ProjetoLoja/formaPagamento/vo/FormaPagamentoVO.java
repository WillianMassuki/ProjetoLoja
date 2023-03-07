package br.com.ProjetoLoja.formaPagamento.vo;

import br.com.ProjetoLoja.enuns.Bandeira;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class FormaPagamentoVO {

    private final Long id;


    private final String NomeCartao;

    private final String NumeroCartao;

    private final String CodigoSeguranca;


}
