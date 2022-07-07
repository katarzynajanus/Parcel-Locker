package pl.sdaacademy.Spring.validation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Book {

    public interface Add{}
    public interface Update{}

    @Id
    private int id;

    public Book() {
    }

    @NotNull(groups = { Add.class })
    @NotBlank(groups = { Add.class})
    @Size(max = 10, message = "Title to long!", groups = {Add.class, Update.class})
    private String title;

    @NotNull(groups = { Add.class })
    @NotBlank(groups = { Add.class})
    @Size(min = 2, groups = {Add.class, Update.class})
    private String description;

    @Min(value = 0, groups = {Add.class, Update.class})
    @Max(value = 100000, groups = {Add.class, Update.class})
    private int numberOfPages;

    public Book(int id, String title, String description, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.numberOfPages = numberOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
