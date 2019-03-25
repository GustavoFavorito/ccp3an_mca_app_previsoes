package br.usjt.PrevisaoTempo.service;

import br.usjt.PrevisaoTempo.model.Previsao;
import br.usjt.PrevisaoTempo.model.repository.PrevisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrevisaoService {
    @Autowired
    private PrevisaoRepository previsaoRepo;

    public void salvar (Previsao previsao){
        previsaoRepo.save(previsao);
    }

    public List <Previsao> listarTodos (){
        return previsaoRepo.findAll();
    }
}