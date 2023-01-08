import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] ascending = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] descending = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String[] input = bufferedReader.readLine().split(" ");

        if (Arrays.equals(input, ascending)) {
            System.out.println("ascending");
            return;
        }

        if (Arrays.equals(input, descending)) {
            System.out.println("descending");
            return;
        }

        System.out.println("mixed");
    }
}
