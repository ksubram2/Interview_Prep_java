import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SelectDistinctWord {
    public static void main(String[] args) {

       List<String> str = Arrays.asList("java", "python", "c++", "java");

       List<String> finalStr = str.stream().distinct().collect(Collectors.toList());
       System.out.println("Non-Repeated String using Distinct: " + finalStr);
       //without distinct
       Map<String, Long> samStr = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       List<String> finalNonRepeatedWord = samStr.entrySet().stream().filter(e -> e.getValue() >1).map(Map.Entry::getKey).toList();
       System.out.println("Non-Repeated String Without Distinct: " + finalNonRepeatedWord);
    }
}
