

/* 주제 : for반복문의 다양한 예제 */
public class For03 {
	public static void main(String[] args) {		
		//for 반복문을 제어할 제어변수 i 선언
		int i;
		
		//i변수의 초깃값을 1로 설정하여 1씩 증가시키면서 10이될때까지 10번반복해서 i변수값 가로로 출력
		//힌트) System.out.print(i + " ");
		//1 2 3 4 5 6 7 8 9 10
		for(i=1;  i<=10;  i++) {
			
			System.out.print(i + " ");
		}
	
		System.out.println("\n------------------------>>");	
		//i변수의 초깃값을 1로 설정하여 2씩 증가시키면서 10이 될때까지 5번 반복해서 i변수값 가로로 출력
		//1 3 5 7 9
		for(i=1;   i<=10;   i+=2) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\n------------------------>>");
		//i변수의 초깃값을 2로 설정하여 2씩 증가시면서 10이 될때까지만 5번 반복해서 i변수값 가로로 출력 
		//2 4 6 8 10
		for(i=2;   i<=10;   i+=2) {
			System.out.print(i + " ");
		}
		
	
		System.out.println("\n------------------------>>");
		//i변수의 초깃값을 10으로 설정하여 1씩 감소시키면서 i가 1보다 크거나 같을때 까지 반복해서 i변수값 가로로 출력
		//10 9 8 7 6 5 4 3 2 1
		for(i=10;   i>=1;   i--) {
			System.out.print(i + " ");
		}
			
	}

}
