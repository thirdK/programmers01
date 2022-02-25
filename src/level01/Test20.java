package level01;

public class Test20 {
//	문제 설명
//	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//	(1은 소수가 아닙니다.)
//
//	제한 조건
//	n은 2이상 1000000이하의 자연수입니다.
	public int solution(int n) {
		int answer = 0;
		boolean check;

		for (int i = 2; i <= n; i++) { // 2~n까지 소수가 존재하는지 판별하기 위한 범위
			check = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {// 소수인지 판별하기 위해 2~(i의 제곱근)까지 검사할 반복문
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Test20 test = new Test20();

		System.out.println(test.solution(10));
	}
}
