import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FlatMap {

    //Flattening a list of lists into a single list

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);
        List<List<Integer>> arr = Arrays.asList(list1, list2);

       /* List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(4, 5));*/

        List<Integer> finalList = arr.stream()
                                     .flatMap(List :: stream)
                                     .collect(Collectors.toList());
        System.out.println(finalList);

        /* Reason : FlatMap flatten the nested streams into one stream then collect*/

    }
}