


public class Example4 {
	
	
	//메서드 정의
	/*
	 	1. 메소드명 : printStudentInfo
	 		기능   : 학생명 하나를 문자열로 매개변수로 전달 받고, 학생나이 하나를 매개변수로 전달받아
	 				"이름 : 홍길동, 나이 : 20" <- 출력후 한줄 줄바꿈 ㄱㄱ 
	 				
	 				
	 	2. 메소드명 : add
	 	    기능   : 정수 2개를 매개변수로 각각 전달 받아 합을 구해 반환하는 기능 
	 	    		아무거나 ㄱㄱ 
	 	    		
	 	3. 메소드명 : add2 
	 	    기능   : 실수 2개를 매개변수로 각각 전달 받아 합을 구해 반환하는 기능 
	 */
	
	public static double add2(double num3, double num4) {
		return num3 + num4;
		
	}
	
	//-------------------------------------------------------
	public static int add(int num1, int num2) {
		return num1 + num2;
		
	}
	//--------------------------------------------------------
	public static void printStudentInfo(String name, int age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		
	}
	//-------------------------------------------------------
	public static void main(String[] args) {
		printStudentInfo("홍길동", 30);
		System.out.println(add(5, 10));
		System.out.println(add2(10.0,6.0));
		
		
	}

}


















