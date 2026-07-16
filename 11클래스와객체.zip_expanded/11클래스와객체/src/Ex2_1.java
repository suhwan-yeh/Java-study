

//1단계. 보라색원, 빨간색원 , 파란색원 객체들을 모델링하여 데이터 + 기능 추출
//데이터 : 색, 원의 반지름
//기능  : 원의 면적을 구하는 기능 

//2단계. 원 설계도(클래스) 만들기 
class Circle {
//클래스변수 
	double radius; //1.원의 반지름 저장할 변수 
	
//클래스메소드	
	//1. 메소드명 : setRadius
	//	 기능 :  매개변수로 전달받은 반지름 값을 위 raidus변수에 저장하는 기능
	void setRadius(double newRadius){
		radius = newRadius;
	}
	//2. 메소드명 : calcuateArea
	//	 기능 :  원의 면적을 구해서 반환하는 기능 
	double calcuateArea() {
			 
		return  radius * radius * 3.14;  //원 면적 = 반지름 X 반지름  X 3.14;
	}	
}

public class Ex2_1 {
	public static void main(String[] args) {
		//3단계. 2단계에서 만든 class Circle 설계도 하나를 이용해 객체 메모리 생성 후 사용 
		
		//순서1. Circle 설계도(클래스)를 하나를 이용해  객체 메모리 생성후  참조변수에 객체메모리 주소번지 저장
		//클래스자료형   참조변수명 =  new 클래스자료형();
		  Circle        circle =  new Circle();
		  				
		//순서2. 반지름 값 5를  double radius 객체 변수에 저장
		  				circle.setRadius(5);
		  				System.out.println(circle.radius);  //5.0
		
	   //순서3.  원면적을 구하기 위해   new Circle(); 객체메모리내부에 포함된 calculateArea()메소드 호출하자 
		  				System.out.println(  circle.calcuateArea() );  //78.5
		  
/*														0x12  <- 객체메모리에 부여되는 16진수 주소번지 
					[  ox12 ] = ---------------------------------------------------------------
					
								//객체 변수: 원의 반지름 데이터를 저장할 변수
								double radius; [ 0.0d ]  => [ 5.0d]
								
								//객체 메소드  기능 ->  매개변수로 전달 받은 반지름 값을 위 radius변수에 저장 하는 기능
								void setRadius(double newRadius) {
									radius = newRadius;
								}
								
								//객체 메소드 기능 -> 원의 면적을 계산 해서 반환(제공)하는 기능 
								double calculateArea() {		
									return  radius  * radius * 3.14;
								}						  
								
								----------------------------------------------------------------		  
*/		  
		
		  	//3단계. 2단계에서 만든 class Circle 설계도(클래스) 하나를 이용해 객체 메모리 생성 후 사용
  	
  			//순서1. Circle 설계도(클래스)를 하나를 이용해  객체 메모리 생성후  참조변수에 객체메모리 주소번지 저장
			//클래스자료형   참조변수명 =  new 클래스자료형();
		  	  Circle      circle2 =  new Circle();		
		  	   /*		
							0x13   = 
										   			0x13
								     -----------------------------------------------------------
									   //변수
									 	//원의 반지름 데이터를 저장할변수
									 	double radius; [ 0.0D ] => [3.0D]
									 	
									 	//메소드 - 매개변수 newRadius로 전달받은 반지름의 값을  double radius변수에 저장
									 	public void setRadius(double newRadius) {
									 		radius = newRadius;
									 	}
									 	
									 	//메소드  - 원의 면적을 계산해서 반환(제공)하는 기능
									 	public double calculateArea() {
									 		return radius * radius * 3.14;
									 	}
								     
								     -------------------------------------------------------------
		  	   */		
		  				
			//순서2. 반지름 값 3를  double radius 객체 변수에 저장	
		  	  		circle2.radius = 3; 
		  	  		System.out.println(circle2.radius);  //3.0
		  	  		
		    //순서3.  원면적을 구하기 위해   new Circle(); 객체메모리내부에 포함된 calculateArea()메소드 호출하자 
		  	  		double result = circle2.calcuateArea();
		  			System.out.println(result);	  //28.26
		  				
	}//===== main 메소드 끝 

}






