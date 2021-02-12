package ru.netology.statService;

public class StatService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
    public long  calculateAverage(long[] purchases) {
        long calculateAverage = calculateSum(purchases) / purchases.length;
        return calculateAverage;
    }

    public long calculateMax(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }

        long monthNumber = 0;
        long monthMax = 0;
        for (long purchase : purchases) {
            monthNumber++;
            if (purchase == max) {
                monthMax = monthNumber;
            }
        }
        return monthMax;
    }

    public long calculateMin(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        long monthMin = 0;
        long monthNumber = 0;
        for (long purchase : purchases) {
            monthNumber++;
            if (purchase == min) {
                monthMin = monthNumber;
            }
        }
        return monthMin;
    }

    public long calculateBelowAvg(long[] purchases) {
        long monthBelowAverage = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase < average) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
    }

    public long calculateAboveAvg(long[] purchases) {
         long monthAboveAverage = 0;
         long average = calculateAverage(purchases);
         for (long purchase : purchases) {
             if (purchase > average) {
                 monthAboveAverage++;
             }
         }
         return monthAboveAverage;
    }


}
