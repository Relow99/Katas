public class Longest_String {

    public static String theLongest_String(String[] array) {

        int max = 0;
        String Longest_String = null;
        for (String s : array) {
            if (s.length() > max) {
                max = s.length();
                Longest_String = s;
            }
        }
        return Longest_String;
    }

    public static void main(String[] args) {
        String[] longest = {"the", "quick", "brown", "fox", "ate", "my", "chicken"};

        String Longest_String = theLongest_String(longest);

        System.out.println(Longest_String);
    }
}