/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the upper-case letters are converted to lower-case letters.
     * Non-letter characters are left as is.
     */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        int str_length = s.length();
        String lower_case_str = "";
        for (int i = 0; i < str_length; i++) {
            char char_at_i = s.charAt(i);
            if (char_at_i >= 65 && char_at_i <= 90) {
                lower_case_str = lower_case_str + (char)(char_at_i + 32);
            } else {
                lower_case_str = lower_case_str + (char) char_at_i;
            }
        }
        return lower_case_str;
    }
}
