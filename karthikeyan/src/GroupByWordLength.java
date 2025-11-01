import java.util.List;
import java.util.stream.Collectors;

public class GroupByWordLength {
    public static void main(String[] args) {
        List<String> str = List.of("apple", "banana", "pear", "kiwi", "grape", "melon");

        var groupedByLength = str.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by word length: " + groupedByLength);

    }
}
