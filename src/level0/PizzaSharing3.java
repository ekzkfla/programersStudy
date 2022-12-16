package level0;
/*2022.12.16 피자 나눠먹기 3 문제
 	
 	문제:	머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
 	 		피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
 	 		n명의 사람이 최소 한 조각 이상 피자를 먹으려면
 	 		최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 	 		
 	조건:	2 ≤ slice ≤ 10
			1 ≤ n ≤ 100	
 */
public class PizzaSharing3 {
	
	public int pizzaSharing3(int slice,int n ) {
		int answer=0;
		
		if(n%slice==0) {
			answer= n/slice;
		}else {
			answer= n/slice+1;
		}
		
		return answer;
	}
	
	public static void main(String[]args)throws Exception {
		PizzaSharing3 pizzaSharing3=new PizzaSharing3();
		System.out.println(pizzaSharing3.pizzaSharing3(7,10)+"판");
		//조각은 7조각에 인원이 10명인 경우 필요한 판에 갯수 result 2판
		System.out.println(pizzaSharing3.pizzaSharing3(4,12)+"판");
		//조각은 4조각에 인원이 4명인 경우 필요한 판에 갯수 result 3판
	}
}
