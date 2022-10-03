import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] AB = {scanner.next(), scanner.next()};

        scanner.close();

        // 문자열 거꾸로 변환
        for (int j = 0; j < AB.length; j++) {  // 인덱스 수 만큼 반복
            String reverse = "";
            for (int i = 2; i >= 0 ; i--) {  // 인덱스 길이 만큼 반복
                reverse += AB[j].charAt(i);
            }
            AB[j] = reverse;
        }
        
        // 문자열 > 정수
        int[] reverse = {Integer.parseInt(AB[0]), Integer.parseInt(AB[1]) };
        
        // 결과 출력
        System.out.print( reverse[1] > reverse[0] ? AB[1] : AB[0] );
    }
}