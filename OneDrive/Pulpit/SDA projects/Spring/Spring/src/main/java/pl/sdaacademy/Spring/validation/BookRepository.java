package pl.sdaacademy.Spring.validation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitle(String title);
    List<Book> findByNumberOfPages(int numberOfPages);
    List<Book> findByNumberOfPagesAndTitle(String numberOfPages, String title);
}


