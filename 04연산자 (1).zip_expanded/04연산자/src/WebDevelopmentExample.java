


// 비트 논리 연산자 & /  ^ 를 이용하여
// 웹 개발 시 관리자 페이지와 일반 사용자 페이지 권한에 대한 응용 예제



public class WebDevelopmentExample {
	public static final int GUEST_PERMISSION = 1; // 게스트 권한
	public static final int MEMBER_PERMISSION = 2; // 일반 사용자 권한
	public static final int ADMIN_PERMISSION = 4; // 관리자 권한
	
	// 로그인 시 필요한 권한을 설정하는 상수 선언합니다.
	// -> 일반 사용자 권한과 관리자 권한을 비트 or 연산자 | 를 사용하여 로그인 권한 설정 
	public static final int LOGIN_PERMISSION = MEMBER_PERMISSION | ADMIN_PERMISSION; 

	public static final int ADMIN_PAGE_PERMISSION = ADMIN_PERMISSION;
	
	public static void main(String[] args) {
		//로그인 필요 권한을 가진 사용자의 권한 6 설정 
		int userPermission = LOGIN_PERMISSION;
		
		//isAdmin 변수를 선언하여 관리자 권한 여부를 저장함
		// -> userPermission 변수 값과 ADMION_PERMISSION 상수 값을 비트 and 연산자&를 사용하여
		// 관리자 권한을 가지고 있는지 확인 
		boolean isAdmin = (userPermission  &  ADMIN_PERMISSION) !=0;
		
		
		
		System.out.println("로그인 필요권한을 가지며 관리자 페이지 접근 권한을 가진 관리자 권한 여부값 : " + isAdmin);
		if(isAdmin) {
			System.out.println("관리자가 페이지에 접근합니다.");
		}else{
			System.out.println("일반 사용자 페이지에 접근합니다");
		}
	}

}
