

//예제 : 가변길이 매개변수를 사용해서 합계를 구하는 메소드 만들기 

public class Example5 {
	
	/*
	 	[가변길이 매개변수란?]
	 	
	 	-메서드에서 전달받은 값의 개수를 미리 정하지 않고
	 	메서드를 호출할때 원하는 값을 넘길 수 있게 해주는 변수
	 	
	 	-자바에서는 ...(점3개)를 붙여서 가변길이 매개변수를 표현함.
	 	
	 	
	 	
	 	[가변길이 매개변수 선언 문법]
	 	
	 	public static 반환타입 메서드명(자로형... 매개변수형){
	 	
	 	
	 	}
	 */
	//[메서드 선언]
	//메서드명 : sum
	//기능    : 여러개의 정수 int를 가변길이 매개변수 numbers로 받아서 모두 더한값을 반환해주는 기능 
	public static int sum(int... numbers) {
		//[합계 저장용 변수]
		int total = 0;
		
		//[반복문 : 가변길이 매개변수 numbers로 받은 배열의 값을 반복해서 얻어 모두 더함]
		for(int number : numbers){
			
			total += number;
		}
		return total;
	}
	
	public static void main(String[] args) {
		//1. sum 매소드를 호출할때 1, 2, 3 세개의 값 넘겨주자
		int result1 = sum(1,2,3);
		
		System.out.println("Sum of 1,2,3 = " + result1);
		
		//2. sum 메소드 호출할때 10,20,30,40,50 다섯개의 값 넘겨주자
		int result2 = sum(10,20,30,40,50);
		System.out.println("Sum of 10,20,30,40,50 = " + result2);
		
		//3. sum 메소드 호출할때 아무 값도 안 넘겨줌.
		int result3 = sum();
		System.out.println("Sum of = " + result3);
		
	}

}
