import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateStringInArrayList {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("java", "python", "c++", "java", "c++", "ruby"));

        List<String> duplicates = arr.stream().distinct().collect(Collectors.toList());

        System.out.println("List after removing duplicates: " + duplicates);
    }
}
