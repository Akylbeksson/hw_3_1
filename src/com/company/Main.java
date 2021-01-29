package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {1.1, 2.2, -3.3, -4.4, 5.5, 6.6, -7.7, -8.8, 9.9, 0.5, -10.5, 11.5, -12.5, -13.3, 26.2};

        boolean firstNegativeFound = false;
        double sum = 0;
        int totalPositives = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeFound = true;
                continue;
            }
            if (firstNegativeFound && numbers[i] > 0) {
                totalPositives++; /* "++" => totalPositives = totalPositives + 1 */
                sum += numbers[i]; /* "+=" => sum = sum + numbers[i] */

            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of positives after 1st negative: " + sum);
        System.out.println("Number of positives after 1st negative: " + totalPositives);

        System.out.println("Average: " + sum / totalPositives);
    }
}

/*Создать массив дробных (не целых) чисел размером 15 элементов и
наполнить его положительными и отрицательными числами;
Затем через цикл “for each” посчитать среднее арифметическое положительных чисел
расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6) =  11/3 */