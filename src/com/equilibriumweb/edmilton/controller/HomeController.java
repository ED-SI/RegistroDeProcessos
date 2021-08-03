package com.equilibriumweb.edmilton.controller;

import com.equilibriumweb.edmilton.dao.ProcessoDAO;
import com.equilibriumweb.edmilton.model.Processo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public class HomeController {

    @Autowired
    private ProcessoDAO processoDAO;

    @RequestMapping(value="/")
    public ModelAndView listProcessos(ModelAndView model) throws IOException {
        List<Processo> listaProcessos = processoDAO.list();
        model.addObject("listProcesso", listaProcessos);
        model.setViewName("home");

        return model;
    }

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public ModelAndView newProcesso(ModelAndView model) {
        Processo newProcesso = new Processo(1,1.5,"teste");
        model.addObject("contact", newProcesso);
        model.setViewName("ContactForm");
        return model;
    }

    @RequestMapping(value = "/saveProcesso", method = RequestMethod.POST)
    public ModelAndView saveProcesso(@ModelAttribute Processo processo) {
        ProcessoDAO.save(processo);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
    public ModelAndView deleteProcesso(HttpServletRequest request) {
        int processotId = Integer.parseInt(request.getParameter("id"));
        ProcessoDAO.delete(processotId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editProcesso", method = RequestMethod.GET)
    public ModelAndView editProcesso(HttpServletRequest request) {
        int processotId = Integer.parseInt(request.getParameter("id"));
        Processo processo = ProcessoDAO.get(processotId);
        ModelAndView model = new ModelAndView("ContactForm");
        model.addObject("contact", processo);

        return model;
    }
}
