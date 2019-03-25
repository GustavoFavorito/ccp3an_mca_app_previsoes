package br.usjt.PrevisaoTempo.controller;

import br.usjt.PrevisaoTempo.model.Previsao;
import br.usjt.PrevisaoTempo.service.PrevisaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PrevisaoController {

//    @Autowired
//    private PrevisaoRepository previsoesRepo;

    @Autowired
    private PrevisaoService previsaoService;

    @GetMapping("/previsoes")
    public ModelAndView listarPrevisoes() {
        // passe o nome da página ao construtor
        ModelAndView mv = new ModelAndView("listar_previsoes");
        // para modelar o formulário
        mv.addObject(new Previsao());
        // Busque a coleção com o service
        List<Previsao> previsoes = previsaoService.listarTodos();
        // adicione a coleção ao objeto ModelAndView
        mv.addObject("previsoes", previsoes);
        // devolva o ModelAndView
        return mv;
    }
    @PostMapping("/previsoes")
    public String salvar(Previsao previsao) {
        //salvando com o service
        previsaoService.salvar(previsao);
        return "redirect:/previsoes";
    }
}