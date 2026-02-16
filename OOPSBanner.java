import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {
    public static void main(String[] args) {
        // UC2: Call the modular method instead of printing directly
        printBanner("OOPS");
    }

    public static void printBanner(String text) {
        // Using a Map to store character designs for reusability
        Map<Character, String[]> alphabet = new HashMap<>();
        
        alphabet.put('O', new String[]{
            "  *** ",
            " * *",
            " * *",
            "  *** "
        });

        alphabet.put('P', new String[]{
            " **** ",
            " * *",
            " **** ",
            " * "
        });

        alphabet.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });

        System.out.println("Modular Banner System Initialized for: " + text);
    }
}