import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {

       List<String> str = Arrays.asList("java", "python", "c++", "java");

       List<String> finalStr = str.stream().distinct().collect(Collectors.toList());
       System.out.println("Final list: " +finalStr);
    }
}
