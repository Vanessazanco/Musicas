package com.br.musica.sound.service;

public interface ICnverteDados {
        <T> T  obterDados(String json, Class<T> classe);
}
