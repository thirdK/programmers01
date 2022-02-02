package level01;

public class Test15 {

//	문제 설명
//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//
//	제한 사항
//	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

    public String solution(String s) {
        String answer = "";
        int cnt = 0;	//인덱스 번호를 따로 카운트 할 cnt 변수
		for (int i = 0; i < s.length(); i++) {	
			if (s.charAt(i) == ' ') {	//공백을 만나면 cnt를 0으로 초기화
				cnt = 0;
				answer += ' ';			//문자열에 공백 추가하고 continue
				continue;
			}
			
			if (cnt % 2 == 0) {			//cnt가 짝수면 대문자로 
				answer +=  s.toUpperCase().charAt(i);
			}else {						//cnt가 홀수면 소문자로
				answer +=  s.toLowerCase().charAt(i);
			}

			cnt++;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		
		Test15 test = new Test15();
		System.out.println(test.solution("try hello world")); 

	}
}
