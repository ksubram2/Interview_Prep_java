public class FindLongestPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flowing", "flot"};
        String prefix = str[0];
        //System.out.println("Checking Index: " +prefix.indexOf("0"));
        System.out.println("Test1: loading 1st element in array :" + prefix);
        for (int i =1; i< str.length; i++){
            System.out.println("Testing 2 Iterating : "  +i);
            System.out.println("Testing Check: " +str[i].indexOf(prefix));
            while (str[i].indexOf(prefix) != 0){
                System.out.println("Testing While loop");
                prefix = prefix.substring(0, prefix.length()-1);
                System.out.println("Prefix : "+ prefix);

            }

        }
        System.out.println("Testing 3: " + prefix);
    }
}
