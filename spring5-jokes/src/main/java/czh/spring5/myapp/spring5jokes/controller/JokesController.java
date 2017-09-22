package czh.spring5.myapp.spring5jokes.controller;

import czh.spring5.myapp.spring5jokes.service.JokeGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeGetService jokeGetService;

    @Autowired
    public JokesController(JokeGetService jokeGetService) {
        this.jokeGetService = jokeGetService;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model) {

        model.addAttribute("jokes", jokeGetService.getJoke());
        return "chucknorris";
    }

}
