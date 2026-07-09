


//[예제] 다중 for문에서 제어변수의 변화 알아보기 
public class E08 {
	public static void main(String[] args) {

		
		int hour, minute, second;
		
		System.out.println("시침 -------------->> 분침 --------------->> 초침");
		System.out.println("hour(바깥 쪽 제어변수->> minute(중간 제어변수)->> second(안쪽 제어변수)");
		
		for(hour=1;  hour<=1;  hour++) {
			
			for(minute=1;  minute<=60;  minute++) {
				
				for(second=1;  second<=60;  second++) {
					
					System.out.println(hour + "------------->> " + minute + " ------------>> " +  second);
					
				}//가장 안쪽 for
				
			}//안쪽 for
			
		}//바깥 for
		
	}//main 메소드 

}//class 클래스 







