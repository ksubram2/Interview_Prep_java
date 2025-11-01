import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToUppercase {

    public static void main(String[] args){
        List<String> list = Arrays.asList("karthikeyan", "java", "python", "c++");

        List<String> upperCaseList = list.stream().filter(str -> str.startsWith("k"))
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        System.out.println("Uppercase List: " + upperCaseList);
    }
}
