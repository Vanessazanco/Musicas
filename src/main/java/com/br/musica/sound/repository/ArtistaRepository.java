package com.br.musica.sound.repository;

import com.br.musica.sound.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArtistaRepository extends JpaRepository <Artista,Long> {

    Optional<Artista> findByNomeContainingIgnoreCase(String nome);
}
