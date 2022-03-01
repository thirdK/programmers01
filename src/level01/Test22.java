package level01;

public class Test22 {
//	문제 설명
//	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
//	solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
//
//	제한 사항
//	s는 길이 1 이상, 길이 8 이하인 문자열입니다.
	public boolean solution(String s) {
		boolean answer = false;

		if (s.length() != 4 && s.length() != 6) {
			return answer;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return answer;
			}
		}
		return answer=true;
	}

	public static void main(String[] args) {
	
		Test22 test = new Test22();
		String s = "1121";
		
		System.out.println(test.solution(s));
		
//		정규식을 활용가능하다.
//		^[0-9]*$	숫자
//		^[a-zA-Z]*$	영문자
//		^[가-힣]*$	한글
//		\\w+@\\w+\\.\\w+(\\.\\w+)?	E-Mail
//		^\d{2,3}-\d{3,4}-\d{4}$	전화번호
//		^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$	휴대전화번호
//		\d{6} \- [1-4]\d{6}	주민등록번호
//		^\d{3}-\d{2}$	우편번호
		
		

	}

}
