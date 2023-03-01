package br.com.ProjetoLoja.endereco.service;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.endereco.repository.EnderecoRepository;
import br.com.ProjetoLoja.endereco.vo.EnderecoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public List<EnderecoVO> getAll() {
        return this.enderecoRepository.findAllBy();
    }

    public List<EnderecoVO> detalhar(Long IdCupom) {
        return this.enderecoRepository.findByOne(IdCupom);
    }
}
