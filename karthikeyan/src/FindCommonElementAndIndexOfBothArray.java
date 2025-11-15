import java.util.*;

public class FindCommonElementAndIndexOfBothArray {

    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(1,2,4,8,9,7);
        List<Integer> arr2 = Arrays.asList(6,8,7,2,4,9);

        HashMap<Integer, Integer> temp = new HashMap<>();

        for(int x : arr1){
            temp.put(x, arr1.indexOf(x));
        }

        for(int y : arr2){
            if(temp.containsKey(y)){
                System.out.println("Common Element: " + y + " Common Index arr1 : " + temp.get(y) + " Common Index arr2 : "+ arr2.indexOf(y));

            }
        }
    }
}
