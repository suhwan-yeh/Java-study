
/*
 	메서드란?
 	어떤 '일'을 대신 처리해주는 작은 프로그램 조각입니다.
 	ex) 두 숫자를 더하기, 글자를 화면에 보여주기
 	메서드는 '반복되는 일' 이나 '특정 기능'을 코드로 묶어서 필요할때마다 부를 수 있도록 도와줌.
 */
//[예제] 기본적인 반환값(되돌려줄값)을 가지는 메소드 만들기 및 사용 


public class Example {

	/*
	 	[사용자 정의 메서드] 란?
	 		- 개발자가 필요에 따라 직접 만드는 메서드.
	 		- 필요한 작업을 미리 만들어두고 필요할때 마다 가져다 쓸 수 있음.
	 		
	 	[작성법]
	 		접근제어자   수정자     반환자료형     메소드명(매개변수, 매개변수)
	 		public   static  int(char..)       add(int a, int b){
	 		
	 			int result = a + b;
	 			return result;
	 			
	 			or
	 			
	 			return a+b; 도 가능 
	 		}  
	 		
	 		
	 		메소드가 해야할 기능을 코드로 작성;
	 		
	 		return 결과값; <- 필수가 아님. 반환할 값이 있을때만
	 		
	 		
	 */
	
	
	
	
	
	
	
	
	
	//메서드 명 : add
	//기능 : 두개의 정수를 num1, num2 매개변수로 각각 전달 받아서 합을 구해서 구한 합을 되돌려주는 기능 
	
	public static int add(int num1, int num2) {
		
		return num1+num2;
		
	}
	
	
	public static void main(String[] args) {

			System.out.println("합계 => " + add(5, 10));
			System.out.println("합계 => " + add(12,20));
	}

}
