import java.util.ArrayList;
import java.util.List;

public class FindStringStartingWithS {

    public static void main(String[] args){
        String[] arr = {"apple", "banana", "strawberry", "grape", "orange", "starfruit"};
        List<String> result = new ArrayList<>();
        System.out.println("Strings starting with 's':");
        for(String str : arr){
            if(str.toLowerCase().startsWith("s")){
                System.out.println(str);
                result.add(str);
            }

        }
        System.out.println(result);
    }
}


/*
Arrays.stream(arr)
              .filter(s -> s.startsWith("s"))
        .forEach(System.out::println);
    */ // Java 8 approach
