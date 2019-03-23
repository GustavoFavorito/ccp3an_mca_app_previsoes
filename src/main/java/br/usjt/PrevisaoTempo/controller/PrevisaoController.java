package br.usjt.PrevisaoTempo.controller;

import br.usjt.PrevisaoTempo.model.Previsao;
import br.usjt.PrevisaoTempo.model.repository.PrevisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PrevisaoController {

    @Autowired
    private PrevisaoRepository previsoesRepo;

    @GetMapping("/previsoes")
    public ModelAndView listarPrevisoes() {
        ModelAndView mv = new ModelAndView ("listar_previsoes");
        List<Previsao> previsoes = previsoesRepo.findAll();
        mv.addObject("previsoes", previsoes);
        return mv;
    }
}