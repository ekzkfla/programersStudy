package level0;
/*2022.12.14 각도기 문제 
 
	문제:
			각에서 0도 초과 90도 미만은 예각,
			90도는 직각, 
			90도 초과 180도 미만은 둔각
			180도는 평각으로 분류합니다.
			각 angle이 매개변수로 주어질 때 
			예각일 때 1, 
			직각일 때 2, 
			둔각일 때 3, 
			평각일 때 4를 return하도록 solution 함수를 완성해주세요.
	
	조건:	0 < angle ≤ 180
			angle은 정수입니다.

 */

public class Angle {
	
	public int angle(int angle) {
		int answer = 0;
		if(0<angle&&angle<90) {
			//예각인 경우 ( 0 < angle < 90 )
			answer=1;
		}else if(angle==90) {
			//직각인 경우 ( angle = 90 )
			answer=2;
		}else if(90<angle&&angle<180) {
			//둔각인 경우 ( 90 < angle < 180 )
			answer=3;
		}else if(angle==180){
			//평각인 경우 ( angle = 180 )
			answer=4;
		}
		return answer;
	}
	
	
	public static void main(String [] args)throws Exception {
		Angle angle=new Angle();
		System.out.println("---각도가 70인경우----");
		System.out.println(angle.angle(70));
		// return값 1
		System.out.println("---각도가 91인경우----");
		System.out.println(angle.angle(91));
		// return값 3
		System.out.println("---각도가 180인경우----");
		System.out.println(angle.angle(180));
		// return값 4
	}
	
}
