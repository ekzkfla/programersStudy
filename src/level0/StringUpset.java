package level0;
/*2022.12.18 문자열 뒤집기 문제
 	
 	문제:	문자열 my_string이 매개변수로 주어집니다.
 	 		my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 	
 	조건:	1 ≤ my_string의 길이 ≤ 1,000
 	
 */

public class StringUpset {
	
	public String stringUpset(String my_string) {
		String answer="";
		
		for(int i=0; i<my_string.length(); i++) {
			answer = answer+my_string.charAt(my_string.length()-1-i);
		}
		return	answer;
	}
	
	
	public static void main(String[] args)throws Exception {
		StringUpset stringUpset	=new StringUpset();
		String my_string="jaron";
		System.out.println(stringUpset.stringUpset(my_string));
		//return	noraj

		String my_string2="bread";
		System.out.println(stringUpset.stringUpset(my_string2));
		//return 	daerb
		
	}
	
	
}
/*	다른사람 풀이식 
 
import java.util.*;

class Solution {
    public String solution(String my_string) {	
        StringBuilder sb = new StringBuilder();	
        sb.append(my_string);		문자열을 붙이는 메소드(.append)	
        sb.reverse();				문자열을 거꾸로 돌리는 메소드(.reverse)

        return sb.toString();
    }
}
 * */
