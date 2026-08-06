/*
	주제 : 컬렉션 + 제네릭 응용 - 게시판 글 목록 만들기 (JSP 웹개발 핵심 패턴 미리보기)

	■ 이 예제를 배우는 이유 (JSP/Spring 연결 - 매우 중요!)

	   웹 게시판의 동작 순서는 다음과 같다.

	     1. DB의 게시판 테이블에서 글들을 조회한다 (글 1줄 = 행 1개)
	     2. 조회된 행 하나하나를 "자바 객체" 하나하나로 만든다        <- DTO 클래스
	     3. 그 객체들을 가변 배열에 순서대로 담는다                  <- ArrayList<DTO>
	     4. JSP 화면에서 배열을 반복문으로 돌며 <table>에 출력한다    <- 향상된 for문

	   즉 "내가 만든 클래스를 제네릭 타입으로 지정한 ArrayList"가
	   DB와 웹 화면 사이에서 데이터를 나르는 그릇이 된다.
	   JSP/Spring 수업 내내 이 패턴을 매일 쓰게 되므로 지금 확실히 익혀 두자.

	■ 용어 정리
	   DTO (Data Transfer Object) : 데이터를 담아 나르는 용도로만 만드는 클래스.
	       DB 테이블의 컬럼(열) 하나가 DTO의 멤버 변수 하나에 대응된다.
	       (현장에 따라 VO, Bean 이라고도 부른다)

	■ 지금까지와 달라지는 점
	   지금까지 제네릭 <> 안에는 String, Integer처럼 자바가 만들어 둔 클래스만 넣었다.
	   -> 이번에는 "내가 직접 만든 BoardDTO 클래스"를 넣는다!
	      List<BoardDTO> : BoardDTO 객체만 저장할 수 있는 가변 배열
*/
//─────────────────────────────────────────────────────────────
// 게시판 글 1건을 표현하는 DTO 클래스
//
// DB의 board 테이블                     BoardDTO 클래스
//   no    (글 번호 컬럼)      <->        int    no
//   title (제목 컬럼)         <->        String title
//   writer(작성자 컬럼)       <->        String writer
//   hit   (조회수 컬럼)       <->        int    hit
//
// -> 테이블의 행(row) 1개  =  BoardDTO 객체 1개
//─────────────────────────────────────────────────────────────

import java.util.ArrayList;
import java.util.List;

class BoardDTO {	
	//멤버변수 : DB 컬럼 하나가 변수 하나에 대응된다.
	//private :  외부에서 변수에 직접 접근 하지 못하게 막고 (정보은닉)
	//           아래의 getter 역할을 하는 메소드를 통해서만 값을 꺼내게 한다.(DTO 작성 표준)
	private int	no;       	//글 번호 
	private String title; 	//글 제목
	private String writer;	//작성자
	private int hit;      	//조회수
	
	//생성자 : 글 1건의 데이터 4개를 전달받아 멤버 변수에 저장하며 객체를 만든다.
	public BoardDTO(int no, String title, String writer, int hit) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.hit = hit;
	}
	//getter 메소드들 : private 멤버 변수의 값을 외부( .jsp 화면 등)에서 꺼낼때 사용
	public int getNo() { return no; }
	public String getTitle() { return title; }
	public String getWriter() { return writer; }
	public int getHit() { return hit; }
	
	//글조회수를 1올리는 메소드 (상세보기를 할 때마다 호출된다)
	public void increaseHit() {
		hit = hit + 1;
	}	
}

public class BoardListExample {

	public static void main(String[] args) {
		//=============================================================
		//1. 글 목록을 담을 가변 배열 생성 : 제네릭에 "내가 만든 클래스명을 지정"
		//=============================================================
		
		//BoardDTO 객체만 저장할 수 있는 ArrayList 가변 배열 생성 (업캐스팅)
		//- <BoardDTO> 지정으로 add는 BoardDTO만 받고, get은 BoardDTO로 반환한다
		List<BoardDTO>  boardList = new ArrayList<BoardDTO>();
		
		//============================================================================================
		//2. 글 3건을 BoardDTO 객체로 만들어  ArrayList 배열에 추가해서 각각 저장 (DB에서 3행을 조회해 온 상황을 흉내)
		//============================================================================================
		
		//글 1건의 데이터가 저장된 class BoardDTO 의 객체를 생성해서 ArrayList배열에 저장
		boardList.add(  new BoardDTO(1,  "가입 인사드립니다",  "kim",   5) );
		boardList.add(  new BoardDTO(2,  "자바 질문 있어요",  "lee",   3) );
		boardList.add(  new BoardDTO(3, "스터디 모집합니다",   "park", 3) );
		
	
		

	}

}







