package pl.sdaacademy.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("english")
public class EnglishGreetingsApi implements GreetingsApi {
    @Override
    public String greetings() {
        return "Good morning!";
    }
}
