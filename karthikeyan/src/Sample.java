import java.util.Arrays;
import java.util.List;

public class Sample {

    public static void main(String[] args) {

        List<String> listStr = Arrays.asList("amaq", "amaqzing", "amaqzed", "amaq");
        String prefix = listStr.getFirst();

        for(String s : listStr){
            System.out.println(s.indexOf(prefix));
            if(s.indexOf(prefix)!=0){
                System.out.println("Prefix: " +prefix);
                prefix = prefix.substring(0, prefix.length()-1);
                System.out.println(prefix);

            }
        }

        System.out.println("final prefix : " +prefix);
    }

}
