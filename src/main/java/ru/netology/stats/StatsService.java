package ru.netology.stats;

public class StatsService {

    public int sum (int[] months){
        int sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum;
    }

    public int middleSum(int[] months){

        return sum(months) / months.length;
    }

    public int hiMonth(int[] months){
        int max = months[0];
        for (int month : months) {
            if (max < month) max = month;
        }
        return max;
    }

    public int lowMonth(int[] months){
        int min = months[0];
        for (int month : months) {
            if (min > month) min = month;
        }
        return min;
    }

    public int lowerMiddle(int[] months){
        int count = 0;
        for (int month : months) {
            if (month < middleSum(months)) count++;
        }
        return count;
    }

    public int higherMiddle(int[] months){
        int count = 0;
        for (int month : months) {
            if (month < middleSum(months)) count++;
        }
        return count;
    }
}
