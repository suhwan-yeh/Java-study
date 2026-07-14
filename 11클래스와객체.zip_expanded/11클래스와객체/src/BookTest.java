
/*
 스토리. 도서관 책 한권을 관리 한다.  
       대출 여부를 두고, 이미 대출 중이면 다시 대출 할수 없다.
*/

// 1단계 : 현실의 도서 -"자바의정석", "수학의정석" 객체 모델링( 데이터 와 기능 추출 )
// - 데이터 : 제목(title), 저자(author), 대출여부(isRented)
// - 기능   : 대출(rent), 반납(returnBook), 상태 출력(printStatus)


// 2단계 : 현실의 도서를 추상화해서 도서 설계도(class) 설계
public class BookTest {
//클래스 변수 선언 
	String title;     //1. 책 제목 저장할 변수 선언
	String author;    //2. 책 저자 저장할 변수 선언
	boolean isRented; //3. 대출 여부 저장할 변수 선언 
	
//클래스 메소드 선언
	/*
	 메소드명 : rent
	 기   능  : 대출 중이 아니면 대출 처리하고 완료 메시지 출력,
	            이미 대출 중이면 "이미 대출 중입니다." 출력
	*/
	void rent() {		
		if(!isRented) {  //대출 중이 아닌지 검사 (! 는 부정 -> false이면 true가 됨) 
			
			isRented = true; //대출상태로 변경
			System.out.println(title + " 대출 완료"); //대출 완료 메세지 출력
			
		}else {//이미 대출 중이면 	
			System.out.println("이미 대출 중입니다.");
		}
	}	
	
	/*
	 메소드명 : returnBook
	 기   능  : isRented를 false로 바꾸고 반납 완료 메시지 출력
	*/
	void returnBook() {
		isRented = false;  //대출상태를 해제 (반납)
		System.out.println(title + "반납 완료"); 
	}	
	/*
	 메소드명 : printStatus
	 기   능  : 제목, 저자, 대출여부를 한 줄로 출력한다
	*/
	void printStatus() {
		//세 객체 변수 값들 한줄로 출력
		System.out.println("제목: " + title + " / 저자: " + author + " / 대출중: " + isRented);
	}	

	public static void main(String[] args) {
		//3단계 : new 연산자로 객체 메모리 생성 후 사용
		
		//순서1+2.  참조변수선언  + 객체 메모리 생성
		BookTest  book = new BookTest();
		/*
				 book                        0x16 주소값
				[0x16] =  ------------------------------------------------
				         |  String title;    [null]
				         |  String author;   [null]
				         |  boolean isRented;[false]
				         |
				         |  rent(){}, returnBook(){}, printStatus(){}
				         ------------------------------------------------
	   */
		
		//순서3. 객체 메모리 내부에 포함된 객체변수 값 설정
				 book.title = "자바의 정석";
				 book.author = "남궁성";
				 book.isRented = false;
				 
		//순서4. 객체 메소드 호출해서 렌트도 하고 반납도 합시다
				 book.rent();      // false -> true
				 book.rent();      //  이미 대출 true -> 대출 실패 
				 book.returnBook();//자바의 정석반납 완료
				 book.printStatus();
		/*
						 book                        0x16 주소값
						[0x16]=  ------------------------------------------------
						         |  String title;    [null -> "자바의 정석"]
						         |  String author;   [null -> "남궁성"]
						         |  boolean isRented;[false -> true -> false]
						         |
						         |  rent(){}, returnBook(){}, printStatus(){}
						         ------------------------------------------------
						 출력 : 자바의 정석 대출 완료
						        이미 대출 중입니다.
						        자바의 정석 반납 완료
						        제목: 자바의 정석 / 저자: 남궁성 / 대출중: false
			*/
				 	
		
	}

}





