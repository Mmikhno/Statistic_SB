package ru.netology.statistics_SB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativeValueExist() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillons = {-1, 4, 1, 0, 2, 5, 7, 7, 6, 9, 10};
        long expected = 10;

        long actual = service.findMax(incomesInBillons);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxZeroArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 0, 0, 0, 0, 0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-1, -2, -3, -5};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


}

