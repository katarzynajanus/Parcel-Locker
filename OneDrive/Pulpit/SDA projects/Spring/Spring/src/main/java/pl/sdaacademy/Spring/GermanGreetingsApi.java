package pl.sdaacademy.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("german")
public class GermanGreetingsApi implements GreetingsApi {

    @Override
    public String greetings() {
        return "Guten tag";
    }
}

