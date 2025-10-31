// java
import java.util.stream.IntStream;

public class FindDuplicatesUsingJava8 {

    public static void main(String[] args) {
        String str = "karthikeyan";
        String updated = str.toLowerCase();

        StringBuilder duplicates = new StringBuilder();

        IntStream.range(0, updated.length())
                .map(updated::charAt)
                .filter(ch -> updated.indexOf(ch) != updated.lastIndexOf(ch))
                .distinct()
                .forEach(ch -> duplicates.append((char) ch));

        System.out.println("Duplicate characters: " + duplicates.toString());
    }
}
