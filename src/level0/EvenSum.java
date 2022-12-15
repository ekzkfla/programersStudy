package level0;
/*  2022.12.15 짝수의 합 문제
 	
 	문제:	정수 n이 주어질 때, 
 			n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 	
 	조건:	0 < n ≤ 1000
 */

public class EvenSum {
	public int evenSum(int n) {
		int answer=0;
		boolean type = 0<n && n<=1000;			//n의 값이 1000 이하 조건
		
		if(type) {								//n의 값이 true 라면 조건 실행 
			for(int i=0; i<=n; i++) {			
				if(i%2==0) {					//i의 값의 2를 나누어 나머지값이 0인경우 = 짝수
					answer +=i;					//의 값을 증가
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args)throws Exception {
		EvenSum evenSum =new EvenSum();
		
		System.out.println(evenSum.evenSum(10)); //n의 값이 10인경우
		//return 30
		System.out.println(evenSum.evenSum(4)); //n의 값이 4인경우
		//return 6
	}
}
