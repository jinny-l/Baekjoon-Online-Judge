import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int H, M;
        H = scanner.nextInt();
        M = scanner.nextInt();
        scanner.close();

        if (M >= 45){
            System.out.println(H + " " + (M - 45));
        } else {
            H--;
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + (60 - (45 - M)));
        }
    }
}
