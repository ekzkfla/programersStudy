package level0;


public class 짝수는싫어요 {
	
	public int[]solution(int n){
		int[] answer= new int[(n+1)/2];
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				answer[i/2]=i;
			}
		}
		return answer;
	}
}
