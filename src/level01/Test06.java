package level01;

public class Test06 {
//	문제 설명
//	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//
//	제한사항
//	arr은 길이 1 이상, 100 이하인 배열입니다.
//	arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

	public double solution(int[] arr) {
		double answer = 0;
		int total = 0;
		int cnt = 0;

		for (int num : arr) {
			total += num;
			cnt++;
		}
		answer = (double) total / cnt;

		return answer;
	}
	
	public static void main(String[] args) {
		Test06 test = new Test06();
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println(test.solution(arr));
	}
}
