import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String number = br.readLine();
            StringBuilder sb = new StringBuilder();

            if (number.equals("0")) {
                break;
            }
            String cmp = sb.append(number).reverse().toString();

            if (number.equals(cmp)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

