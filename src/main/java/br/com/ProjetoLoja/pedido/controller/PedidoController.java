package br.com.ProjetoLoja.pedido.controller;

import br.com.ProjetoLoja.pedido.dto.PedidoDTO;
import br.com.ProjetoLoja.pedido.service.PedidoService;
import br.com.ProjetoLoja.pedido.vo.PedidoVO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/pedido")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;


    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todos os pedidos")
    public List<PedidoVO> pedidos() {
        return this.pedidoService.getAll();
    }


    @GetMapping("{pedidoId}")
    @Operation(summary = "Lista de pedido pelo codigo")
    public ResponseEntity<PedidoVO> detalhar(@PathVariable Long pedidoId)
    {
        return  ResponseEntity.of(this.pedidoService.detalhar(pedidoId));
    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui um novo pedido")
    public ResponseEntity<Long> addPedido(
            @RequestBody PedidoDTO pedidoDTO
    ) {
        return ResponseEntity.ok(this.pedidoService.salvar(pedidoDTO));
    }




}
