/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String used_chars = "";
        int str_length = s.length();
        String unique_chars = "";
        for (int i = 0; i < str_length; i++) {
             char char_at_i = s.charAt(i);
            if (unique_chars.indexOf(char_at_i) == -1 || char_at_i == ' '){
                unique_chars = unique_chars + char_at_i;
            }
        }
        return unique_chars;
    }
}