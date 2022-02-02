package level01;

public class Test11 {
//	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//	제한 사항
//	n은 1이상, 50000000000000 이하인 양의 정수입니다.

	public long solution(long n) {
		long answer = 0;

		double check = Math.sqrt(n);	//제곱근

		if (n % check == 0) {			//위의 제곱근으로 나누어 떨어지는지 확인
			answer = (long) Math.pow(Math.sqrt(n) + 1, 2);	//제곱근에 1을 더하고 2제곱하여 대입
		} else {
			answer = -1;
		}

		return answer;
	}

}
