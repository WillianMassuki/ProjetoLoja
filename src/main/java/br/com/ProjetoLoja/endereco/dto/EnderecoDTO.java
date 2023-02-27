package br.com.ProjetoLoja.endereco.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class EnderecoDTO {

    @NotNull
    private Long id;

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
