import java.util.*;

public class FindCommonElementAndIndexOfBothArray {

    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(1,2,4,8,9,2,7);
        List<Integer> arr2 = Arrays.asList(6,8,7,2,4,9,2);

        // Store indexes of each element in L1
        Map<Integer, List<Integer>> indexMap1 = new HashMap<>();
        for (int i = 0; i < arr1.size(); i++) {
            indexMap1.computeIfAbsent(arr1.get(i), k -> new ArrayList<>()).add(i);
        }

        // Store indexes of each element in L2
        Map<Integer, List<Integer>> indexMap2 = new HashMap<>();
        for (int j = 0; j < arr2.size(); j++) {
            indexMap2.computeIfAbsent(arr2.get(j), k -> new ArrayList<>()).add(j);
        }

        // Print common elements ONCE with all indexes from both L1 & L2
        for (Integer key : indexMap1.keySet()) {
            if (indexMap2.containsKey(key)) {
                System.out.println(
                        "Element: " + key +
                                " | L1 Indexes: " + indexMap1.get(key) +
                                " | L2 Indexes: " + indexMap2.get(key)
                );
            }
        }
    }
}
