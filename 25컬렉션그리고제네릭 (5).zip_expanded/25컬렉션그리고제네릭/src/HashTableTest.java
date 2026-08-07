


import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;

//주제 : Map 부모인터페이스를 구현 받은  자식 HashTable 클래스의 배열 메모리 만들어 사용해 보기 

public class HashTableTest {

	public static void main(String[] args) {

		Hashtable<String, String>   hastable   =    new   Hashtable<String, String>();
		/*
		Hashtable 객체 생성
	
		→ 해시 테이블 배열메모리에 데이터(객체)를 저장할 때
		  (key-객체value)를 한쌍으로 묶어 하나의 행에 저장 합니다.
	
		→ 내부적으로 (key, value) 쌍을 저장하는
		→ 해시 테이블(표) 구조의 공간이 만들어짐

		┌─────────────────────────┐
		│  HashTable (표 구조)      │
		│                         │
		│  key        | value     │
		│ ────────────┼───────────│
		│  (비어있음)    | (비어있음)  │<----- 행(row) 0 개 
		│                         │
		└─────────────────────────┘
		- 아직 데이터 없음
		- 행(row) 0개
	  */		
		
		//HashTable 표 형태의 배열 메모리에   데이터(key-value)를 저장할때  put 메소드 사용
		//key 또한 객체로 넣고,  value 또한 객체로 넣습니다
		//			  key , value
		hastable.put("사과", "Apple");
		hastable.put("딸기", "Strawberry");
		hastable.put("포도", "Grapes");
		/*	
		┌─────────────────────────┐
		│  HashTable (표 구조)      │
		│                         │
		│  key        | value     │
		│ ────────────┼───────────│
		│  "사과",     |  "Apple"  │           행(row) 3 개 
		│  "딸기",     | "Strawberry" 
		│   "포도",    |  "Grapes" │                   
		└─────────────────────────┘	
	   */			
	    //============== HashTable 클래스의 get 메소드 =========================================
		// Object get(Object key) 메소드를 이용하자!
		// - get 메소드는 key 를 매개변수로 집어 넣으면? 
		//   HashTable 표 메모리 전체에 저장된 ( key-value ) 중  value 를 Object obj 에 저장할 자식 객체로 얻는 메소드.
		
		//HashTable 전체 표 구조의 배열 메모리 안에  저장되어 있는 value 중에서 "Grapes" 객체를 얻고 싶다.
		String value = hastable.get("포도"); //업캐스팅 안해도 value -> "Grapes" 문자열 객체를 value로 얻어 저장 가능
		//	"Grapes"						//그리고 다운 캐스팅 도 하지 않고 String클래스에 만들어 놓은 메소드 호출 가능
		
		//key - "포도"를 이용해서 value - "Grapes"을 HashTable 표 메모리에서 꺼내 올수 있는지 확인
		if(value != null) {
			System.out.println(" 포도 key와 함께 연결되어 저장됬던 value -> " + value.toString());
			// 				     포도 key와 함께 연결되어 저장됬던 value -> " + "Grapes"
		}
		
		/*
		  HashTable배열에 저장된 모든 Key(객체)들을 일일이 기억하지 못하므로
		  모든 key(객체)들만 뽑아내서 Enumeration배열에 담아 Enumeration배열 주소 자체를 반환
		  -> keys()메소드 
		*/		
		Enumeration enumeration = hastable.keys();
								 //["딸기", "사과", "포도"]   
		
		//keys() 메소드를 호출해서 반환 받은 ["딸기", "사과", "포도"] Enumeration 배열에 저장된 kye들이 있으면 반복 
		while ( enumeration.hasMoreElements() ) {
			
			//1. Enumeraction 배열에 저장되어 있는 key 들을 차례대로 얻어 저장
			String key = (String)enumeration.nextElement();
											 //"딸기"
											 //"사과"
											 //"포도"
			
			//2. key를 이용해 HashTable 배열 전체에 저장된 value를 차례대로 얻어 저장
			String val = hastable.get(key);  //key "딸기" ->  value로 "Strawberry"문자열 객체를 반환 받아 얻었다.
											 //key "사과" ->  value로 "Apple" 문자열 객체를 반환 받아 얻었다.
											 //key "포도" ->  value로 "Grapes"문자열 객체를 반환 받아 었었다.
			
			//3. HashTable 에 저장되어 있는 key - value 형태의 문자열을 반복해서 출력
			System.out.println(key + " - " + val);
							 /*
								   딸기 - Strawberry
								   사과 - Apple
								   포도 - Grapes
							 */			
		} // while		
	}
}
/*	
┌─────────────────────────┐  
│  HashTable (표 구조)      │
│                         │
│  key        | value     │
│ ────────────┼───────────│
│  "사과",     |  "Apple"  │           행(row) 3 개 
│  "딸기",     | "Strawberry" 
│   "포도",    |  "Grapes" │                   
└─────────────────────────┘	
*/






