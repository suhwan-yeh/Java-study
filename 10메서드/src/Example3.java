
public class Example3 {
	
	/*
 	반환할 값이 없고 매개변수도 없는 메소드 작성 방법 
 		public static void 메소드명(){
 		
 			메소드가 해야 할 기능 코드;
 		}
 
 */
	public static void greet() {
		System.out.println("안녕하세요");
		
	}
	
	public static void main(String[] args) {
		
		//"안녕하세요"출력하고 싶을때 greet() 메소드 호출 
		greet();
		for(int i=1; i<=10; i++) {
			
			greet();
		}
	}

}
