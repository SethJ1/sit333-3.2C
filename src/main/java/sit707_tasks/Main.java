package sit707_tasks;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("Random date: " + date);

        DateUtil.DayClass dayClass = DateUtil.classifyDay(date.getDay());
        DateUtil.MonthClass monthClass = DateUtil.classifyMonth(date.getMonth());
        DateUtil.YearClass yearClass = DateUtil.classifyYear(date.getYear());

        System.out.println("Day Class: " + dayClass);
        System.out.println("Month Class: " + monthClass);
        System.out.println("Year Class: " + yearClass);
    }
}
