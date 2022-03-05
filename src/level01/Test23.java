package level01;

import java.util.ArrayList;
import java.util.List;

//문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
//
//제한 사항
//str은 길이 1 이상인 문자열입니다.
//입출력 예
//  s		return
//"Zbcdefg"	"gfedcbZ"

public class Test23 {
	public String solution(String s) {
		String answer = "";
		List<Character> lst = new ArrayList<Character>();

		for (char c : s.toCharArray()) {
			lst.add(c);
		}
		char max;

		for (int i = 0; i < lst.size(); i++) {
			max = lst.get(i);
			for (int j = i + 1; j < lst.size(); j++) {
				if (max < lst.get(j)) {
					max = lst.get(j);
					lst.set(j, lst.get(i));
					lst.set(i, max);
				}
			}
		}
		for (char c : lst) {
			answer += Character.toString(c);
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "Zbcdefg";
//		String answer = "";

//		char max;
//		int cnt = 0;
//		for(int i=0; i<s.length(); i++) {
//			max = s.charAt(i);
//			for(int j=i; j<s.length(); j++) {
//				if(max < s.charAt(j)) {
//					max = s.charAt(j);
//					cnt = j;
//				}
//			}
//			answer += Character.toString(max);
//		}
//			여기서 발생된 문제는 string을 배열이나 컬렉션이 아닌 charAt으로 가져왔을 때 
//			조건에 맞는 문자를 해당문자열에서 가져왔을 때 어떻게 탐색범위에서 제외를 시키는가?
//			삭제를 시키더라도 문자열의 길이가 변화되어서 오류가 발생할것 같다.
//			삭제하고 문자열의 가장 앞으로 가져와 붙이는방법은 비효율적인것 같다.
//			배열도 비슷한 문제가 생길거 같아서 컬렉션을 사용해본다.

		Test23 test = new Test23();
		
		System.out.println(test.solution(s));

	}

}
