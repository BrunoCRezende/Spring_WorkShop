package br.com.eteczl.workshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
@GetMapping("/")
    public ModelAndView acesso(){
        ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("home");

    Aluno aluno = new Aluno("Bruno Costa", "Bruno.rezende@etec.sp.gov");

    modelAndView.addObject("primeiroAluno",aluno);
        return modelAndView;
    }
}
