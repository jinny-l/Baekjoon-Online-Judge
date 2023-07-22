import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력
        int vertexCnt = Integer.parseInt(st.nextToken());
        int edgeCnt = Integer.parseInt(st.nextToken());

        long totalCost = 0;
        Vertex[] trees = new Vertex[edgeCnt];
        for (int i = 0; i < edgeCnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            Vertex vertex = new Vertex();

            vertex.start = Integer.parseInt(st.nextToken());
            vertex.end = Integer.parseInt(st.nextToken());
            vertex.cost = Integer.parseInt(st.nextToken());

            trees[i] = vertex;
            totalCost += vertex.cost;
        }

        // 가중치 기준 정렬
        Arrays.sort(trees, (Comparator.comparingInt(o -> o.cost)));

        // 부모 노드 초기화
        parents = new int[vertexCnt + 1];
        for (int i = 0; i <= vertexCnt; i++) {
            parents[i] = i;
        }

        // 크루스칼 알고리즘
        long minCost = 0;
        int unionCnt = 0;
        for (int i = 0; i < edgeCnt; i++) {
            Vertex vertex = trees[i];
            int start = vertex.start;
            int end = vertex.end;

            if (!sameParent(start, end)) {
                union(start, end);
                minCost += vertex.cost;
                unionCnt++;
            }
        }
        if (unionCnt != vertexCnt - 1) {
            System.out.println(-1);
            return;
        }
        System.out.println(totalCost - minCost);
    }

    static class Vertex {
        int start;
        int end;
        int cost;
    }

    private static void union(int a, int b) {
        if (find(a) > find(b)) {
            parents[find(a)] = find(b);
        } else {
            parents[find(b)] = find(a);
        }
    }

    private static int find(int a) {
        if (parents[a] == a) {
            return a;
        }
        return parents[a] = find(parents[a]);
    }

    private static boolean sameParent(int x, int y) {
        return find(x) == find(y);
    }
}
