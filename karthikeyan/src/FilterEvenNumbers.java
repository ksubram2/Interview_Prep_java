import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        List<Integer> evenNumbers = list.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
    }
}
