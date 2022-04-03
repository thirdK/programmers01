package level01;

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 
//다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
//단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

//p,P의 개수를 구한다.
//y,Y의 개수를 구한다.
//비교한다.
//같으면 true 다르면 false를 리턴한다.

public class Test24 {
	static boolean solution(String s) {
		int cnt = 0;
		
		for(String i : s.toLowerCase().split("")) {
			if(i.equals("p")) {
				cnt++;
			}else if(i.equals("y")) {
				cnt--;
			}
		}
		
		return cnt==0;
	}
	
//	static boolean solution(String s) {
//		boolean answer = true;
//		int pcnt = 0;
//		int ycnt = 0;
//
//		for(String i : s.split("")) {
//			if(i.equals("p") || i.equals("P")) {
//				pcnt++;
//			}else if(i.equals("y") || i.equals("Y")) {
//				ycnt++;
//			}
//		}
//		
//		if(pcnt != ycnt) {
//			answer = false;
//		}
//		
//		
//		return answer;
//	}
	
	public static void main(String[] args) {
		System.out.println(solution("pPyyY"));
		
	}
}
