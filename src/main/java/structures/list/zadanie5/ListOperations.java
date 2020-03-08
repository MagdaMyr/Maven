package structures.list.zadanie5;

import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {

    /*public static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }*/

    public static List<String> removeDuplicates(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
