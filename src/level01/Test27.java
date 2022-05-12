package level01;

import java.util.ArrayList;
import java.util.Arrays;

//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//제한사항
//arr은 자연수를 담은 배열입니다.
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.



//중복요소는 없으며 divisor로 나누어 떨어지는 요소를 오름차순으로 정렬해서 반환해야한다.
//오름차순을 먼저 만들고 해도 상관 없을거 같다.
//arr[0] ~ arr[n-1] 탐색하고 divisor로 나누어 떨어지는지 확인한다.
//나누어 떨어지면 answer에 추가한다.
public class Test27 {
	static int[] solution(int[] arr, int divisor) {
//		int[] answer = {};
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i : arr) {
//			if(i%divisor == 0) list.add(i);
//		}
//		if(list.size()==0) list.add(-1);
//		answer = list.stream().mapToInt(Integer::intValue).sorted().toArray();
//		return answer;
		
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		
		for(int i : solution(arr, 5)) {
			System.out.print(i+" ");
		}
		
	}

}
