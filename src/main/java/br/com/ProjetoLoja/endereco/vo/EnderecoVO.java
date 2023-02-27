package br.com.ProjetoLoja.endereco.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class EnderecoVO {


    private final Long id;

    private final String rua;

    private final Short numero;

    private final String bairro;

    private final String cep;

    private final String complemento;

    private final String telefone;
}
