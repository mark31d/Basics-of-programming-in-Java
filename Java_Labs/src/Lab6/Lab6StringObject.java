package Lab6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6StringObject {

    public static void main(String[] args) {
        // Тестування завдання №5
        System.out.println("Testing binaryStringToInt:");
        testBinaryStringToInt("10101"); // Очікуваний результат: 21
        testBinaryStringToInt("1111");  // Очікуваний результат: 15
        testBinaryStringToInt("abc");   // Очікуваний результат: IllegalArgumentException

        // Тестування завдання №11
        System.out.println("\nTesting replaceWordsWithLowercase:");
        testReplaceWordsWithLowercase("The user with the nickname koala757677 this month wrote 3 times more comments.");
        testReplaceWordsWithLowercase("HELLO WORLD 123 ABC.");
    }

    // Завдання №5: Перетворення двійкового рядка у ціле число
    public static int binaryStringToInt(String s) {
        if (s == null || !s.matches("[01]+")) {
            throw new IllegalArgumentException("Invalid binary string: " + s);
        }
        return Integer.parseInt(s, 2);
    }

    private static void testBinaryStringToInt(String binaryString) {
        try {
            System.out.println("Binary string: " + binaryString + " -> Integer: " + binaryStringToInt(binaryString));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Завдання №11: Заміна слів на малі літери
    public static String replaceWordsWithLowercase(String input) {
        if (input == null) {
            throw new NullPointerException("Input string cannot be null");
        }

        // Використання Pattern і Matcher
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher matcher = pattern.matcher(input);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toLowerCase());
        }
        matcher.appendTail(result);

        return result.toString();
    }

    private static void testReplaceWordsWithLowercase(String input) {
        try {
            System.out.println("Original: " + input);
            System.out.println("Transformed: " + replaceWordsWithLowercase(input));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
