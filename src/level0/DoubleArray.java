package level0;
/*2022.12.15 배열 두배 만들기 문제
 	
 	문제:	정수 배열 numbers가 매개변수로 주어집니다.
 	 		numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 	
 	조건:	-10,000 ≤ numbers의 원소 ≤ 10,000
			1 ≤ numbers의 길이 ≤ 1,000
 */

public class DoubleArray {
		
	public int[] doubleArray(int[] numbers) {
		int[] answer = new int [numbers.length];
		
		for(int i=0;i<numbers.length;i++) {
			answer[i]=numbers[i]*2;
		}
		
		return answer;
	}
	
	public static void main(String[] args)throws Exception {
		DoubleArray doubleArray =new DoubleArray();
		int[]numbers = {1,2,3,4,5};
		int[]numbers2 = {1,2,100,-99,1,2,3};
		System.out.println(doubleArray.doubleArray(numbers));
		
		//return {2,4,6,7,10}
		System.out.println(doubleArray.doubleArray(numbers2));
		//return {2, 4, 200, -198, 2, 4, 6}
		
		//질문... 배열의 숫자들을 출력하고 싶은데 어찌 해야할라나??ㅣ,.,.
	}
	
}
