package br.com.realizecfi.reciclagem.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Message {

    NENHUM_RESULTADO_ENCONTRADO("nenhum.resultado.encontrado"),
    SERVICO_INDISPONIVEL("servico.indisponivel");

    private String message;
}
