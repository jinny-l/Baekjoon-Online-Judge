import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
         */

        Scanner scanner = new Scanner(System.in);
        int H, M, time;
        H = scanner.nextInt();
        M = scanner.nextInt();
        time = scanner.nextInt();
        scanner.close();

        int minute; // 입력받은 시, 분, 요리 시간을 더해 분으로 변환;
        minute = H * 60 + M + time;

        if ((minute / 60) >= 24) { // 더한 값을 시로 변환 시 24시가 넘어갈 때
            H = (minute / 60) - 24;
        } else { // 24시 안 넘어갈 때
            H = minute / 60;
        }
        System.out.println(H + " " + (minute % 60));
    }
}
