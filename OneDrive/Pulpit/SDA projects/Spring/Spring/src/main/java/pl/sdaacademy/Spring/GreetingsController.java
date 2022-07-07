package pl.sdaacademy.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    @Qualifier("german")
    private GreetingsApi greetingsApi;

    @GetMapping
    public String greetings() {
        return greetingsApi.greetings();
    }
}

