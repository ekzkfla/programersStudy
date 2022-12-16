package level0;
/*2022.12.16 피자나눠 먹기1 문제
 
 	문제:	머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
 			피자를 나눠먹을 사람의 수 n이 주어질 때,
 			모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 			
 	조건:	1 ≤ n ≤ 100		
 */
public class PizzaSharing1 {
	
	public int pizzaSharing1(int n) {
		int answer=0;
		if(n%7==0) {				//피자 한판에 7조각이므로 나눠서 나머지가 없다면 
			answer = n/7;			//인원수 나누기 7의 값이 필요한 피자판의 갯수
		}else{
			answer = n/7+1;			//7조각으로 나머지가 있다면 인원수 나누기 7에 더하기 1을 한 판의 갯수
		}
		return answer;
	}
	
	public static void main(String[]args)throws Exception {
		PizzaSharing1 pizzaSharing1	=new PizzaSharing1();
		
		System.out.println(pizzaSharing1.pizzaSharing1(7)+"판");
		//인원수 7명일때 필요한 피자 판의 갯수 result 1판
		System.out.println(pizzaSharing1.pizzaSharing1(1)+"판");
		//인원수 7명일때 필요한 피자 판의 갯수 result 1판
		System.out.println(pizzaSharing1.pizzaSharing1(15)+"판");
		//인원수 7명일때 필요한 피자 판의 갯수 result 3판
	}
}
