import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[31];

        arr[0] = true;

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }

        br.close();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
