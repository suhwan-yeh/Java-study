
/*
  스토리 :  카페이서 음료 한잔을 주문한다.
           사이즈 (TALL/ GRANDE)에 따라 가격이 달라지고, 결제 후 영수증을 출력한다.
*/
//1단계 : 현실의 카페 주문 객체 모델링
//- 데이터  : 메뉴(menu), 사이즈(size), 기본가격(basePrice)
//- 기능   :  최종가격 계산(calcPrice),  영수증 출력(printReceipt)

//2단계 : class(설계도) 만들기 
public class CoffeeOrderTest {

	//클래스 변수 선언
		String menu;    //1. 메뉴명을 저장할 변수 선언
		String size;    //2. 사이즈 저장할 변수 선언 ("TALL" 또는 "GRANDE")
		int   basePrice;//3. 기본가격을 저장할 변수 선언
	
	//클래스 메소드 선언
		/*
		  메소드명 : calcPrice
		  기능  :  size가 "GRANDE"면 기본가격 + 500원,  아니면  기본가격 그대로 반환
		 */
		int calcPrice() {
			
			 // 문자열 비교는 == 이 아니라 equals() 사용 → 사이즈가 GRANDE인지 검사
			if(size.equals("GRANDE")) {		
				
				return basePrice + 500; 	
				
			}else {// 아니면  기본가격 그대로 반환	
				
				return basePrice;		
			}
		}
		/*
		 메소드명 : printReceipt
		 기   능  : calcPrice()를 호출해 "[영수증] 메뉴: OOO(사이즈) / 가격: XXXX원" 출력
		*/
		void printReceipt() {
			
			//같은 객체의 calcPrice() 호출 -> 반환값을 지역변수 price에 저장 
			int price = calcPrice();
			
			//메뉴 사이즈 최종가격을 영수증 형식으로 출력
			System.out.println("[영수증] 메뉴: "+ menu+"("+ size +") / 가격: "+ price +"원");
		}
	
	public static void main(String[] args) {
		//3단계 :  CofferOrderTest 클래스 하나를 이용해 new 로 객체 생성 후 데이터 저장 및 사용
		//순서1+순서2.  order객체 생성 ! 
		CoffeeOrderTest   order = new CoffeeOrderTest();
		/*
						 order                       0x16 주소값
						[0x16]  = ------------------------------------------------
						         |  String menu;   [null]
						         |  String size;   [null]
						         |  int basePrice; [0]
						         |
						         |  calcPrice(){}, printReceipt(){}
						         ------------------------------------------------
	*/
		//순서3. order객체 데이터 설정
		                  order.menu = "아메리카노";       //메뉴명 -> "아메리카노" 저장
		                  order.size = "GRANDE";  		//사이즈 -> "GRANDE"  저장
		                  order.basePrice = 4000;		//기본가격 -> 4000    저장
		
		//순서4.   메소드 호출해서 사용!
		//출력 : [영수증] 메뉴: 아메리카노(GRANDE) / 가격: 4500원   
		                  order.printReceipt();
		                  
	          		/*
		     			 order                       0x16 주소값
		     			[0x16]=  ------------------------------------------------
		     			         |  String menu;   [null -> "아메리카노"]
		     			         |  String size;   [null -> "GRANDE"]
		     			         |  int basePrice; [0 -> 4000]
		     			         |
		     			         |  calcPrice(){}, printReceipt(){}
		     			         ------------------------------------------------
		     			         
		     			 ※ calcPrice() 반환값 4500은 메소드 안의 지역변수(price)라
		     			   객체 메모리에는 저장되지 않는다.
		     			   
		     			 출력 : [영수증] 메뉴: 아메리카노(GRANDE) / 가격: 4500원
	          		 */                
		                  
		                  
	}

}





