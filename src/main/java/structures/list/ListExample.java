package structures.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        //deklaracja listy
        List<String> list = new ArrayList<>();

        //dodawanie elementów
        list.add("Poniedzialek");
        list.add("Piatek");
        list.add("Sroda");
        list.add("Wtorek");
        list.add("Wtorek");

        //usuwanie
        list.remove("Wtorek");
        list.remove(0);

        //wyświetlenie listy
        System.out.println(list);

        //wyswietlenie rozmiaru listy
        System.out.println(list.size());

        //usuwa wszystkie elementy
        //list.clear();

        System.out.println("fori --------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n for -------------------");

        for(String el : list) {
            System.out.print(el + " ");
        }

        System.out.println("\niterator -------------------------------");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nforEach -------------------------------");

        list.forEach(el -> System.out.print(el + " "));


    }

}
