




//1단계 : 현실의 자동차 객체 모델링
// - 데이터 : 모델명(model), 속도(speed), 남은 연료(fuel)
// - 기능  : 가속하기(accelerate), 상태 확인(checkStatus)

//2단계 : class 설계

public class CarTest {
	//클래스 변수 선언
		//1. 모델명 저장할 변수 선언
		String model;
		//2. 현재 속도 저장할 변수 선언
		int speed;
		//3. 남은 연료(리터) 저장할 변수 선언
		double fuel;
	
	//클래스 메소드 선언
		/*
		 	메소드명 : acclerate
		 	기능    : 연료가 amount 만큼 남아있으면 연료를 소모하고
		 			 속도를 (amount*10)만큼 올린다
		 			 연료가 부족하면 "연료 부족! 가속 실패."출력	 
		 */
	void accelerate(double amount) {
		if(fuel>=amount) {
			fuel -= amount; // 남은 연료에서 사용한 양만큼 차감
			speed += (int)(amount*10); // 실수 결과를 int로 형변환 해서 speed 변수에 저장 
			
		}else {
			System.out.println("연료 부족! 가속 실패");
		}
	}
	/*
	 	메소드명 : checkStatus
	 	기능    : 모델명, 속도, 남은 연료를 한 줄로 출력한다
	 			 "모델 : 000/ 속도 : XXkm/h / 남으 연료 : XXL" 출력
	  */
	void checkStatus(String Status) {
		System.out.println("모델 : " + model + "/ 속도 : " + speed + "km/h / 남은연료 : " + fuel + "L");
	}
	
	public static void main(String[] args) {	
		CarTest car = new CarTest();
		
		
		car.model = "아반떼";
		car.speed = 0;
		car.fuel = 5.0;
		
		car.accelerate(2.0);
		car.accelerate(10.0);
		car.checkStatus(null);
	}

}














