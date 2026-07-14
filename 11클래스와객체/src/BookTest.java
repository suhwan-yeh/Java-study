


//1단계 : 현실의 도서 객체 모델링
// - 데이터 : 제목(title), 저자(author), 대출여부(isRented)
// -  기능 : 대출(rent), 반납(returnBook), 상태 출력(printStatus)

//2단계 : 현실의 도서를 추상화해서 도서 설계도(class) 설계
 	
public class BookTest {
	//클래스 변수 선언
		String title;
		String author;
		boolean isRented;
		
		
		//
		void rent() {
			if(!isRented) {
				isRented = true;
				System.out.println(title + "대출 완료");
			}else {
				System.out.println("이미 대출 중입니다.");
			}
		}
		void returnBook() {
			isRented = false;
			System.out.println(title + "반납 완료");
		}
		void printStatus() {
			System.out.println("제목 : " + title + " / 저자 : " + author + " / 대출중 : " + isRented);
		}
		public static void main(String[] args) {
			BookTest book = new BookTest();
			
			book.title = "자바의 정석";
			book.author = "남궁성";
			book.isRented = false;
			
			book.rent();
	}

}
