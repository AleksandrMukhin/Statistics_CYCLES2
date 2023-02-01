package ru.netology.stats.homeworks_CYCLES2.service;

public class StatsService {

    public int sumAmount(int[] sales) {
        int allAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            allAmount = allAmount + sales[i];
        }
        return allAmount;
    }

    public int averageSumMount(int[] averageSum) {
        int average = 0;
        int allAmount = 0;

        for (int i = 0; i < averageSum.length; i++) {
            allAmount = allAmount + averageSum[i];
        }
        average = allAmount / averageSum.length;
        return average;
    }

    public int monthMaxSumSales(int[] maxSumSalesInMonth) {
        int maxMonth = 0;

        for (int i = 0; i < maxSumSalesInMonth.length; i++) {
            if (maxSumSalesInMonth[i] >= maxSumSalesInMonth[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSumSales(int[] minSumSalesInMonth) {
        int minMonth = 0;

        for (int i = 0; i < minSumSalesInMonth.length; i++) {
            if (minSumSalesInMonth[i] <= minSumSalesInMonth[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsSalesBelowAverage(int[] monthsSalesBelowAverage) {
        int average = averageSumMount(monthsSalesBelowAverage);
        int belowAverage = 0;

        for (int i = 0; i < monthsSalesBelowAverage.length; i++) {
            if (monthsSalesBelowAverage[i] < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int monthsSalesAboveAverage(int[] monthsSalesAboveAverage) {
        int average = averageSumMount(monthsSalesAboveAverage);
        int aboveAverage = 0;

        for (int i = 0; i < monthsSalesAboveAverage.length; i++) {
            if (monthsSalesAboveAverage[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}



























