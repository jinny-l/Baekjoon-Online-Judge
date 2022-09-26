import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, max;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3){ // 세 수가 같을 때
            System.out.println(10000 + num1 * 1000);
        } else if (num2 == num3) { // 두 수가 같을 때 - 케이스1
            System.out.println(1000 + num2 * 100);
        } else if (num1 == num2 || num1 == num3) { // 두 수가 같을 때 - 케이스2
            System.out.println(1000 + num1 * 100);
        } else{
            max = Math.max(Math.max(num1,num2), num3); // max 값 찾기
            System.out.println(max * 100);
        }
    }
}
