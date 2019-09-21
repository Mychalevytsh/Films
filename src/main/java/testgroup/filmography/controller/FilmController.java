package testgroup.filmography.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmography.model.Film;
import testgroup.filmography.service.FilmService;
import testgroup.filmography.service.FilmServiceImpl;

import java.util.List;

@Controller
public class FilmController {
    private FilmService filmService = new FilmServiceImpl();



    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allFilms() {
        List<Film> films = filmService.allFilms();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("filmsList", films);
        return modelAndView;
    }

    @RequestMapping (value = "/edit" , method = RequestMethod.GET)
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editFilms");

        return modelAndView;
    }
}
