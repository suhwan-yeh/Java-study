
public class MethodEx02 {
	
	//sum 매서드
	//기능 : 숫자 1부터 n 매개변수로 전달 받은 갑까지의 합을 구해서 출력하는 기능  
	
	public static void sum(int n) {		//<- int n 을 매개변수라고 부른다. 
		
		int i;   //제어변수 
		int tot=0; //합을 누적할 변수 
		
		for(i=1; i<=n; i++) {
			
			tot += i;
		}
		System.out.println(" 1~ " + n + " = " + tot );
	}
	
	
	//main 메서드 
	//기능 : 자바프로그램의 코드를 처음 실행 시키는 기능 
	public static void main(String[] args) {
			
			//sum 메서드 호출 구문
			sum(10);
	}

}
