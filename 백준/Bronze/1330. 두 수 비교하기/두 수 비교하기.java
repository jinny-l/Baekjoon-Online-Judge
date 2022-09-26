import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int A, B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();

        System.out.print( (A > B) ? ">" : (A == B) ? "==" : "<" );
    }
}