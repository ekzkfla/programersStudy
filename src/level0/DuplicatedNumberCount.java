package level0;
/*2022.12.15 중복된 숫자 갯수풀이
 	
 	문제:	정수가 담긴 배열 array와
 	 		정수 n이 매개변수로 주어질 때,
 	 		 array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.	
 	
 	조건:	1 ≤ array의 길이 ≤ 100
			0 ≤ array의 원소 ≤ 1,000
			0 ≤ n ≤ 1,000
 */

public class DuplicatedNumberCount {
	
	public int douplicatedNumberCount(int[] array,int n) {
		int answer=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				answer++;
			}
		}
		
		return answer;
	}
		
	
	public static void main(String[] args)throws Exception {
		DuplicatedNumberCount numberCount= new DuplicatedNumberCount();
		//1번 문제 
		int[]array = {1,1,2,3,4,5};		//배열의 값
		int n = 1;						//찾는 숫자
		System.out.println(numberCount.douplicatedNumberCount(array, n));
		// return 2;
		int[]arrays = {0,2,3,4}; 
		int n2 = 1;
		System.out.println(numberCount.douplicatedNumberCount(arrays, n2));
		// return 0;
		
	}
	
	
	
}
