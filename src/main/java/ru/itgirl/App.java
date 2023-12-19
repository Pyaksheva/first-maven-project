package ru.itgirl;

import java.time.DayOfWeek;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        System.out.println("Введите день недели на английском языке большими буквами");
        Scanner scanner = new Scanner(System.in);
        DayOfWeek day = DayOfWeek.valueOf(scanner.nextLine());
        String translate = null;
        if (day== DayOfWeek.MONDAY) {
            translate = "понедельник";
        } else if (day== DayOfWeek.TUESDAY) {
            translate = "вторник";
        } else if (day== DayOfWeek.WEDNESDAY) {
            translate = "среда";
        } else if (day== DayOfWeek.THURSDAY) {
            translate = "четверг";
        } else if (day== DayOfWeek.FRIDAY) {
            translate = "пятница";
        } else if (day== DayOfWeek.SATURDAY) {
            translate = "суббота";
        } else if (day== DayOfWeek.SUNDAY) {
            translate = "воскресенье";
        } else throw new IllegalArgumentException("Введен некорректный день недели");
        System.out.println(translate);
        return;
    }

}
