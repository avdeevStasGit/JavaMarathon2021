package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lada");
        list.add("Renault");
        list.add("Wolkswagen");
        list.add("Scoda");
        list.add("Porshe");

        System.out.println(list);

        list.add(2, "Ferrari");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
