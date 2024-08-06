package com.gustavolr.ControleFluxo;

/**
 * Classe para exibir mensagem de erro em caso de erro nos parametros
 */
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagemErro) {
        super(mensagemErro);
    }
}
