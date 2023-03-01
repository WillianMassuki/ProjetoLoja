package br.com.ProjetoLoja.item.service;

import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.item.repository.ItemRepository;
import br.com.ProjetoLoja.item.vo.ItemVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<ItemVO> getAll() {
        return this.itemRepository.findAllBy();
    }

    public List<ItemVO> detalhar(Long IdCupom) {
        return this.itemRepository.findByOne(IdCupom);
    }


}
