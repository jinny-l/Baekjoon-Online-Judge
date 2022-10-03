import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 배열 입력받기
        StringTokenizer st;
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 시분면과 축에 있는 점 개수 저장할 변수 생성
        int[] cnt = new int[5];
        Arrays.fill(cnt, 0);

        // 시분면과 축에 있는 점 개수 찾기
        for (int i = 0; i < arr.length; i++) {

            if (arr[i][0] == 0 || arr[i][1] == 0) { // 축에 있는 점 찾기
                cnt[4]++;

            } else if (arr[i][0] > 0) {
                if (arr[i][1] > 0) { // Q1에 있는 점 찾기
                    cnt[0]++;
                } else if ((arr[i][1] < 0)) { // Q4에 있는 점 찾기
                    cnt[3]++;
                }

            } else if (arr[i][0] < 0) {
                if (arr[i][1] > 0) { // Q2에 있는 점 찾기
                    cnt[1]++;
                } else if ((arr[i][1] < 0)) { // Q3에 있는 점 찾기
                    cnt[2]++;
                }
            }

        }

        System.out.println("Q1: " + cnt[0]);
        System.out.println("Q2: " + cnt[1]);
        System.out.println("Q3: " + cnt[2]);
        System.out.println("Q4: " + cnt[3]);
        System.out.println("AXIS: " + cnt[4]);

    }
}