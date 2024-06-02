
public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println(app.reverseString("1234")); // Outputs: "4321"
    }

    public String reverseString(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return str;
        }

        // Validation for empty string
        if (str.isEmpty()) {
            return "Input string is empty.";
        }

        // Validation for single character string
        if (str.length() == 1) {
            return str;
        }
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strLength / 2; i++) {
            char ch = strArray[i];
            strArray[i] = strArray[strLength - 1 - i];
            strArray[strLength - 1 - i] = ch;
        }

        return new String(strArray); // Convert array back to string
    }

    public static String reverseString1(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    /*
     * StringBuilder is a class in Java that is used to create mutable (modifiable)
     * sequences of characters.
     * Unlike String, which is immutable (once created, it cannot be changed),
     * StringBuilder allows for the modification of its contents without creating
     * new objects.
     * This makes it more efficient for scenarios where a lot of string manipulation
     * is needed,
     * such as concatenation, insertion, deletion, and reversal of characters.
     */
}
