
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/vod")
public class VodController {

    private final VodService vodService;

    @Autowired
    public VodController(VodService vodService) {
        this.vodService = vodService;
    }

    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public List<Series> getSeries(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String description,
                                  @RequestParam(required = false) Integer seasonNumber,
                                  @RequestParam(required = false) Integer episodeCount,
                                  @RequestParam(required = false) Integer yearOfRelease) {
        return vodService.getSeries(title, description, seasonNumber, episodeCount, yearOfRelease);
    }

    @GetMapping("/{id}")
    public Series getSeriesById(@RequestParam long id) {
        return vodService.getSeriesById(id);
    }

    @DeleteMapping("/{id}")
    public Series deleteSeries(@PathVariable long id) {
        return vodService.deleteSeries(id);
    }

    @PutMapping
    public Series updateSeries(@Validated(UpdateSeries.class) @RequestBody Series series) {
        return vodService.updateSeries(series);
    }

    @PostMapping()
    public Series addSeries(@Validated(AddSeries.class) @RequestBody Series series) {
        return vodService.addSeries(series);
    }
}