package br.com.ProjetoLoja.pedido.service;

import br.com.ProjetoLoja.item.vo.ItemVO;
import br.com.ProjetoLoja.pedido.repository.PedidoRepository;
import br.com.ProjetoLoja.pedido.vo.PedidoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;


    public List<PedidoVO> getAll() {
        return this.pedidoRepository.findAllBy();
    }

    public Optional<PedidoVO> detalhar(Long IdCupom) {
        return this.pedidoRepository.findByOne(IdCupom);
    }
}
