import java.util.Comparator;


public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.equals(o2)) return 0;

        String headO1 = (o1.split("/", 2))[0];
        String headO2 = (o2.split("/", 2))[0];

        int result = headO2.compareTo(headO1);

        if (result == 0) {
            result = o1.compareTo(o2);
        }

        return result;
    }
}
