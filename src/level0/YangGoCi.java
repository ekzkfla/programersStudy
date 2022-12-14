package level0;
/*2022.12.14 양꼬치 문제
	문제:
			머쓱이네 양꼬치 가게는 
			10인분을 먹으면 음료수 하나를 서비스로 줍니다.
			양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
			정수 n과 k가 매개변수로 주어졌을 때, 
			양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 
			return 하도록 solution 함수를 완성해보세요.
			
	조건:	0 < n < 1,000
			n / 10 ≤ k < 1,000
			서비스로 받은 음료수는 모두 마십니다.	
			
*/
public class YangGoCi {
	
	public int yangGoCi(int n,int k) {
		int answer = 0;				//총 결제 가격
		int food = n*12000;			//n인분의 음식값 (food)
		int drink= k*2000;			//k개 의 음료수값 (drink)
		int dsCount=(n/10)*2000;	//10인분 이상인 경우 발생하는 할인 값
		
		if(n/10==0) {				//10인분 이하 주문시 음료수 할인 x
			answer = food+drink;
		}else if (n/10>=1) {		//10인분 이상 주문시 10인분에 음료수 1개 할인
			answer = food+drink-dsCount;
		}
		return answer;
		
	}
	
	
		
/*출력 테스트 */	
	public static void main(String[] args) throws Exception{
		YangGoCi yangGoCi =new YangGoCi();
		System.out.println(yangGoCi.yangGoCi(10, 3)+"원");
		
		//124000원
	}

}







	

