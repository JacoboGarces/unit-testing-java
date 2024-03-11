package usecases;

import models.Book;

import java.util.Arrays;
import java.util.List;

public class GetAllBooksUseCase {
    public List<Book> execute() {
        return Arrays.asList(
                new Book(1, "1", "1"),
                new Book(2, "2", "1"),
                new Book(3, "3", "1"),
                new Book(4, "4", "1"),
                new Book(5, "5", "1")
        );
    }
}
