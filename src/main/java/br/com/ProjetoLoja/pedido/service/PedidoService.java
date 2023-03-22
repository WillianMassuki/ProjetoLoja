package br.com.ProjetoLoja.pedido.service;

import br.com.ProjetoLoja.item.vo.ItemVO;
import br.com.ProjetoLoja.pedido.dto.PedidoDTO;
import br.com.ProjetoLoja.pedido.factory.PedidoFactory;
import br.com.ProjetoLoja.pedido.repository.PedidoRepository;
import br.com.ProjetoLoja.pedido.vo.PedidoVO;
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
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    private final PedidoFactory pedidoFactory;

    public List<PedidoVO> getAll() {
        return this.pedidoRepository.findAllBy();
    }

    public Optional<PedidoVO> detalhar(Long IdCupom) {
        return this.pedidoRepository.findByOne(IdCupom);
    }

    public Long salvar(PedidoDTO pedidoDTO) {

        this.pedidoRepository.findByOne(
                pedidoDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new ProdutoJaExistente(pedidoDTO.getId());
                }
        );

        return this.pedidoRepository.save(
                this.pedidoFactory.createFrom(pedidoDTO)
        ).getId();
    }


}
