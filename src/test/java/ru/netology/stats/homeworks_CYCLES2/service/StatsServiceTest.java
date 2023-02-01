package ru.netology.stats.homeworks_CYCLES2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findSumAllSales() {
        StatsService service = new StatsService();
        int[] arrayStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumAllSales = 180;
        int actual = service.sumAmount(arrayStatistics);

        Assertions.assertEquals(expectedSumAllSales, actual);
    }

    @Test
    public void findAverageSumSalesMonth() {
        StatsService service = new StatsService();
        int[] arrayStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actual = service.averageSumMount(arrayStatistics);

        Assertions.assertEquals(expectedAverageSum, actual);
    }

    @Test
    public void findMonthMaxSumSales() {
        StatsService service = new StatsService();
        int[] arrayStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMaxSumSales = 8;
        int actual = service.monthMaxSumSales(arrayStatistics);

        Assertions.assertEquals(expectedMonthMaxSumSales, actual);
    }

    @Test
    public void findMonthMinSumSales() {
        StatsService service = new StatsService();
        int[] arrayStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMinSumSales = 9;
        int actual = service.monthMinSumSales(arrayStatistics);

        Assertions.assertEquals(expectedMonthMinSumSales, actual);
    }

    @Test
    public void findMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] arrayStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsSalesBelowAverage = 5;
        int actual = service.monthsSalesBelowAverage(arrayStatistics);

        Assertions.assertEquals(expectedMonthsSalesBelowAverage, actual);
    }

    @Test
    public void findMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] arrayStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsSalesAboveAverage = 5;
        int actual = service.monthsSalesAboveAverage(arrayStatistics);

        Assertions.assertEquals(expectedMonthsSalesAboveAverage, actual);
    }
}
