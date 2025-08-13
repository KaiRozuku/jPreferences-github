import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Generics {
    public static void main(String[] args) {
     Integer []arr = new Integer[10];
     Random random = new Random();
     Arrays.setAll(arr, i -> random.nextInt(100) + 1);
     pritArr(arr);
     String []starr = {"rer", "dgfdgt"};
     showArr(arr, Integer.class);

    }
    public static <T> void pritArr(T[] arr){

        Arrays.stream(arr).forEach(System.out::println);
    }
    public static <T> void showArr(T []a, Class<?> ag){
        Arrays.stream(a).forEach(System.out::println);
        System.out.println(ag);
    }
}
