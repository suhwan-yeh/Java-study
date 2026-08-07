import java.util.Hashtable;
import java.util.Enumeration;

//===================================================================
//[응용 문제] Hashtable 배열 메모리에 나라-수도 데이터 저장하고 꺼내오기
//===================================================================
//수업 예제 HashTableTest.java (과일-영단어) 와 똑같은 순서로
//나라 이름을 key, 수도 이름을 value 로 저장하고 출력하는 문제입니다.
//
//[요구사항]
// 1단계 : key 도 String, value 도 String 을 저장하는 Hashtable 객체를 생성하세요.
//
// 2단계 : put 메소드를 사용해서 아래 3쌍의 (key-value) 데이터를 저장하세요.
//           key          value
//          "한국"    ,   "서울"
//          "일본"    ,   "도쿄"
//          "프랑스"  ,   "파리"
//
// 3단계 : get 메소드를 사용해서 key "한국" 과 연결되어 저장된
//         value "서울" 문자열 객체를 꺼내와서 String 변수 capital 에 저장하세요.
//
// 4단계 : capital 변수에 저장된 값이 null 이 아니면
//         아래 문장을 출력하세요.
//         한국 key와 함께 연결되어 저장된 value-> 서울
//
// 5단계 : get 메소드를 사용해서 Hashtable 에 저장한 적이 없는
//         key "미국" 으로 value 를 꺼내려고 시도해 보고,
//         반환된 값이 null 이면 아래 문장을 출력하세요.
//         미국 key는 HashTable에 저장되어 있지 않습니다.
//
// 6단계 : keys 메소드로 Enumeration 배열을 반환 받은 후
//         while 반복문 + hasMoreElements + nextElement 메소드를 사용해서
//         저장된 모든 (key - value) 를 아래 형태로 출력하세요.
//         일본 - 도쿄
//         한국 - 서울
//         프랑스 - 파리
//         (출력 순서는 저장한 순서와 다를 수 있습니다.)
//===================================================================

public class HashTableEx {
	public static void main(String[] args) {

		//1단계 : Hashtable 객체 생성
		Hashtable<String, String>  hashtable = new Hashtable<String, String>();
		/*
		Hashtable 객체 생성
		<String, String> 의 의미
		→ 앞의 String  : key 로 String(문자열) 객체만 저장하겠다.
		→ 뒤의 String  : value 로 String(문자열) 객체만 저장하겠다.

		→ 내부적으로 (key, value) 쌍을 저장하는
		→ 해시 테이블(표) 구조의 공간이 만들어짐

		┌─────────────────────────┐
		│  HashTable (표 구조)      │
		│                         │
		│  key        | value     │
		│ ────────────┼───────────│
		│  (비어있음)   | (비어있음)  │<----- 행(row) 0 개
		│                         │
		└─────────────────────────┘
		- 아직 데이터 없음
		- 행(row) 0개
		*/

		//2단계 : put 메소드로 (key-value) 3쌍 저장
		//      key          value
		//     "한국"    ,   "서울"
		//     "일본"    ,   "도쿄"
		//     "프랑스"  ,   "파리"
		hashtable.put("한국", "서울");
		hashtable.put("일본", "도쿄");
		hashtable.put("프랑스", "파리");
		/*
		┌─────────────────────────┐
		│  HashTable (표 구조)      │
		│                         │
		│  key        | value     │
		│ ────────────┼───────────│
		│  "한국",     |  "서울"    │           행(row) 3 개
		│  "일본",     |  "도쿄"    │
		│  "프랑스",   |  "파리"    │
		└─────────────────────────┘
		*/

		//3단계 : get 메소드로 key "한국" 의 value 꺼내와 저장
		//HashTable 전체 표 구조의 배열메모리 안에 저장되어 있는 value 중에서
		//"서울" 객체를 얻고 싶다. → get 메소드를 이용하자!
		String capital = hashtable.get("한국");
		//    "서울"


		//4단계 : null 이 아니면 출력
		if(capital != null) {
			System.out.println("한국 key와 함께 연결되어 저장된 value-> " + capital);
		}


		//5단계 : 저장한 적 없는 key "미국" 으로 꺼내기 시도 후 null 확인
		// 5단계 : get 메소드를 사용해서 Hashtable 에 저장한 적이 없는
		//      key "미국" 으로 value 를 꺼내려고 시도해 보고,
		//      반환된 값이 null 이면 아래 문장을 출력하세요.
		//      미국 key는 HashTable에 저장되어 있지 않습니다.		
		String capital2 = hashtable.get("미국");
		//		 null
		/*
		HashTable 표 안의 key 들 : "한국", "일본", "프랑스"
		"미국" key 는 put 메소드로 저장한 적이 없음
		→ get 메소드는 표에서 "미국" key 를 찾지 못함
		→ value(객체 주소) 대신 null 을 반환
		→ 그래서 capital2 변수에는 null 이 저장됨
		*/
		if(capital2 == null) {
			System.out.println("미국 key는 HashTable에 저장되어 있지 않습니다.");
		}
		/*
		[주의] null 이 저장된 상태에서 capital2.toString() 처럼
		메소드를 호출하면 NullPointerException 예외가 발생합니다.
		그래서 get 메소드로 꺼낸 값은 null 인지 아닌지 확인 후 사용해야 합니다.
		*/
	
		
		//6단계 : keys 메소드 + Enumeration 배열로 전체 (key - value) 출력
		/*
		HashTable배열에 저장된 모든 key(객체)들을 일일이 기억하지 못하므로
		모든 key(객체)들만 뽑아내서 Enumeration배열에 담아 Enumeration배열 주소 자체를 반환
		-> keys()메소드
		*/
		Enumeration enumeration = hashtable.keys();
									 //["일본","한국","프랑스"]  <- key들만 저장된 Enumeration배열
									 //(저장한 순서와 다르게 들어있을 수 있음)
		
		//keys메소드를 호출해서 반환 받은 Enumeration배열에 key들이 저장되어 있는 동안만 반복
		//hasMoreElements() → 아직 꺼내지 않은 key 가 남아 있으면 true 반환
		//                  → 전부 다 꺼냈으면 false 반환 → 반복 종료
		while( enumeration.hasMoreElements() ) {
			
			//1. Enumeration 배열에 저장되어 있는 key들을 차례대로 얻어 저장
			String key = (String)enumeration.nextElement(); //"일본"  ,  "한국" ,   "프랑스"		
			/*
			nextElement() 메소드는 반환 타입이 Object 입니다.
			Object 타입으로 반환된 "일본" 문자열 객체를
			String 변수에 저장하려면 (String) 다운캐스팅이 필요합니다.
			*/
			
			//2. key들을 이용해 HashTable 배열 전체에 저장된 value들을 차례로 얻어 저장
			String val  = hashtable.get(key);
					            //key "일본"   -> value로 "도쿄" 문자열 객체를 반환 받아 얻었다.
					            //key "한국"   -> value로 "서울" 문자열 객체를 반환 받아 얻었다.
					            //key "프랑스" -> value로 "파리" 문자열 객체를 반환 받아 얻었다.
			
			//3. HashTable에 저장되어 있는 key - value 형태의 문자열로 반복해서 출력
			System.out.println(key + " - " + val);	
						            /*
						            일본 - 도쿄
						            한국 - 서울
						            프랑스 - 파리
						            (출력 순서는 저장한 순서와 다를 수 있습니다.)
						           */
		}
		/*
		┌─────────────────────────┐
		│  HashTable (표 구조)      │
		│                         │
		│  key        | value     │
		│ ────────────┼───────────│
		│  "한국",     |  "서울"    │           행(row) 3 개
		│  "일본",     |  "도쿄"    │
		│  "프랑스",   |  "파리"    │
		└─────────────────────────┘
		*/

	}
}






