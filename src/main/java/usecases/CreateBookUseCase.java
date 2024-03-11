package usecases;

import models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateBookUseCase {
    private List<Book> books = new ArrayList<>();

    public Book execute(Book book) {
        books.add(new Book(1, "1", "1"));
        var occurrence = books.stream().filter((Book _book) -> _book.getId() == book.getId()).findFirst();
        if (occurrence.isPresent()) {
            return null;
        }

        books.add(book);
        return book;
    }
}
