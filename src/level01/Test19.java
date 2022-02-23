package level01;

public class Test19 {
//	문제 설명
//	길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, 
//	solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
//
//	제한 조건
//	n은 길이 10,000이하인 자연수입니다.

	public String solution(int n) {
		String answer = "";

		String str1 = "수";
		String str2 = "박";

		for (int i = 0; i < n; i++) { // for를 이용해 보자
			answer += str1;
			i++;
			if (i == n) {
				break;
			}
			answer += str2;
		}

		return answer;
	}

	public static void main(String[] args) {
		Test19 test = new Test19();
		System.out.println(test.solution(2));
	}

}
