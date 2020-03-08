package structures.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Zadanie1 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        //Uzupelnienie listy 20 wylosowanymi elementami z przedzialu <0,10>
        for (int i = 0; i < 20; i++) {
            //losowanie
            int temp = random.nextInt(11);
            //dodanie do listy
            list.add(temp);
        }

        System.out.println(list);

        //Usuwanie elementow z listy w petli

        //Java 7
        /*Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }*/

        //Java 8+
        list.removeIf(el -> el % 2 ==0);

        System.out.println(list);
    }

}
