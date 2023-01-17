import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        // N과 숫자 입력받기
        int N = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] NNum = new int[N];
        for (int i = 0; i < N; i++) {
            NNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(NNum); // 이진 탐색을 위해 정렬

        // M과 숫자 입력받기
        int M = Integer.parseInt(bufferedReader.readLine());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] MNum = new int[M];
        for (int i = 0; i < M; i++) {
            MNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        // 겹치는 수 확인
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(NNum, MNum[i]) >= 0) {
                result.add(1);
                continue;
            }
            result.add(0);
        }

        // 결과 출력
        for (Integer I : result) {
            System.out.println(I);
        }
    }
}

