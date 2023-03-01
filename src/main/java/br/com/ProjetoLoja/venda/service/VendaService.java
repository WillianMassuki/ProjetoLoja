package br.com.ProjetoLoja.venda.service;

import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import br.com.ProjetoLoja.venda.repository.VendaRepository;
import br.com.ProjetoLoja.venda.vo.VendaVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VendaService {

    private final VendaRepository vendaRepository;

    public List<VendaVO> getAll() {
        return this.vendaRepository.findAllBy();
    }

    public List<VendaVO> detalhar(Long IdCupom) {
        return this.vendaRepository.findByOne(IdCupom);
    }
}
