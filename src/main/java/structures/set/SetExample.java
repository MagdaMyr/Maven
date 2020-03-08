package structures.set;

import java.util.*;

public class SetExample {

    //Zbiory nie przechowują duplikatow.
    public static void main(String[] args) {
        //HashSet nie zapamietuje kolejnosci dodawanych elementow.
        Set<String> set = new HashSet<>();

        set.add("Artur");
        set.add("Gabriela");
        set.add("Monika");
        set.add("Karolina");
        set.add("Artur");

        System.out.println(set);

        //LinkedHashSet zapamietuje kolejnosc dodawanych elementow.
        //Mozna podac inny zbior/liste w konstruktorze.
        set = new LinkedHashSet<>(set);

        System.out.println(set);

        //TreeSet pozwala na przejscie po posortowanych elementach.
        set = new TreeSet<>();

        set.add("Beata");
        set.add("Artur");
        set.add("Gabriela");
        set.add("Monika");
        set.add("Karolina");
        set.add("Artur");
        set.add("Cezary");

        System.out.println(set);
    }

}
