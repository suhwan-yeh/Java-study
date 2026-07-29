package sec04.exam02;

/*
  	로컬(지역) 중첩 클래스란?
  		- 바깥 외부 클래스 내부에 만들기는 하지만
  		  바깥 외부 클래스의 생성자 또는 메소드 중괄호 {} 내부에 만들어지는 중첩 클래스.
 */
class A{
	A(){
		class B{}
		B b = new B();
	}
}


public class Example2 {

}
