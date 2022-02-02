package level01;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
//	문제 설명
//	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
//	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//	제한 조건
//	arr은 길이 1 이상인 배열입니다.
//	인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
	class Solution {
		public int[] solution(int[] arr) {			// 배열의 순서가 바껴서는 안되며(정렬x) 작은수가 여러개일 것을 고려한다.
			int[] answer = {};
			List<Integer> list = new ArrayList<Integer>(); 	// 배열의 크기가 변할 것이므로 list를 만들어 담는다.

			int min = arr[0]; 		// 최소값을 찾아내 담을 변수 min에 배열의 첫번째 값으로 초기화
			if (arr.length == 1) { 	// 배열의 길이가 1이면 비교할 대상이 없으므로 -1을 리턴한다.
				answer = new int[] { -1 };
				return answer;
			}
			for (int i = 0; i < arr.length; i++) {	// 배열 전체의 값과 min값을 비교하여
				min = Math.min(min, arr[i]);		// 최종적으로 min에 제일 작은수가 들어도록 한다.
			}

			for (int num : arr) { 					// arr배열에서 min(최소값)과 일치하지 않으면 list에 추가
				if (num == min) {
					continue;
				}
				list.add(num);
			}

			answer = new int[list.size()]; 			// answer배열 초기화

			for (int i = 0; i < list.size(); i++) { // list에 있는 값을 answer로 넘겨받는다.
				answer[i] = list.get(i);
			}

			return answer;
		}
		
	}
}
