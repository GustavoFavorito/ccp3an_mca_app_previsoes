package br.usjt.PrevisaoTempo.model.repository;

import br.usjt.PrevisaoTempo.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {
    List<Previsao> findAll();
}
