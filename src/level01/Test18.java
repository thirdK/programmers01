package level01;

import java.util.ArrayList;

import java.util.List;

public class Test18 {

//	문제 설명
//	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//
//	제한 조건
//	s의 길이는 1 이상 5이하입니다.
//	s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//	s는 부호와 숫자로만 이루어져있습니다.
//	s는 "0"으로 시작하지 않습니다.
//	입출력 예
//	예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
//	str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

	public int solution(String s) {
		int answer = 0;

		List<Character> list = new ArrayList<Character>();
		char[] str = s.toCharArray();

		for (int i = str.length - 1; i >= 0; i--) {
			list.add(str[i]);
		}

		int num = 1; // 자리수에 사용 할 변수
		int check = 1; // 마지막에 음수양수를 결정하는 변수
//		= list.get(list.size()-1).equals("-") ? -1 : 1;	

		if (list.get(list.size() - 1).equals('-')) {	//삼항연산을 사용하려 했으나 '-'를 찾으면
			check = -1;									//check값도 변경하고 '-'를 지우기 위해 if사용
			list.remove(list.size() - 1);
		}else if(list.get(list.size() - 1).equals('+')) {	//'+'는 삭제만 하면 된다.
			list.remove(list.size() - 1);
		}

		for (int i = 0; i < list.size(); i++) {

			answer += (list.get(i) - '0') * num;
			num *= 10;
		}

		return answer*check;
	}

	public static void main(String[] args) {
		Test18 test = new Test18();
		
//		System.out.println(Integer.parseInt(s)); 메소드말고 다른방식으로

		System.out.println(test.solution("-1234"));
	}
}
