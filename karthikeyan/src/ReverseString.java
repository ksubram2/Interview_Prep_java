public class ReverseString {

    public static void main(String[] args){

        String str = "karthikeyan";
        String finalStr = new StringBuffer(str).reverse().toString();

        System.out.println("Final String : " + finalStr);
    }
}
