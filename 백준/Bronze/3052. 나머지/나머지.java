import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set set = new HashSet();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt() % 42;
            set.add(arr[i]);
        }

        System.out.print(set.size());

    }
}