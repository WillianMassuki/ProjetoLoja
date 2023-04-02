package br.com.ProjetoLoja.endereco.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class AlteracaoEnderecoDTO {

    @NotNull
    @Length(max = 100)
    private String rua;

    @NotNull
    private Short numero;

    @NotNull
    @Length(max = 100)
    private String bairro;

    @NotNull
    @Length(max = 100)
    private String cep;

    @NotNull
    @Length(max = 100)
    private String complemento;

    @NotNull
    @Length(max = 100)
    private String telefone;
}
