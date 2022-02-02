package level01;

import java.util.ArrayList;
import java.util.List;

public class Test13 {

//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//	제한 조건
//	n은 10,000,000,000이하인 자연수입니다.
	
	  public int[] solution(long n) {	//정렬문제가 아니라 뒤집는 문제이다.
	        int[] answer = {};
			String[] ch = Long.toString(n).split("");	//스플릿하여 문자열로 배열 저장
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i<ch.length; i++) {	//for문으로 list에 저장 (여기서 뒤집기)
				list.add(Integer.parseInt(ch[ch.length-(i+1)]));	
			}
			

			answer = new int[list.size()];
			
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
			
			
	        return answer;
	    }
	  
	  public static void main(String[] args) {
		long n=12345;
		Test13 test = new Test13();
		for(int i=0; i<test.solution(n).length; i++) {
			System.out.println(test.solution(n)[i]);
		}
		
	}
}
