
public class for03 {

	public static void main(String[] args) {
			//for 반복문을 제어할 제어변수 i 선언
			int i;
			
			//i변수의 초깃값을 1로 설정하여 1씩 증가시키면서 10이 될때까지 10번반복 
			//힌트)
			
			for(i=1; i<=10; i++){
				
				System.out.println(i + "");
				
			}
			System.out.println("/n------------------>>");
			//i변수값을 초기값을 1로 설정하여 2씩 증가시키면서 10이 될때까지 5번 반복해서 i변수값 가로로 출력
			i=1;
			for(i=1; i<=10; i+=2) {
				
				System.out.println(i + "");
			}
	
			
			System.out.println("/n------------------>>");
			//i변수의 초기값을 2로 설정하여 2씩 증가시키면서 10이 될때까지만 5번 반복해서 i변수값 가로로 출력
			i=2;
			for(i=2; i<=10; i+=2) {
				
				System.out.println(i + "");
				
			}
			
			
			System.out.println("/n------------------>>");
			//i변수의 초깃값을 10으로 설정하여 1씩 감소시키면서 i가 1보다 크거나 같을때까지 반복해서 i변수값 가로로출력
			

			
	}
	
}
