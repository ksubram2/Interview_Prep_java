import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesInString {

    public static void main(String[] args){
        List<String> strList = List.of("karthikeyan", "java", "python", "karthikeyan", "c++", "java");
        List<String> duplicates = strList.stream()
                                        .filter(s -> Collections.frequency(strList,s)>1)
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println("Duplicate strings: " + duplicates);
    }

}
