import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
class Solution {


    public static void main(String[] args){

        List<Integer> p = Arrays.asList(1,2,3);

        List<Integer> q = Arrays.asList(1,null,4);

        System.out.println("Is Same Tree: " +isSameTree(p,q));

    }

    private static Object isSameTree(List<Integer> p, List<Integer> q) {

        Set<Integer> sam1 = new HashSet<>();

        Set<Integer> sam2 = new HashSet<>();

        System.out.println("Check: " + p + q);
        for(int i : p){
            sam1.add(i);
        }

        sam2.addAll(q);

        System.out.println("Null Check: "+sam2);

        if(sam1.containsAll(sam2)){
            return true;
        }else{
            return false;
        }
    }
}