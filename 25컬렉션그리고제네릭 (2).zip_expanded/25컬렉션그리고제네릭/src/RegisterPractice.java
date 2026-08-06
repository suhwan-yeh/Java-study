/*
	[연습문제 - 난이도 상] HashSet + ArrayList 종합 응용 : 수강 신청 처리 시스템

	■ 상황
	   정원 3명인 특강의 수강 신청을 받았다.
	   신청 버튼을 여러 번 누른 사람도 있어서, 신청 기록에는 중복이 섞여 있다.

	   신청 기록(신청 순서대로) :
	   "kim", "lee", "kim", "park", "choi", "lee", "jung", "park", "hong"

	■ 처리 규칙
	   규칙 1. 같은 사람의 두 번째 이후 신청은 무시한다. (중복 신청)
	   규칙 2. 유효한 신청은 순서대로 처리하여
	           - 합격자 명단이 정원(3명) 미만이면 -> 합격자 명단에 추가
	           - 정원이 다 찼으면              -> 대기자 명단에 추가
	   규칙 3. 합격자 명단과 대기자 명단은 "신청 순서"가 유지되어야 한다.

	■ 문제 0 (서술형) : 아래 두 질문에 주석으로 답하시오.
	   (1) 중복 신청을 걸러내는 용도로 HashSet을 쓰는 이유는?
	       답: HashSet은 이미지 저장된 것과 내용이 같은 객체의 add 를 거부하고
	       	  false 를 반환하므로,  add 의 반환값만 확인하면 별도의 검색 없이
	       	  "처음 신청인지/ 중복신청인지"를 바로 판별 할수 있기떄문이다.
	       	  	       	  
	   (2) 합격자/대기자 명단으로 ArrayList를 쓰는 이유는?
	       답: 명단은 "신청 순서"가 유지되어 야 하는데, HashSet은 저장 순서를 보장하지 않고, 
	          ArrayList는  add 한 순서 그대로 저장되기 떄문이다.
	       	  (또한 명단에는 index 접근과  중간 삭제/추가가 필요하다.)
	       
	      
	■ 예상 실행 결과 1단계 (신청 처리 후)

	   중복 신청 무시 : kim
	   중복 신청 무시 : lee
	   중복 신청 무시 : park
	   ===== 신청 처리 결과 =====
	   합격자 명단(3명) : [kim, lee, park]
	   대기자 명단(3명) : [choi, jung, hong]

	■ 추가 요구사항 (2단계) : 수강 취소 처리
	   "park"가 수강을 취소했다.
	   규칙 4. 합격자 명단에서 "park"를 아이디로 찾아서 삭제한다.
	   규칙 5. 대기자 명단의 맨 앞 사람(0번 index)을 대기자 명단에서 삭제하면서
	           그 사람을 합격자 명단에 추가한다. (승격)
	           힌트 : remove(int index)는 삭제된 객체를 "반환"한다! (Collections02)

	■ 예상 실행 결과 2단계 (취소 처리 후)

	   ===== park 취소 처리 후 =====
	   합격자 명단(3명) : [kim, lee, choi]
	   대기자 명단(2명) : [jung, hong]

	■ 참고 : System.out.println(리스트변수) 라고 쓰면
	         [kim, lee, park] 형태로 배열 전체가 출력된다. (toString 자동 호출)
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegisterPractice {
	public static void main(String[] args) {

		//특강 정원
		int limit = 3;

		//신청 기록 : 신청 순서 그대로, 중복 포함 (List : 순서 유지 + 중복 허용)
		List<String> applyList = new ArrayList<String>();
		applyList.add("kim");
		applyList.add("lee");
		applyList.add("kim");    //kim 중복 신청
		applyList.add("park");
		applyList.add("choi");
		applyList.add("lee");    //lee 중복 신청
		applyList.add("jung");
		applyList.add("park");   //park 중복 신청
		applyList.add("hong");

		//중복 신청을 걸러내기 위한 명단 확인용 HashSet (Set : 중복 저장 거부)
		Set<String> checkSet = new HashSet<String>();

		//합격자 명단, 대기자 명단 (List : 신청 순서 유지)
		List<String> passList = new ArrayList<String>();
		List<String> waitList = new ArrayList<String>();

		//=====================================================================
		// 1단계 : 신청 기록 처리
		//=====================================================================

		//TODO 1 : 향상된 for문으로 applyList의 아이디를 순서대로 하나씩 꺼내
		//         아래 규칙대로 처리하시오.
		for(String id    :   applyList ) {
			
			//- checkSet에 add했는데 false가 반환되면 (= 중복 신청)
			//  "중복 신청 무시 : 아이디" 출력 후 아무 명단에도 넣지 않는다
			boolean firstApply = checkSet.add(id);
			
			//- true가 반환되면 (= 유효한 신청)
			//  passList의 size()가 정원(limit) 미만이면 passList에 추가,
			//  그렇지 않으면 waitList에 추가한다.
			//
			// 힌트 : 바깥 if-else (중복인가?) 안쪽 if-else (정원이 남았는가?) 중첩 구조
			if(firstApply == false) {
				//중복 신청 : 명단에 넣지 않고 안내만 출력 (규칙 1)
				System.out.println("중복 신청 무시 : " + id);
			}else {
				//유효한 싱청 : 정원이 남았는지에 따라 명단을 나눠 담는다.(규칙 2)
				if( passList.size() < limit ) {
					passList.add(id);  
				}else {
					waitList.add(id);
				}
			}	
			
			/*
			 반복 추적 (9회)
			   회차  아이디   checkSet.add   passList.size   처리
			   ─────────────────────────────────────────────────────────
			    1    kim      true           0 < 3           합격 [kim]
			    2    lee      true           1 < 3           합격 [kim, lee]
			    3    kim      false                          중복 무시
			    4    park     true           2 < 3           합격 [kim, lee, park]
			    5    choi     true           3 < 3 거짓       대기 [choi]
			    6    lee      false                          중복 무시
			    7    jung     true           정원 참          대기 [choi, jung]
			    8    park     false                          중복 무시
			    9    hong     true           정원 참          대기 [choi, jung, hong]
			*/
			
		} //for

	

		//1단계 결과 출력 (수정하지 말 것)
		System.out.println("===== 신청 처리 결과 =====");
		System.out.println("합격자 명단(" + passList.size() + "명) : " + passList);
		System.out.println("대기자 명단(" + waitList.size() + "명) : " + waitList);

		//=====================================================================
		// 2단계 : "park" 수강 취소 처리
		//=====================================================================

		//TODO 2 : 합격자 명단(passList)에서 "park"를 아이디로 찾아서 삭제하시오.
		//         주의 : passList.remove(2) 라고 index로 지우면 안 되는 이유를
		//                주석으로 함께 적으시오!
		passList.remove("park");



		//TODO 3 : 대기자 명단(waitList)의 맨 앞(0번 index) 사람을 삭제하면서
		//         반환되는 그 아이디를 String 변수에 받아 passList에 추가하시오. (승격)
		//         힌트 : String promoted = waitList.remove(???);
        String promoted = waitList.remove(0); //waitList에서 "choi" 삭제되며 반환됨
        									  //(뒤에 있던 jung, hong은 앞으로 한 칸씩 당겨진다)
        passList.add(promoted);

		//2단계 결과 출력 (수정하지 말 것)
		System.out.println("===== park 취소 처리 후 =====");
		System.out.println("합격자 명단(" + passList.size() + "명) : " + passList);
		System.out.println("대기자 명단(" + waitList.size() + "명) : " + waitList);
		/*
		결론 : 이 문제의 핵심 설계 - "판별은 Set, 보관은 List"
		  1. checkSet.add의 반환값 하나로 중복 판별과 명단 등록 확인을 동시에 처리했다.
		  2. 명단은 순서가 생명이므로 ArrayList 2개(합격/대기)로 나눠 보관했다.
		  3. 취소는 remove(Object)로 "사람"을 지우고,
		     승격은 remove(int)의 "반환값"으로 삭제와 이동을 한 번에 처리했다.
		     -> 같은 이름의 remove가 상황에 따라 다르게 쓰인 것에 주목!
		 */
	}
}








