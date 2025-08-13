import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class Main2 {
    //    public static void main(String[] args) {
//        Preferences preferences = Preferences.userNodeForPackage(Main2.class);
//        int count = preferences.getInt("progCount", 0);
//        System.out.println("Це твій " + count + "-й запуск програми");
//        count++;
//        preferences.putInt("progCount", count);
//    }
    public static void main(String[] args) throws BackingStoreException {
        Preferences preferences = Preferences.userNodeForPackage(Main2.class);
        System.out.println("last word vasya " + preferences.get("lastWord", null));
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String lastWord = words[words.length - 1];
        preferences.put("lastWord", lastWord);
        Arrays.stream(preferences.keys())
                .forEach(key -> System.out.println(key + " = " + preferences.get(key, "")));    }
}

