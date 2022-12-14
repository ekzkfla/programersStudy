package level0;


/*2022.12/14 배열의 평균값 문제
 	
 	문제:
 			정수 배열 numbers가 매개변수로 주어집니다.
 		 	numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.	
 
 	조건:	
 			0 ≤ numbers의 원소 ≤ 1,000
			1 ≤ numbers의 길이 ≤ 100
			정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
 */

public class ArrayAverage {
	public double arrayAverage(int[] numbers) {
		double answer=0;	//결과값
		double total=0;		//배열의 총 합계
		
		for(int i=0;i<numbers.length;i++) {
			total +=numbers[i];		
			answer= total/numbers.length;
		}
		return answer;
	}
	
	public static void main(String []args)throws Exception {
		ArrayAverage arrayAverage = new ArrayAverage();
		System.out.println("배열의 평균값 구하기<1~10>");
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arrayAverage.arrayAverage(numbers));
		//return값 : 5.5
		System.out.println("배열의 평균값 구하기<89~99>");
		int [] numbers2= {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(arrayAverage.arrayAverage(numbers2));
		//retrun값 : 94.0
	}
}
