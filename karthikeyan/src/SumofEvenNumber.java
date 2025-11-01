import java.util.List;

public class SumofEvenNumber {

    public static void main(String[] args){

        List<Integer> no = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = no.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sum);
    }
}
