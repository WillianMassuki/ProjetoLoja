package br.com.ProjetoLoja.endereco.factory;

import br.com.ProjetoLoja.cupomProduto.dto.CupomProdutoDTO;
import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.endereco.dto.EnderecoDTO;
import br.com.ProjetoLoja.endereco.model.Endereco;
import org.springframework.stereotype.Component;

@Component
public class EnderecoFactory {

    public Endereco createFrom(EnderecoDTO enderecoDTO)
    {
        return    Endereco.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .bairro(enderecoDTO.getBairro())
                .cep(enderecoDTO.getCep())
                .complemento(enderecoDTO.getComplemento())
                .telefone(enderecoDTO.getTelefone())
                .build();

    }

}
