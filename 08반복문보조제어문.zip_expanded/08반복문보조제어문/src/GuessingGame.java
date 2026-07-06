import java.util.Scanner;
import java.util.Random;




public class GuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int targetNumber = random.nextInt(10) + 1;
		
		int userGuess; 
		
		System.out.println("숫자 추측게임 ㄱㄱ");
		System.out.println("1~10 맞춰");
		
		do {
			System.out.print("예상숫자 입력 ㄱㄱ");
			userGuess = sc.nextInt();
			if(userGuess < targetNumber) {
				
				System.out.println("다시입력 ㄱㄱ");
				
				
				}else if(userGuess > targetNumber) {
					
					System.out.println("다시입력 ㄱㄱ");
					
				}
			
			
		}while(userGuess != targetNumber);
		System.out.println("정답! 숫자는 " + targetNumber + "였따");
		sc.close();
		
	}

}
