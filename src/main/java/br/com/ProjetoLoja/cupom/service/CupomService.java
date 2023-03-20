package br.com.ProjetoLoja.cupom.service;

import br.com.ProjetoLoja.cupom.dto.CupomDTO;
import br.com.ProjetoLoja.cupom.exception.CupomExistente;
import br.com.ProjetoLoja.cupom.factory.CupomFactory;
import br.com.ProjetoLoja.cupom.repository.CupomRepository;
import br.com.ProjetoLoja.cupom.vo.CupomVO;
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
public class CupomService {

    private final CupomRepository cupomRepository;

    private final CupomFactory cupomFactory;


    public List<CupomVO> getAll() {
        return this.cupomRepository.findAllBy();
    }

    public Optional<CupomVO> detalhar(Long IdCupom) {
        return this.cupomRepository.findByOne(IdCupom);
    }

    public Long salvar(CupomDTO cupomDTO) {

        this.cupomRepository.findByOne(
                cupomDTO.getId()
        ).ifPresent(idCupom -> {
                    throw new CupomExistente(cupomDTO.getId());
                }
        );

        return this.cupomRepository.save(
                this.cupomFactory.createFrom(cupomDTO)
        ).getId();
    }


}
