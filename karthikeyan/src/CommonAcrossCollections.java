import java.util.*;
import java.util.stream.Collectors;

public class CommonAcrossCollections {

        public static void main(String[] args) {
            List<String> a = Arrays.asList("A","B","A");
            Set<String> b = new HashSet<>(Arrays.asList("B","C"));
            List<String> c = Arrays.asList("B","D","B");

            List<Collection<String>> cols = Arrays.asList(a, b, c);

            System.out.println(commonByCounting(cols));      // [B]
            System.out.println(commonByIntersection(cols)); // [B]
        }

        // Approach 1: count occurrences across all collections
        public static <T> Set<T> commonByCounting(Collection<? extends Collection<T>> collections) {
            int total = collections.size();
            if (total == 0) return Collections.emptySet();
            return collections.stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                    .entrySet().stream()
                    .filter(e -> e.getValue() == total)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
        }

        // Approach 2: set-based intersection using iterative reduce
        public static <T> Set<T> commonByIntersection(Collection<? extends Collection<T>> collections) {
            Iterator<? extends Collection<T>> it = collections.iterator();
            if (!it.hasNext()) return Collections.emptySet();
            Set<T> result = new HashSet<>(it.next());
            while (it.hasNext()) {
                result.retainAll(new HashSet<>(it.next()));
                if (result.isEmpty()) break;
            }
            return result;
        }
    }
