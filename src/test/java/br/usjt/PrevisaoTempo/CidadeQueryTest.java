package br.usjt.PrevisaoTempo;

import br.usjt.PrevisaoTempo.model.Cidade;
import br.usjt.PrevisaoTempo.model.repository.CidadeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeQueryTest {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Test
    public void findByLatitudeAndLongitude () {
        Cidade cidade = cidadeRepository.findByLatitudeAndLongitude(39, -124);
        System.out.println(cidade.getNome());
    }

    @Test
    public void findByNome () {
        Cidade cidade = cidadeRepository.findByNome("Sao Paulo");
        System.out.print(cidade.getNome());
    }

    @Test
    public void findByNomeIgnoreCase() {
        Cidade cidade = cidadeRepository.findByNomeIgnoreCase("DIADEMA");
        System.out.print(cidade.getNome());
    }
}
