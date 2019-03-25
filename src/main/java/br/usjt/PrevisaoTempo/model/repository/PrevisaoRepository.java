package br.usjt.PrevisaoTempo.model.repository;

import br.usjt.PrevisaoTempo.model.Previsao;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {
    List<Previsao> findAll();
}
