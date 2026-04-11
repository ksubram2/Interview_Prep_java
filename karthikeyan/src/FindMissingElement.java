import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingElement {

    public static void main(String[] args) {

        int[] array = {1,1,2,2,3,4,5,5,6,7,8,10};

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        Set<Integer> actual = Arrays.stream(array).boxed().collect(Collectors.toSet());
        System.out.println(actual);

        List<Integer> missing = IntStream.rangeClosed(min, max)
                .filter(i -> !actual.contains(i))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(missing);

    }
}
