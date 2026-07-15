/*

스토리:

장바구니 하나에는 상품 1종류의 이름·단가·수량이 담긴다(간단 버전). 
수량을 추가하고, 총 합계를 계산한다.

*/
// 1단계 : 현실의 쇼핑 장바구니 객체 모델링
// - 데이터 : 상품명(itemName), 단가(price), 수량(quantity)
// - 기능   : 수량 추가(addQuantity), 합계 계산(calcTotal), 장바구니 출력(printCart)

// 2단계 : 자바 코드로 class 설계 (데이터=변수 + 기능=메소드)
public class ShoppingCartTest {
	
	//클래스 변수 선언	
		String itemName; 	// 상품명 저장할 변수	
		int price;         	// 단가 저장할 변수	
		int quantity;       // 수량 저장할 변수

	//클래스 메소드 선언
		/*
		 메소드명 : addQuantity
		 기   능  : quantity에 n을 더하고 변경된 수량을 출력한다
		*/
		void addQuantity(int n) {
			 quantity += n;  //현재 수량에 추가할 개수 n을 더함
			 System.out.println(itemName + "수량이 " + quantity + "개로 변경되었습니다.");  //변경된 수량을 출려한다.
		}

		/*
		 메소드명 : calcTotal
		 기   능  : price * quantity 합계값을 반환한다
		*/
		int calcTotal() {
			//합계 = 단가 X 수량
			return price * quantity;
		}

		/*
		 메소드명 : printCart
		 기   능  : calcTotal()을 호출해 상품명, 수량, 합계를 출력한다 => 장바구니 상품 정보 출력 
		*/
		void printCart() {
			
			//합계 구하기 
			 int total = calcTotal(); //같은 객체의 calcToTal() 호출 -> 합계를 지역변수 total에 저장
			 
			//상품명 ,  수량,  합계를 한줄로 출력
			 System.out.println("상품명: " + itemName + " / 수량: " + quantity +"개" 
					 		     + " / 합계: " + total + "원");			 
		}

	public static void main(String[] args) {
		// 3단계 : ShoppingCart 객체 생성 후 데이터 저장 및 사용
		//1. 객체 생성
		ShoppingCartTest cart = new ShoppingCartTest();
		/*
						 cart                        0x16 주소값
						[0x16]=  ------------------------------------------------
						         |  String itemName; [null]
						         |  int price;       [0]
						         |  int quantity;    [0]
						         |
						         |  addQuantity(){}, calcTotal(){}, printCart(){}
						         ------------------------------------------------
	*/
		//2. 데이터 저장
		cart.itemName = "무선 마우스";
		cart.price = 15000;
		cart.quantity = 1;

		//3. 기능 호출
		cart.addQuantity(2); // 1 -> 3로 변경 
		cart.printCart();    //내부에서 calcTotal() 호출 -> 합계 = 45000원 구함 
								/*
								 cart                        0x16 주소값
								[0x16]=  ------------------------------------------------
								         |  String itemName; [null -> "무선 마우스"]
								         |  int price;       [0 -> 15000]
								         |  int quantity;    [0 -> 1 -> 3]
								         |
								         |  addQuantity(){}, calcTotal(){}, printCart(){}
								         ------------------------------------------------
								 출력 : 무선 마우스 수량이 3개로 변경되었습니다.
								        상품: 무선 마우스 / 수량: 3개 / 합계: 45000원
							  */
		
		
	}
}




