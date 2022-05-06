package level01;

//문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
//예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

//문자열의 n번째를 비교한다.
//	문자열의 n번째를 어떻게 비교할 것인가?
//	나누거나 뽑아내야함 charAt, split

//오름차순으로 정렬한다.
//	정렬은 어떻게할 것인가?
//	하나의 문자(열)을 가지고 단어를 정렬해야함
//	만약 같은 문자가 여러개면 사전 순으로 배치해야함(즉, n을 제외한 가장 앞의 알파벳부터 다시 비교)
public class Test25 {
	
	
	static String[] solution(String[] strings, int n) {
		String[] answer = strings;
		for(int i=1; i<answer.length; i++) {
			for(int j=0; j<answer.length-i; j++) {
				if(answer[j].charAt(n)>answer[j+1].charAt(n)) {
					String temp = answer[j];
					answer[j] = answer[j+1];
					answer[j+1] = temp;
				}else if(answer[j].charAt(n)==answer[j+1].charAt(n)) {
					int m = 0;
					while(m < answer[j].length()) {
						if(n==m) {
							m++;
							continue;
						}else if(answer[j].charAt(m)>answer[j+1].charAt(m)) {
							String temp = answer[j];
							answer[j] = answer[j+1];
							answer[j+1] = temp;
							break;
						}else if(answer[j].charAt(m)<answer[j+1].charAt(m)) {
							break;
						}
						m++;
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] s = {"abce", "abcd", "cdx"};
		
		for(String st : solution(s, 1)) {
			System.out.print(st + ", ");
		}
	}
}
