import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] values;
    public static boolean[] visit;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 개수 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 풀이
        values = new int[m];
        visit = new boolean[n];
        sb = new StringBuilder();
        dfs(n, m, 0);

        // 결과
        System.out.print(sb);
    }

    private static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int value : values) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                values[depth] = i + 1;
                dfs(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
}
