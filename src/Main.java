import java.util.Scanner;
import java.util.prefs.Preferences;

public class Main {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userNodeForPackage(Main.class);
        String name = preferences.get("user", "user");
        System.out.println("Привіт, " + name);
        Scanner scanner = new Scanner(System.in);
        String newUser = scanner.nextLine();
        preferences.put("user", newUser);
        System.out.println("All is good");
    }
}