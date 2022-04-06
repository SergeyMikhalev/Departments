import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> departmentsList) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : departmentsList) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";         // тут можно обсудить вопрос эффективности по памяти и по быстродействию
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> departmentsList) {
        Collections.sort(departmentsList);
    }

    public static void sortDesc(List<String> departmentsList) {
        departmentsList.sort(new DepDescComp());
    }
}