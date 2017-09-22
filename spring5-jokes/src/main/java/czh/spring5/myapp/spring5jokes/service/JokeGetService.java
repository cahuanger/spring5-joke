package czh.spring5.myapp.spring5jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeGetService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGetService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }

}
