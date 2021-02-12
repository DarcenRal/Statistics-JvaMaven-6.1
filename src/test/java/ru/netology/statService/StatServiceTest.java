package ru.netology.statService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void calculateSum() {
        StatService service =new StatService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateAverage() {
        StatService service =new StatService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateMax() {
        StatService service =new StatService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateMax(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateMin() {
        StatService service =new StatService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calculateMin(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateBelowAvg() {
        StatService service =new StatService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateBelowAvg(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateAboveAvg() {
        StatService service =new StatService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateAboveAvg(purchases);
        assertEquals(expected, actual);
    }

}