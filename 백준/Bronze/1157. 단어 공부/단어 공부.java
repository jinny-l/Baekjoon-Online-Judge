import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine().toUpperCase();
        // 각 배열 인덱스는 A~Z(0~25)에 해당
        int[] alphabets = new int[26];

        // 단어의 알파벳별 개수 저장
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'A';
            alphabets[index]++;
        }

        // max값 찾기
        int max = -1;
        int index = -1;
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                index = i;
            }
        }

        int maxCount = 0;
        for (int alphabet : alphabets) {
            if (alphabet == max) {
                maxCount++;
            }
        }

        // 결과 출력
        if (maxCount > 1) {
            System.out.println("?");
            return;
        }

        System.out.println((char) (index + 'A'));
    }
}
