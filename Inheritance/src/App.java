

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String[] args) throws Exception {
        System.out.println("Furssah");

        Employee noura = new Employee("faten", "computer",2000);

        System.out.println(noura);

        Manager fares = new Manager("Fares", "HR", 4000, 15);

        System.out.println(fares);

        Director haya = new Director("haya", "Director", 2000);

        System.out.println(haya);
        String[ ] skills = {"java", "c++"};

        SalesPerson fay = new SalesPerson("fay", "sales", 1000, 50);

        System.out.println(fay);

    }
}