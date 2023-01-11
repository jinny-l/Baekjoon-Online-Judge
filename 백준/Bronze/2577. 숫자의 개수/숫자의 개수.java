import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());

        int multiplication = A * B * C;
        String parsing = String.valueOf(multiplication);

        int[] number = new int[10];

        for (int i = 0; i < parsing.length(); i++) {
            int index = Character.getNumericValue(parsing.charAt(i));
            number[index]++;
        }

        Arrays.stream(number).forEach(System.out::println);
        
    }
}

