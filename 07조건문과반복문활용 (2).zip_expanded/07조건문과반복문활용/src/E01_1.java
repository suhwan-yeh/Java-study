



//[예제] 1부터 10사이의 짝수의 합과 홀수의 합 구하기 

public class E01_1 {
	public static void main(String[] args) {
		
		int n;					//제어변수 선언
		int odd_tot, even_tot; //홀수의 합과 짝수의 합을 누적해서 저장할 변수 선언 
		
		for(odd_tot=0, even_tot=0,  n=1;    n<=10;    n++) {
			
			if(n%2 == 0) { //n을 2로 나눈 나머지가 0이면 짝수 이므로 
				even_tot += n; //짝수누적 
			}else {
				odd_tot += n;//홀수누적
			}
		}
		
				
		System.out.println("odd_tot(1+3+5+7+9) = " + odd_tot); //홀수의 합 출력 
						  //odd_tot(1+3+5+7+9) = 25
	
		System.out.println("even_tot(2+4+6+8+10) = " + even_tot);//짝수의 합 출력
						 //even_tot(2+4+6+8+10) = 30
		
	}

}




