package br.com.ProjetoLoja.cupomProduto.service;

import br.com.ProjetoLoja.cupom.exception.CupomExistente;
import br.com.ProjetoLoja.cupomProduto.dto.CupomProdutoDTO;
import br.com.ProjetoLoja.cupomProduto.factory.CupomProdutoFactory;
import br.com.ProjetoLoja.cupomProduto.repository.CupomProdutoRepository;
import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CupomProdutoService {

    private final CupomProdutoRepository cupomProdutoRepository;

    private final CupomProdutoFactory cupomProdutoFactory;

    public List<CupomProdutoVO> getAll() {
        return this.cupomProdutoRepository.findAllBy();
    }

    public Optional<CupomProdutoVO> detalhar(Long IdCupom) {
        return this.cupomProdutoRepository.findByOne(IdCupom);
    }


    public Long salvar(CupomProdutoDTO cupomProdutoDTO) {

        this.cupomProdutoRepository.findByOne(
                cupomProdutoDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new CupomExistente(cupomProdutoDTO.getId());
                }
        );

        return this.cupomProdutoRepository.save(
                this.cupomProdutoFactory.createFrom(cupomProdutoDTO)
        ).getId();
    }




}
