import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {


        List<Integer> arr = Arrays.asList(2,4,7,1,7,9,1);

         Integer result = arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();

        System.out.println(result);


    }

}
