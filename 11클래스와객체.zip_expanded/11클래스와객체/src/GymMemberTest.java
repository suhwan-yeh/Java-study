/*
  스토리 : 헬스장 회원은 남은 PT(개인레슨) 횟를 가진다.
          PT를 사용할 때마다 1회씩 차감되고, 0회면 사용할 수 없다.
*/

//1단계  :  현실의 헬스장 회원 객체 모델링(데이터와 기능 추출)
//- 데이터 :  이름(name),  회원권종류(membership), 잔여 PT횟수(ptCount)
//- 기능 :    PT 사용(usePT),  PT 충전(chargePT), 상태 출력(printStatus)

//2단계  : 헬스장 회원 설계도(class) 만들기  =>>>>>>>>>  클래스변수 +  클래스메소드 로 구성
public class GymMemberTest {
//클래스변수 선언
	String name; 		//1. 회원이름 저장할 변수 선언
	String membership;  //2. 회원권 종류 저장할 변수 선언
	int    ptCount;     //3. 잔여 PT횟수 저장할 변수 선언
	 
//클래스메소드 선언
	/* 
	 메소드명 : usePT
	 기   능  : PT 1회 사용처리 - ptCount가 0보다 크면 1회 차감하고 진행 메시지 출력,
	                          0이면 "PT 횟수가 없습니다. 추가 결제가 필요합니다." 출력
	*/	
	void usePT() {
		//남은 PT횟수가 1회 이상인지 검사
		if(ptCount > 0) {			
			ptCount--;  //1회 차감하고
			System.out.println(name + "님 PT 진행! 남은 횟수: "+ ptCount +"회"); //진행메세지 출력	
		}else {//남은 PT횟수가 0인 경우 검사
			System.out.println("PT 횟수가 없습니다. 추가 결제가 필요합니다."); 
		}
	}
	
	/*
	 메소드명 : chargePT
	 기  능  : PT 횟수 충전 - ptCount에  매개변수 n을 더하고 충전완료 메세지 출력 
	*/
	void chargePT(int n) {
		 ptCount += n; //기존 PT횟수에 충전할 횟수 n을 더함
		 System.out.println(name+"님 PT"+n+"회 충전 완료. 총 잔여: "+ptCount+"회 "); //충전 횟수와 총 잔여 횟수를 출력		 				     
	}
	/*
	메소드명 : printStatus
	기   능 : 회원 상태 출력 - 이름, 회원권, 잔여 PT횟수를 한줄로 출력한다.
	*/
	void printStatus() {
		 System.out.println("이름:" + name + " / 회원권: "+ membership +" / 잔여 PT: "+ ptCount +"회");
		 
	}
	 
	
	public static void main(String[] args) {
	//3단계  :  객체 생성후 데이터 저장 및 사용 
		
		//순서1. 객체 생성  , 참조변수 m
		//클래스명  참조변수명  = new 클래스명();
		GymMemberTest  m  = new GymMemberTest();
		/*
					  m                          0x16 주소값
					[0x16]=  ------------------------------------------------
					         |  String name;       [null]
					         |  String membership; [null]
					         |  int ptCount;       [0]
					         |
					         |  usePT(){}, chargePT(){}, printStatus(){}
					         ------------------------------------------------
	*/				
		//순서2. 객체 데이터 설정
		//회원이름 : "정우성"   저장
		//회원권  : "3개월권"  저장
		//PT횟수 : 1  저장
					  m.name = "정우성";
					  m.membership = "3개월권";
					  m.ptCount = 1;
					  
		
		//순서3. 객체 메소드 호출 해서 기능 사용
		//힌트! 메소드 4번 호출					  
					  m.usePT();  // int ptConut 변수값이?  1 -> 0 로 변경됨
				      m.usePT();  // int ptCount변수값이? 0 이기때문에  사용불가 
					  m.chargePT(5);  //int ptCount변수값이?  0 -> 5 로 변경됨 
					  m.printStatus(); // 이름: 정우성 / 회원권: 3개월권 / 잔여 PT: 5회
					
				/*
					  m                          0x16 주소값
					[0x16]=  ------------------------------------------------
					         |  String name;       [null -> "정우성"]
					         |  String membership; [null -> "3개월권"]
					         |  int ptCount;       [0 -> 1 -> 0 -> 5]
					         |
					         |  usePT(){}, chargePT(){}, printStatus(){}
					         ------------------------------------------------
					         
					 출력 : 정우성님 PT 진행! 남은 횟수: 0회
					        PT 횟수가 없습니다. 추가 결제가 필요합니다.
					        정우성님 PT 5회 충전 완료. 총 잔여: 5회
					        이름: 정우성 / 회원권: 3개월권 / 잔여 PT: 5회
				*/

	}

}








