import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] num = {scanner.nextLine(), scanner.nextLine()};

        for (int i = 2; i >= 0; i--) {
            System.out.println( Integer.parseInt(num[0]) * Character.getNumericValue(num[1].charAt(i)) );
        }
        System.out.println(Integer.parseInt(num[0]) * Integer.parseInt(num[1]));
    }
}