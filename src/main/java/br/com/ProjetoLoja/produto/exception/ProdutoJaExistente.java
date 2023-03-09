package br.com.ProjetoLoja.produto.exception;

public class ProdutoJaExistente  extends RuntimeException {

    public ProdutoJaExistente(Long codigoPrograma) {
        super(
                String.format(
                        " O codigo do Programa: %s já está cadastrado. Por favor, inserir outro para prosseguir.",
                        codigoPrograma
                )
        );
    }
}
