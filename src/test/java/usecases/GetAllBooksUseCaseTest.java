package usecases;

import models.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetAllBooksUseCaseTest {

    @Test
    void execute() {
        GetAllBooksUseCase useCase = new GetAllBooksUseCase();
        final List<Book> books = useCase.execute();

        Assertions.assertTrue(books.size() >= 0);
    }
}