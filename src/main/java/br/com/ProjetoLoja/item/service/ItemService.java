package br.com.ProjetoLoja.item.service;

import br.com.ProjetoLoja.formaPagamento.dto.FormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.item.dto.ItemDTO;
import br.com.ProjetoLoja.item.factory.ItemFactory;
import br.com.ProjetoLoja.item.repository.ItemRepository;
import br.com.ProjetoLoja.item.vo.ItemVO;
import br.com.ProjetoLoja.produto.exception.ProdutoJaExistente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    private final ItemFactory itemFactory;

    public List<ItemVO> getAll() {
        return this.itemRepository.findAllBy();
    }

    public Optional<ItemVO> detalhar(Long IdCupom) {
        return this.itemRepository.findByOne(IdCupom);
    }

    public Long salvar(ItemDTO itemDTO) {

        this.itemRepository.findByOne(
                itemDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new ProdutoJaExistente(itemDTO.getId());
                }
        );

        return this.itemRepository.save(
                this.itemFactory.createFrom(itemDTO)
        ).getId();
    }



}
