package br.usjt.PrevisaoTempo.model.repository;

import br.usjt.PrevisaoTempo.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    Cidade findByLatitudeAndLongitude (double latitude, double longitude);

    Cidade findByNome (String nome);

    Cidade findByNomeIgnoreCase (String nome);
}
