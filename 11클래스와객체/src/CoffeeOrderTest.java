
//1단계 : 현실의 카페 주문 객체 모델링
// - 데이터 : 메뉴(menu), 사이즈(size), 기본가격(basePrice)
// - 기능  : 최종가격 계산(calcPrice), 영수증 출력(printReceipt)

//2단계 : class (설계도) 만들기
public class CoffeeOrderTest {
		//1. 메뉴명 변수 선언
		String menu;
		//2. 사이즈 저장 변수 선언("TALL" OR "GRANDE")
		String size;
		//3. 기본가격 저장 변수 선언 
		int basePrice;
		
		//1. 메소드 명 calcPrice 
		// - size가 "GRANDE" 면 기본가격 + 500 , 아니면 기본가격 그대로 반환
		int calcPrice() {
			if(size.equals("GRANDE")) {
				return basePrice += 500;
			}else {
				return basePrice;
			}
		}
		//2. 메소드명 : printReceipt
		// - calcPrice()를 호출해 "[영수증] 메뉴 : 000 (사이즈) / 가격 : xxxx원" 출력
		void printReceipt() {
			int price = calcPrice();
			System.out.println("[영수증] 메뉴 : " + menu + "(" + size + ")" + "/ 가격 : " + price + "원");
			
		}
	public static void main(String[] args) {
		//3단계 : CoffeOrderTest 클래스 하나를 이용해 new 객체 생성후 데이터 저장 
		// order 객체 생성
		CoffeeOrderTest order = new CoffeeOrderTest();
		
		//메뉴명 -> "아메리카노"
		order.menu = "아메리카노";
		
		//사이즈 -> "GRANDE"
		order.size = "GRANDE";
		
		//기본가격 -> 4000
		order.basePrice = 4000;
		
		//순서2. 메소드 호출해서 사용!
		order.printReceipt();
		//출력 : [영수증] 메뉴 : 아메리카노(GRANDE) / 가격 :4500원 
		
		
	}

}
