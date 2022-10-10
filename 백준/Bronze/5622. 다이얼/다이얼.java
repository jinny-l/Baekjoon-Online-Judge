import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();

        int second = 0;
        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == 'A' || number.charAt(i) == 'B' || number.charAt(i) == 'C') {
                second += 3;
            }

            if (number.charAt(i) == 'D' || number.charAt(i) == 'E' || number.charAt(i) == 'F') {
                second += 4;
            }

            if (number.charAt(i) == 'G' || number.charAt(i) == 'H' || number.charAt(i) == 'I') {
                second += 5;
            }

            if (number.charAt(i) == 'J' || number.charAt(i) == 'K' || number.charAt(i) == 'L') {
                second += 6;
            }

            if (number.charAt(i) == 'M' || number.charAt(i) == 'N' || number.charAt(i) == 'O') {
                second += 7;
            }

            if (number.charAt(i) == 'P' || number.charAt(i) == 'Q' || number.charAt(i) == 'R' || number.charAt(i) == 'S') {
                second += 8;
            }

            if (number.charAt(i) == 'T' || number.charAt(i) == 'U' || number.charAt(i) == 'V') {
                second += 9;
            }

            if (number.charAt(i) == 'W' || number.charAt(i) == 'X' || number.charAt(i) == 'Y' || number.charAt(i) == 'Z') {
                second += 10;
            }


        }

        System.out.print(second);

    }
}