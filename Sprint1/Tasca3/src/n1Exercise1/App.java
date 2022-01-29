package n1Exercise1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        for (Month month: months){
            System.out.println(month.getName());
        }

        months.add(7, new Month("August"));
        System.out.println("========================================");


        for (Month month: months){
            System.out.println(month.getName());
        }








    }
}
