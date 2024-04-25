package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test

    public void testCompareTo1() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        int expected = 1;
        int actual = ticket1.compareTo(ticket2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToMinus1() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        int expected = -1;
        int actual = ticket8.compareTo(ticket5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToEquals() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        int expected = 0;
        int actual = ticket3.compareTo(ticket6);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSearchLowToHighPriceFiveTicket() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("Moscow", "Sochi");
        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testSearchLowToHighPriceOneTicket() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("Berlin", "London");
        Ticket[] expected = {ticket7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testSearchLowToHighPriceNullTicket() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("Amsterdam", "London");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testComparatorMinus1() {
        TicketTimeComparator comparator = new TicketTimeComparator();
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        int expected = -1;
        int actual = comparator.compare(ticket1, ticket2);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testComparator1() {
        TicketTimeComparator comparator = new TicketTimeComparator();
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        int expected = 1;
        int actual = comparator.compare(ticket6, ticket7);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testComparatorEquals() {
        TicketTimeComparator comparator = new TicketTimeComparator();
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12);
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14);
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16);
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 7);
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9);
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10);
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8);

        int expected = 0;
        int actual = comparator.compare(ticket2, ticket7);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSearchLowToHighTimeFiveTicket() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12); //2
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14); //3
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16); //6
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 17); //10
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9); //5
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10); //6
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);  //3
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8); //1

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Moscow", "Sochi", comparator);
        Ticket[] expected = {ticket8, ticket1, ticket2, ticket6, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testSearchLowToHighTimeZeroTicket() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12); //2
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14); //3
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16); //6
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 17); //10
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9); //5
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10); //6
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);  //3
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8); //1

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Moscow", "Berlin", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testSearchLowToHighTimeOneTicket() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Sochi", 200, 10, 12); //2
        Ticket ticket2 = new Ticket("Moscow", "Sochi", 100, 11, 14); //3
        Ticket ticket3 = new Ticket("Moscow", "Tokio", 200, 10, 16); //6
        Ticket ticket4 = new Ticket("Moscow", "Sochi", 400, 7, 17); //10
        Ticket ticket5 = new Ticket("Tokio", "Sochi", 800, 4, 9); //5
        Ticket ticket6 = new Ticket("Moscow", "Sochi", 200, 6, 10); //6
        Ticket ticket7 = new Ticket("Berlin", "London", 300, 15, 18);  //3
        Ticket ticket8 = new Ticket("Moscow", "Sochi", 500, 7, 8); //1

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Berlin", "London", comparator);
        Ticket[] expected = {ticket7};

        Assertions.assertArrayEquals(expected, actual);
    }
}