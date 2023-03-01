package br.com.ProjetoLoja.cupom.service;

import br.com.ProjetoLoja.cupom.repository.CupomRepository;
import br.com.ProjetoLoja.cupom.vo.CupomVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CupomService {

    private final CupomRepository cupomRepository;

    public List<CupomVO> getAll() {
        return this.cupomRepository.findAllBy();
    }

    public List<CupomVO> detalhar(Long IdCupom) {
        return this.cupomRepository.findByOne(IdCupom);
    }

}
