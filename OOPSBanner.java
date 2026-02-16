import java.util.Scanner; // New for UC3
import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text for banner: ");
        String userInput = scanner.nextLine().toUpperCase();
        
        printBanner(userInput); // Now passes whatever the user typed
    }

    public static void printBanner(String text) {
        // Your existing HashMap logic from UC2 stays here...
        // ... (Include your 'alphabet' Map entries here) ...
        
        System.out.println("Displaying modular banner for: " + text);
    }
}