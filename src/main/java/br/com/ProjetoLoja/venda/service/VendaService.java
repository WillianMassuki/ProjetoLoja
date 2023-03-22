package br.com.ProjetoLoja.venda.service;

import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.exception.ProdutoJaExistente;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import br.com.ProjetoLoja.venda.dto.VendaDTO;
import br.com.ProjetoLoja.venda.factory.VendaFactory;
import br.com.ProjetoLoja.venda.repository.VendaRepository;
import br.com.ProjetoLoja.venda.vo.VendaVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class VendaService {

    private final VendaRepository vendaRepository;

    private final VendaFactory vendaFactory;

    public List<VendaVO> getAll() {
        return this.vendaRepository.findAllBy();
    }

    public Optional<VendaVO> detalhar(Long IdCupom) {
        return this.vendaRepository.findByOne(IdCupom);
    }

    public Long salvar(VendaDTO vendaDTO) {

        this.vendaRepository.findByOne(
                vendaDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new ProdutoJaExistente(vendaDTO.getId());
                }
        );

        return this.vendaRepository.save(
                this.vendaFactory.createFrom(vendaDTO)
        ).getId();
    }
}
