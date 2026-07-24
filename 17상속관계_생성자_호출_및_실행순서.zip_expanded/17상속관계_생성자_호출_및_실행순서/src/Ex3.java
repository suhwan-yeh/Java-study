

/*
 	조합3. 상속관계에서 자식 객체 메모리 생성시 ~ 매개변수가 1개 작성된 생성자를 호출하면
 	      부모클래스의 기본생성자가 ~~ super(); 구문에 의해 자동으로 호출되는 조합
 
 			new 자식클래스생성자(값); ---->  부모클래스의 기본생성자 가 호출되어 실행됨 
 */

class F { //부모 클래스 

	public F() {  System.out.println("부모 F의 기본생성자 실행됨");  }  //F의 기본생성자
	
	public F(int d) {  System.out.println("부모 F의 매개변수1개 작성된 생성자 실행됨"); }  //F의 매개변수 1개인 생성자 
}

//부모 F클래스를 상속받아 새롭게 확장한 자식 G클래스 만들기 
class G  extends F {
	
	//기본생성자 
	public G() {
		//super(); F부모 기본생성자 호출 구문 생략됨 !
		System.out.println("자식 G의 기본생성자 실행됨");
	}
	
	//매개변수가 1개 작성된 생성자 <=============== 이예제에서  생성자 무조건 호출된다!
	public G(int x) {
		//super(); F부모 기본생성자 호출 구문 생략됨 !  <================================ 이구문 무조건 실행됨 것임
		System.out.println("자식 G의 매개변수가 1개 작성된 생성자 실행됨");
	}
}

public class Ex3 {
	public static void main(String[] args) {
		
			//G 자식 클래스의  매개변수가 1개 작성된 생성자 호출 하면서 자식 G객체 생성
			new G(5);

	}

}





