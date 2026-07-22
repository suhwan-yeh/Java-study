
/*
  주제 : 메소드 오버로딩 연습
*/

// add라는 동일한 이름의 메소드를 4개 작성 해 놓은  Calculator 설계도(클래스) 만들기
class Calculator {
	
/*
	기본생성자가 자동으로 만들어져 있음
	
	public Calculator() {
		
	}
*/	
	
//add 메소드 오버로딩 하자	
	//1. 두 정수를 매개변수로 전달 받아  합을 구해 반환하는 기능의  add메소드 만들기 
	public int add(int a,  int b) {
					 //5       10  
		return  a + b;	
	//  return  5 + 10;
	//  return   15;	
	}		
	//2. 세 개의 정수를 매개변수로 전달 받아 합을 구해 반환하는 기능의 add메소드 만들기
	public int add(int a,  int b, int c) {
					// 5       10     15
		return  a + b + c;	
	//  return  5 + 10+ 15;
	//  return     30;
	}		
	//3. 두 실수를 매개변수로 전달 받아 두 실수의 합을 구해 반환하는 기능의 add메소드 만들기 
	public double add(double a, double b) {
		return  a + b;
	}
		
	//4. 하나의 정수와 하나의 실수를 순서대로 각각 매개변수로 전달 받아 합을 구해 반환하는 기능의 add메소드 만들기
	public double add(int a,  double b) {
					  //  5,       10.5
		return  a  + b;
	//  return  5  + 10.5;
	//  return  15.5;	
	}

}
public class Main {
	public static void main(String[] args) {
		/* class Calculator 클래스 하나를 이용해  객체 메모리 생성시  기본생성자 호출!  
		 * 단! 참조변수명  calculator */
		Calculator  calculator  = new Calculator();
		
		/* 정수5 와 정수10의 합을 구해 이자리에 15 출력 */
		int result = calculator.add(5, 10);    //<----  public int add(int a,  int b){} 메소드 호출
		//	 15
		System.out.println(result);//15
		
		
		/* 정수5 , 정수10, 정수15의 합을 구해 이자리에 30 출력 */
		result = calculator.add(5, 10, 15);    //<---- public int add(int a, int b, int c){} 메소드 호출
		System.out.println(result); //30
		
		
		/* 실수 5.5, 실수10.5의 합을 구해 이자리에 16.0 출력 */
		System.out.println(calculator.add(5.5, 10.5)); //<--- public double add(double a, double b){} 메소드 호출!
								    //16.0
		
		/* 정수5,  실수10.5의 합을 구해 이자리에 15.5 출력 */
		System.out.println( calculator.add(5,10.5) );  //<--- public double add(int a, double b){} 메소드 호출!
					 				//15.5
		
	}
}








