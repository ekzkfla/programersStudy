package level0;
/*2022.12.18 배열 뒤집기 문제
 
 	문제:	정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 	 		num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 	
 	조건:	1 ≤ num_list의 길이 ≤ 1,000
			0 ≤ num_list의 원소 ≤ 1,000
 */

public class ArrayUpset {
	public int[] arrayUpset(int[] num_list) {
		int []answer = new int[num_list.length];
		
		for(int i =0;i<num_list.length;i++) {
			answer[num_list.length-i-1] = num_list[i];
		}
		return answer;
	}
	
	
	public static void main(String[] args)throws Exception{
		ArrayUpset arrayUpset=new ArrayUpset();
		int[] num_list = {1,2,3,4,5};
		System.out.println(arrayUpset.arrayUpset(num_list));
		int[] num_list2 = {1,1,1,1,1,2};
		System.out.println(arrayUpset.arrayUpset(num_list2));
		int[] num_list3 = {1,0,1,1,1,3,5};
		System.out.println(arrayUpset.arrayUpset(num_list3));
	}
	
	
}
