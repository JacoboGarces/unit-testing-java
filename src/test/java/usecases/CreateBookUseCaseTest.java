package usecases;

import models.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateBookUseCaseTest {
    CreateBookUseCase useCase = new CreateBookUseCase();

    @Test
    void executeWithDuplicity() {
        Book book = new Book(1, "2", "2");
        var result = useCase.execute(book);

        Assertions.assertNull(result);
    }

    @Test
    void execute() {
        Book book = new Book(11, "2", "2");
        var result = useCase.execute(book);

        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.getId() > 0);
        Assertions.assertEquals(result.getId(), book.getId());
    }
}