package level0;


/*2022.12.15 중앙값 구하기
 
 	문제 :	중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때
 	 		가장 중앙에 위치하는 값을 의미합니다.
 	 		예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
 	 		정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 	
 	조건 :	array의 길이는 홀수입니다.
			0 < array의 길이 < 100
			-1,000 < array의 원소 < 1,000
 */


import java.util.Arrays;						//Arrays 자바 import *중요!*

public class ArrayMedian {
	public int arrayMedian(int[]array) {
		int answer=0;					
		Arrays.sort(array);						//Arrays클래스 메소드 기능중 하나인 sort =정렬(내림차순)
		answer= array[array.length/2];			//array[array의 길이/2] =answer
		return answer;
	}
	
	public static void main(String[]args)throws Exception {
		ArrayMedian arrayMedian =new ArrayMedian();
		int[] array = {1,2,7,10,11};
		System.out.println(arrayMedian.arrayMedian(array));
		//return 7
		int[] arrays = {9,-1,0};
		System.out.println(arrayMedian.arrayMedian(arrays));
		//return 0
	}
}
