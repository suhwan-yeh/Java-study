
public class PetTest{
	
		String name;
		int hunger;
		
		void feed(int amount) {
			hunger+=amount;
			
			System.out.println(name + "밥 먹었다! 배고픔 :" + hunger);
		}
		
		void play() {
			// 현재 배고픔에 논 만큼 증가
			//100을 넘으면 100으로 고정 (상한선 처리)
			if(hunger > 100) hunger = 100;
			
			
			//이름과 변경된 배고픔 수치 출력
			System.out.println(name + "신나게 놀았다! 배고픔 :" + hunger);
		}
	
		void statCheck() {
			System.out.println(name + "의 현재 배고픔 : " + hunger);
		}
		
	public static void main(String[] args) {
		PetTest pet = new PetTest();
		
		pet.name = "초코";
		pet.hunger = 50;
	
	}
}
