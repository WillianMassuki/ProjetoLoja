package br.com.ProjetoLoja.endereco.service;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.endereco.dto.EnderecoDTO;
import br.com.ProjetoLoja.endereco.factory.EnderecoFactory;
import br.com.ProjetoLoja.endereco.repository.EnderecoRepository;
import br.com.ProjetoLoja.endereco.vo.EnderecoVO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.exception.ProdutoJaExistente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    private final EnderecoFactory enderecoFactory;

    public List<EnderecoVO> getAll() {
        return this.enderecoRepository.findAllBy();
    }

    public Optional<EnderecoVO> detalhar(Long IdCupom) {
        return this.enderecoRepository.findByOne(IdCupom);
    }

    public Long salvar(EnderecoDTO enderecoDTO) {

        this.enderecoRepository.findByOne(
                enderecoDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new ProdutoJaExistente(enderecoDTO.getId());
                }
        );

        return this.enderecoRepository.save(
                this.enderecoFactory.createFrom(enderecoDTO)
        ).getId();
    }

}
