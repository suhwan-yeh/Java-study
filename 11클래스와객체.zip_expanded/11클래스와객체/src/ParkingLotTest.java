/*
 스토리 : 주차장 관리 
 
 		주차장은 총 자리 수와  현재 주차된 차량수를 가진다.
 		
 		자리가 다 차면 입차 할수 없고, 차가 없으면 출차할수 없다.

객체 지향 프로그래밍 기법 3단계 중에서

	1단계 : 현실의 주차장 객체 모델링 
	데이터 - 총 자리수(totalSpots),  현재 주차된 차량수(currentCars) 
	기능 -  입차(enter),  출차(exit),  남은 자리 확인(checkAvailable)
*/
//2단계 : 주자창 설계도(class) 만들기 
public class ParkingLotTest {

//클래스 변수 선언
	//1. 총 주차 가능 자히수 저장할 변수 선언
	//2. 현재 주차된 차량수 저장할 변수 선언
	int totalSpots;
	int currentCars;
	
//클래스 메소드 선언 	
	/*
		메소드명 : enter
		기  능 :  입차 처리 -  자리가 남아 있으면 입차처리, 자리가 없으면 "만차입니다. 입차 불가" 출력
	*/
	void enter() {
		if(currentCars < totalSpots) {
			currentCars++;
			System.out.println("입차 완료! 남은자리 : " + (totalSpots - currentCars) + "자리");
		}else {
			System.out.println("만차입니다. 입차 불가 ");
		}
	}
	/*
		메소드명 : exit
		기  능 :  출차 처리  - 주차된 차량이 있으면 출차처리, 없으면? "주차된 차량이 없습니다." 출력
	*/
	void exit() {
		if(currentCars > 0) {
			currentCars--;
			System.out.println("출차 완료! 남은자리 :" + (totalSpots - currentCars) + "자리");
		}else {
			System.out.println("주차된 차량이 없습니다.");
		}
		
	}
	/*
		메소드명 : checkAvailable
		기  능 : 남은자리수 출력 - 현재 차량수를 계산해서 출력
	*/
	void checkAvailable() {
		int available = totalSpots - currentCars;
		System.out.println("현재 남은자리 : " + available + "/ 총 " + totalSpots + "자리");	
	}
	public static void main(String[] args) {
		//3단계 : new 연산자로 객체 메모리 생성 후 사용
		
		ParkingLotTest lot = new ParkingLotTest();
		
		lot.totalSpots = 2;
		lot.currentCars = 0;
			
		/*	  힌트: 메소드 6번 호출해서 아래와 같이 출력 되게 하면 됩니다.
		 
 			  출력 : 입차 완료! 남은 자리: 1자리
			        입차 완료! 남은 자리: 0자리
			        만차입니다. 입차 불가.
			        현재 남은 자리: 0 / 총 2자리
			        출차 완료! 남은 자리: 1자리
			        현재 남은 자리: 1 / 총 2자리 
		 */
		lot.enter();
		lot.enter();
		lot.enter();
		lot.checkAvailable();
		lot.exit();

	}

}







