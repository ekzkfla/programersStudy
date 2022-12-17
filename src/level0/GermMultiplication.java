package level0;
/*2022.12.18 세균증식 문제 
 	
 	문제:	어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 	 		처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
 	 		t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 	
 	조건:	1 ≤ n ≤ 10
			1 ≤ t ≤ 15
 */

public class GermMultiplication {
	public int germMultiplication(int n ,int t) {
		for(int i=1; i<=t; i++) {
			n*=2;
		}
		return n;
	}
	/******************다른사람 풀이식 ******************************************************/	
	/*
	
	public int solution(int n, int t) {
		return n *(int)Math.pow(2,t);
	}
	
	*/
	
	
	public static void main(String[]args)throws Exception {
		GermMultiplication germMultiplication = new GermMultiplication();
		
		
		System.out.println(germMultiplication.germMultiplication(2,10));
		//세균 2, 10시간으로 인한 증식 수  return 2048
		System.out.println(germMultiplication.germMultiplication(7,15));
		//세균 7, 15시간으로 인한 증식 수  return 229376
		
	/*
	  
		System.out.println(germMultiplication.solution(2, 10));
		새로운 방식의 풀이식 
		풀이식 해석 
		Math.pow(n,t);	==>제곱함수이다. 출력은 double형이라 return에 int로 정수 변형하여야한다.
		
	*/
		
	}
	
}






