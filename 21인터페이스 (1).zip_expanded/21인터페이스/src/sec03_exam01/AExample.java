package sec03_exam01;


/*
 	정적 맴버 중첩 클래스B는 A바깥 외부 클래스 내부에서 사용되기도 하지만,
 	A바깥 클래스 외부에서 A객체와 함께 사용되는 경우가 많기 때문에 
 	주로 default 또는 public 접근 제어자를 사용해서 만들어 놓는다.
 	B 객체는 A클래스 내부 어디든 객체 생성 가능
 */
class A{
	//정적 맴버 중첩 클래스 B선언
	public class B{}
		//인스턴스 변수 field1을 선언하여 B객체의 주소번지 저장가능 
		B field1 = new B();
		static B field2 = new B();
		A(){
			//정적 맴버 중첩 클래스 B의 객체 생성가능!
			B b = new B();
		}
	
	
}




public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
