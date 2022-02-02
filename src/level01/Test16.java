package level01;

public class Test16 {
//	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//
//	제한 사항
//	n은 0 이상 3000이하인 정수입니다.

	public int solution(int n) {
		int answer = 0;

		// 약수는 나눠서 나머지가0이 되는 숫자
		// 만약 약수가 i라면 n/i 또한 약수가 되므로 반복검색 범위를 반으로 줄일 수 있다.
		// 제곱근을 이용하여 범위를 더 줄여보자
		// ex)25의 제곱근은 5 이므로 반복문이 1~4 or 1~5까지만 돌면될거 같다.

//      if(n == Math.pow(Math.sqrt(n), 2)) {	//제곱근이 존재한다면
//      	for(int i=1; i<Math.sqrt(n); i++) {	//제곱근을 기준으로 앞(i[0])/뒤(j[-1])는 i*j = n이 될것이다.
//      		if(n%i==0) {
//      			answer += i + n/i;			//앞(i)=i, 뒤(j) = n/i
//      		}
//      	}
//      	answer += Math.sqrt(n);				//제곱근은 한번만 합해야 하므로 for문 밖에서 넣어준다.
//      }										//이러면 제곱근이 존재하지 않는 경우도 만들어야된다.

//      		다른 방식으로 해보자
		for (int i = 1; i <= Math.sqrt(n); i++) { 	// 제곱근이 없어도 제곱근에 근접한 정수까지만 비교를하여
			if (i == Math.sqrt(n)) { 				// 앞, 뒤의 중복을 피해준다.
				answer += i;
				break;
			}
			if (n % i == 0) {
				answer += n / i + i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 16;
		Test16 test = new Test16(); 
		System.out.println(Math.sqrt(n));
		System.out.println(test.solution(n));

	}
}
