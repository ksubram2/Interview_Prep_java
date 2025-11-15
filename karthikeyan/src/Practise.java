import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;
import java.util.stream.Collectors;

public class Practise {

    public static void main(String[] args) {

      int[] sam = {20, 1, 6, 17, 10};

      int min = Arrays.stream(sam).min().getAsInt();
      System.out.println("Minimum :" +min);
      int max = Arrays.stream(sam).max().getAsInt();
      System.out.println("Maximum :" + max);


      /*List<Integer> nonZero = fa.stream().filter(n -> n!=0).toList();
      System.out.println(nonZero);

      List<Integer> zero = fa.stream().filter(n -> n==0).toList();
      System.out.println(zero);

      List<List<Integer>> f = List.of(nonZero, zero);

      List<Integer> fi = f.stream().flatMap(List::stream).toList();

      System.out.println("final list :" +fi);*/
/*
        List<Integer> zero = new ArrayList<>();
        List<Integer> nonZero = new ArrayList<>();
        for(int i : fa){
            if(fa.indexOf(i)==0){
                Integer ze  = fa.get(i);
                zero.add(ze);
            }else {
                Integer nonZe = fa.get(i);
                nonZero.add(nonZe);
            }
        }
        List<Integer> combined = new ArrayList<>(nonZero);
        combined.addAll(zero);
        System.out.println(combined);*/
    }
}
