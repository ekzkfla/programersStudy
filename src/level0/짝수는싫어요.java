package level0;
/*2022.12.15 짝수는 싫어요 문제

	문제 :	정수 n이 매개변수로 주어질 때,
	 		n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	
	조건 :	1 ≤ n ≤ 100
*/

public class 짝수는싫어요 {
	
	public int[]solution(int n){
		int[] answer= new int[(n+1)/2];		//answer의 길이는  n+1/2의 길이만큼
		for(int i=1; i<=n; i++) {			//i는 1부터 시작해서 n의값만큼 이고 i는 증가한다면
			if(i%2==1) {					//만약 i를 2로 나눈 나머지값이 1이라면 = 홀수 
				answer[i/2]=i;				//answer[i/2]의 배열에 =i가 들어간다.
			}
		}
		return answer;
	}
	
	
}
