import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequencyofString {
    public static void main(String[] args){
        String str = "karthikeyan";

        Map<Character, Long> frequencyMap = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));

        System.out.println(frequencyMap);


    }
}
