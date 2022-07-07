package pl.sdaacademy.Spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final List<Item> items = Arrays.asList(
            new Item(1, "aaa"),
            new Item(2, "xxxx")
    );

    //localhost:8080/item?id=1
/*    @GetMapping
    public Item findById(@RequestParam(required = false, defaultValue = "1") int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .get();
    }*/

    //dla metody addItem napisz mechanizm, który sprawdzi czy opis elementu nie jest pusty i nie jest nullem,
    //jeśli jest wyrzuć wyjątek IllegalArgumentException
    //wyjątek IllegalArgumentException zmapuj na odpowiedź BAD_REQUEST

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        if (item.getDescription() == null || item.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Item description is not valid!");
        }
        Random random = new Random();
        int id = random.nextInt(1000);
        item.setId(id);
        return item;
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<Object> exception(IllegalArgumentException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    //napisz metodę, która będzie odpowiedzialna za wyszukanie obiektów typu Item po opisie lub id
    //jeśli przekazne jest samo description szukaj po description
    //jeśli przekazane jest samo id szukaj po id
    //jeśli przekazane jest id i description szukaj po id i description

    @GetMapping
    //zmieniamy int na Integer bo on od razu przyjmuje null jako domyślny;
    public Item findByIdOrDescription(@RequestParam(required = false, defaultValue = "-1") Integer id, @RequestParam (required = false) String description) {
        if(description == null){
            return items.stream()
                    .filter(item -> item.getId() == id)
                    .findFirst()
                    .get();
        }
        else if(id == -1){
            return items.stream()
                    .filter(item -> item.getDescription().equals(description))
                    .findFirst()
                    .get();
        }
        return items.stream()
                .filter(item -> item.getId() == id)
                .filter(item -> item.getDescription().equals(description))
                .findFirst()
                .get();
    }

    //localhost:8080/item/1
    @GetMapping("/{id}")
    public Item getById(@PathVariable Integer id) {
        return items.stream().filter(item -> item.getId() == id).findFirst().get();
    }

    //napisz metodę, która za pomocą PathVariable zwróci wam obiekt po description

    //Mapowanie wyjątków:
    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<Object> exception(NoSuchElementException exception) {
        return new ResponseEntity<>("No element found", HttpStatus.NOT_FOUND); }

    //localhost:8080/item/desc/xxxx
    @GetMapping("desc/{description}")
  public Item getByDescription(@PathVariable String description){
        return items.stream().filter(item -> item.getDescription().equals(description)).findFirst().get();
  }



}



