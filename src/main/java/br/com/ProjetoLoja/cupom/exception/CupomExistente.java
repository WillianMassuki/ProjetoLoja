package br.com.ProjetoLoja.cupom.exception;

public class CupomExistente
        extends RuntimeException {

    public CupomExistente(Long codigoCupom) {
        super(
                String.format(
                        " O codigo do cupom: %s já está cadastrado. Por favor, inserir outro para prosseguir.",
                        + codigoCupom
                )
        );
    }
}
