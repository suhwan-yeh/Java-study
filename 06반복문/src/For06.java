


/*
   1부터 100까지 소수 모두 출력하고 , 그 총합 구하기
   
   ※
 */


public class For06 {

	public static void main(String[] args) {

		int primeSum = 0; 
		int count = 0;
		
		System.out.println("<< 1~100 사이의 소수 목록>>");
		
		//1은 소수가 아니므로 2~100까지 ㄱㄱ
		for(int i=2; i<=100; i++) {
			
			boolean isPrime = true; 
		
		//2부터 자기자신 (i변수값) 보다 1작은수까지 나누어본다
		for(int j=2; j<i; j++) {
			
			//나누어 떨어지는 수가 하나라도 있으면 소수가 아님
			if(i % j == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		// 안쪽 내부 for반복문이 끝난 후, isPrime이 여전히 true 라면 소수
		if(isPrime) {
			System.out.print(i + "\t");
			primeSum += i;
			count++;
			
			if(count % 5 ==0) {
				System.out.println();
			}
		}
		
		}
		
		
		
	}

}
