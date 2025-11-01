import java.util.List;

public class FirstElementGreaterThan50 {

    public static void main(String[] args){
        List<Integer> no = List.of(10, 25, 55, 60, 75, 30, 45);
        Integer result = no.stream().filter(n -> n > 50).skip(1).findFirst().orElse(null);
        System.out.println("Second element greater than 50: " + result);
     }
}
