import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 예제 입력
        String str = br.readLine();

        // 알파벳을 저장할 배열 생성
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        /*
        문자열을 인덱스 0부터 검사:
        1. 검사하면서 인덱스 값을 배열에 저장
        2. 만약 값이 -1이 아니라면 스킵
        *참고: 소문자 a의 아스키 코드: 97
         */

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }
        
        // 배열 값 StringBuilder에 저장해서 한꺼번에 출력
        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]).append(" ");
        }

        System.out.print(sb);

    }
}
