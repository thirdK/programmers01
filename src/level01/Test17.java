package level01;

public class Test17 {

//	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//	예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
//	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
//
//	제한 조건
//	공백은 아무리 밀어도 공백입니다.
//	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//	s의 길이는 8000이하입니다.
//	n은 1 이상, 25이하인 자연수입니다.

	public String solution(String s, int n) {
		String answer = "";
		
		for (int i = 0; i < s.length(); i++) {	// 오래 고민했지만 괜찮은 생각이 안나서
			if (s.charAt(i) == ' ') { 			// 예외인 경우를 if로 처리하고 나머지는 +1씩 하려고함.
				answer += " "; 					// - 공백은 여기서 처리
				continue;					
			} 
			int temp = s.charAt(i);
			for(int j=0; j<n; j++) {		// 한번에 n을 더하면 z를 넘어가서 증가되는 수(n)만큼 1씩 더해주려한다. 
				if(temp == 'z') {			// - z가 넘어가는 경우는 여기서 처리
					temp = 'a';				// z가되어서도 for문에 들어온건 증가치(n)가 남았다는 소리이므로
					continue;				// a로 만들어주고 continue
				}else if(temp == 'Z') {		// - 대문자도 소문자와 마찬가지
					temp = 'A';
					continue;
				}
				temp++;						//위의 if에 안걸리고 내려오면 +1 [n번만큼 반복]
			}
			
			answer += Character.toString(temp);	//마지막으로 answer에 문자열로 넣어준다 [s의 길이만큼 반복]
		}
			return answer;
		}

	

	public static void main(String[] args) {
		
		Test17 test = new Test17();
		
		System.out.println(test.solution("YZ a", 2));

	}
}
