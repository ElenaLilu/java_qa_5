package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдых
                money = money - expenses;
                money = money / 3;
                count++;

            } else {
                // работа
                money = money + income;
                money = money - expenses;


            }


        }
        return count;
    }


}