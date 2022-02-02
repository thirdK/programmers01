package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test12 {
//	함수 solution은 정수 n을 매개변수로 입력받습니다. 
//	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//	예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//	제한 조건
//	n은 1이상 8000000000 이하인 자연수입니다.

	public long solution(long n) {
		long answer = 0;

		String[] str = Long.toString(n).split("");	//long타입을 String타입 배열로 대입
		long[] sort = new long[str.length];

		
		for (int i = 0; i < str.length; i++) {		//String타입배열을 Long타입 배열로 대입
			sort[i] = Long.parseLong(str[i]);
		}

		for (int i = 1; i < sort.length; i++) {		//내림차순정렬
			for (int j = 0; j < sort.length - i; j++) {
				long temp = Math.min(sort[j], sort[j + 1]);
				sort[j] = Math.max(sort[j], sort[j + 1]);
				sort[j + 1] = temp;
			}
		}

		for (int i = 0; i < sort.length; i++) {		//다시 String배열로 변환
			str[i] = Long.toString(sort[i]);
		}
		String strCh = String.join("", str);		//배열 내용 합쳐서 String으로 변환
		answer = Long.parseLong(strCh);				//Long으로 변환해서 대입
		
		return answer;
	}
	//==========================================================================================
	public static void main(String[] args) {
		//ArrayList를 이용하여 정렬하기
		long n = 783191613;
		//우선 배열로 받기위해 String
		String[] str = Long.toString(n).split("");
		List<Long> list = new ArrayList<Long>();
		String res = "";	//마지막 결과를 위한 변수
		
		for(int i=0; i<str.length; i++) {	//list에 long타입으로 대입
			list.add(Long.parseLong(str[i]));
		}
		
		list.sort(Comparator.reverseOrder()); //내림차순
		
		for(long num : list) {
			res += Long.toString(num);	//각 index의 값을 String으로 합치기
		}
		
		System.out.println(Long.parseLong(res));	//long으로 출력
				
//		===============================================================================
		//stream 사용 연습
		List<String> list2 = Arrays.stream(str).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//아직 어렵다.
		
		
//		for(String nn : list2) {
//			System.out.println(nn);
//		}
		
//		Arrays.stream(str).collect(Collectors.toList()).sort(Comparator.reverseOrder());
		
	}
	
	
	
}























