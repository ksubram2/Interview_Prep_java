public class FindDuplicates {

    public static void main(String[] args) {
        String str = "karthikeyan";
        String updated = str.toLowerCase();

        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < updated.length(); i++) {
            char ch = updated.charAt(i);
            if (updated.indexOf(ch) != updated.lastIndexOf(ch)) {
                if (duplicates.indexOf(String.valueOf(ch)) == -1) {
                    duplicates.append(ch);
                }
            }
        }
        System.out.println("Duplicate characters: " + duplicates.toString());
    }
}
