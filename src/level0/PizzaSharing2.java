package level0;
/*2022.12.16 피자 나눠먹기 2 문제
 	
 	문제:	머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
 	 		피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
 	 		n명이 주문한 피자를 남기지 않고 
 	 		모두 같은 수의 피자 조각을 먹어야 한다면
 	 		최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 	
 	조건:	1 ≤ n ≤ 100		
 */
public class PizzaSharing2 {
	
	public int pizzaSharing2(int n ) {
		int answer=1;
		
		while((answer*6)%n !=0) {		//While문을 이용하여 반복 ->나누어 나머지값이 있는경우 answer 증가 
			answer++;
		}
		return answer;
	}
	
	public static void main(String[]args)throws Exception {
		PizzaSharing2 pizzaSharing2=new PizzaSharing2();
		System.out.println(pizzaSharing2.pizzaSharing2(6)+"판");
		//인원이 6명 경우 필요한 판에 갯수 result 1판
		System.out.println(pizzaSharing2.pizzaSharing2(10)+"판");
		//인원이 10 경우 필요한 판에 갯수 result 5판
		System.out.println(pizzaSharing2.pizzaSharing2(4)+"판");
		//인원이 4명 경우 필요한 판에 갯수 result 2판
	}
}
