import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "apple";

        Character c = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeating character: " + c);
    }
}
