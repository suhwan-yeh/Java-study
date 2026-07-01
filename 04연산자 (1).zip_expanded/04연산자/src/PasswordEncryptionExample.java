
// 주제 : 왼쪽 / 오른쪽 shift 연산자 사용해 비밀번호 암호화, 복호화함

public class PasswordEncryptionExample {

	public static void main(String[] args) {
		char a = 'h';
		System.out.println(a);
		
		String password = "myPassword1234";
		
		int shift = 3; 
		//shift 변수는 시프트연산에 사용될값 저장
		// 여기에서는 3을 선택하여 왼쪽으로 3개의 비트 시프트 함 
		
		String encryptedPassword = "";
		
		for(int i=0;  i<password.length();     i++) {
			System.out.println(password.charAt(i));
			System.out.println();
			
			char encryptedChar=(char)(password.charAt(i) << shift);
			encryptedPassword += encryptedChar;
		
			System.out.println("암호화 결과 : " + encryptedPassword);
		}
	
	}

}
