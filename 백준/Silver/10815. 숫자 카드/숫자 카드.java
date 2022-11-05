import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 상근이의 숫자 카드 개수
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		// 상근이의 숫자 카드에 적힌 정수 리스트
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list1.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list1); // 이진 탐색을 위한 정렬

		// 상근이의 숫자 카드와 비교할 카드 개수
		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		// 비교할 카드에 적힌 정수 리스트
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}

		// 개수 구하기: 이분 탐색법 사용
		int result;
		for (int i = 0; i < M; i++) {
			result = binarySearch(list1, list2.get(i));
			if (result == 1) {
				sb.append(1).append(" ");
			} else if (result == 0) {
				sb.append(0).append(" ");
			}
		}

		System.out.println(sb);
	}

	// 일치하는 것이 있을 때 1를 반환하고 아니면 0을 반환
	private static int binarySearch(List<Integer> list, Integer target) {
		int	low = 0;
		int high = list.size() - 1;
		int mid;

		while (low <= high) {

			mid = (high + low) / 2;

			if (list.get(mid) < target) {
				low = mid + 1;
			}

			if (list.get(mid) > target) {
				high = mid - 1;
			}

			if (list.get(mid).equals(target)) {
				return 1;
			}
		}
        
		return 0;
	}
}