import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListInDescendingOrder {
    public static void main(String[] args) {

        List<Integer> in = Arrays.asList(1,5,4,7);
        List<Integer> fi = in.stream().sorted(Comparator.naturalOrder()).toList();

        System.out.println(fi);

    }
}
