package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//문제 설명
//배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
//이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
//단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

//arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

//제한사항
//배열 arr의 크기 : 1,000,000 이하의 자연수
//배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

public class Test28 {
	public static void main(String[] args) {
//		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr = {4,4,4,3,3};
		
		for(int i : solution(arr)) {
			System.out.println(i);
		}
	}

	//상상속으로 말도안되는 방법을 만들어도 최선의 시간복잡도는 O(N)이라고 생각되므로(어차피 전체 탐색을 해야하니까)
	//리스트를 만들고 배열 전체를 탐색하여 조건에 맞는 값만 추가하려고 함
	static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int n=-1;			//조건에 사용할 n변수 -1로 초기화한 이유는 문제의 제한사항에서 원소의 크기가 0~9로 지정되어 있다.
		for(int i : arr) {	
			if(n==i) continue; 	//같으면 중복 값이니 반복
			else {				//아니면 비교대상 n에 지금 가져온 data를 대입하고 list에 추가한다.
				n=i;
				list.add(n);
			}
		}
		//다시 배열로 변환하기위해 stream을 사용했는데 그냥 for loop사용하는게 더 빠르다.
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
	
	
	
	
//=======================================================================================
	//재귀함수로 풀어봤는데 효율성에서 탈락함 너무 느린듯...

	//	static int[] solution(int[] arr) {
//		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		int[] answer = solR(list).stream().mapToInt(Integer::intValue).toArray();
//		return answer;
//	}

	
//	static List<Integer> solR(List<Integer> list) {
//		if(list.size()==1) return list;
//		List<Integer> n = solR(list.subList(1, list.size()));
//		if (list.get(0) != n.get(0)) {
//			n.add(0, list.get(0));
//		}
//		return n;
//	}
}
