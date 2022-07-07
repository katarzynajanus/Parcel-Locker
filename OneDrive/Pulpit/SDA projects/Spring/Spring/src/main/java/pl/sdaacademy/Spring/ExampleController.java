package pl.sdaacademy.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping
    //@ResponseBody //serializacja obiektu na postaÄ‡ json
    public Example example() {
        return new Example("Test", "test....");
    }
}

/*
Napisz metodÄ™, ktĂłra zwrĂłci nam obiekt typu User, gdzie user zawiera imiÄ™ i nazwisko uĹĽytkownika
 */

