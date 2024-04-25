import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Ticket;

public class TicketTest {

    @Test

    public void test() {
        Ticket ticket = new Ticket("Moscow", "New York", 100, 9, 10);

        ticket.getFrom();

        String expected = "Moscow";

        Assertions.assertEquals(expected, ticket.getFrom());
    }
}
