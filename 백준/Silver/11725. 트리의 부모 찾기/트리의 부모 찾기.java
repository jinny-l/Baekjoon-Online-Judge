import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static boolean[] visited;
    private static List<List<Integer>> matrix; // N이 최대 10만이기 때문에 배열로 할 경우 메모리 초과가 난다.
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int vertexAmount = Integer.parseInt(br.readLine());

        matrix = new ArrayList<>();
        for (int i = 0; i < vertexAmount + 1; i++) {
            List<Integer> tmp = new ArrayList<>();
            matrix.add(tmp);
        }

        for (int i = 0; i < vertexAmount - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            matrix.get(a).add(b);
            matrix.get(b).add(a);
        }

        // 풀이
        visited = new boolean[vertexAmount + 1];
        answer = new int[vertexAmount + 1];
        dfs(vertexAmount, 1);

        // 2번 노드부터 출력
        for (int i = 2; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void dfs(int N, int start) {
        visited[start] = true;

        for (int i = 0; i < matrix.get(start).size(); i++) {
            int index = matrix.get(start).get(i);

            if (!visited[index]) {
                answer[index] = start;
                dfs(N, index);
            }
        }
    }
}
