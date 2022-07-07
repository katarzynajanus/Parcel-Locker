package pl.sdaacademy.Spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public User getFullName() {
        return new User("Piotr", "Brzozowski");
    }

    //@RequestMapping(value = "/full", method = RequestMethod.GET)
    @GetMapping("/full")
    public String getFullName1() {
        return "Piotr Brzozowski";
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return user;
    }


}


//napisz metodÄ™ POST, ktĂłra przyjmie jako ciaĹ‚o obiekt Item (pola id, description),
// gdzie w ramach metody zostanie wygenerowane id (wartoĹ›Ä‡ w przedziale 1 do 1000)
//zwrĂłÄ‡ obiekt item. Do metody przekaĹĽ obiekte Item z polem description
