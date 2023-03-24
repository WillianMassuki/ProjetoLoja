package br.com.ProjetoLoja.formaPagamento.controller;

import br.com.ProjetoLoja.endereco.dto.EnderecoDTO;
import br.com.ProjetoLoja.formaPagamento.dto.FormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.service.FormaPagamentoService;
import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/formaPagamento")
@RequiredArgsConstructor
public class FormaPagamentoController {

    private final FormaPagamentoService formaPagamentoService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas as formas de pagamentos existentes")
    public List<FormaPagamentoVO> formasPagamentos() {
        return this.formaPagamentoService.getAll();
    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui uma nova forma de pagamento")
    public ResponseEntity<Long> salvarFormaPagamento(
            @RequestBody FormaPagamentoDTO formaPagamentoDTO
            ) {
        return ResponseEntity.ok(this.formaPagamentoService.salvar(formaPagamentoDTO));
    }



}
