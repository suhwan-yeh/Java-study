package 배열문제;

/*
 문제. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
      즉   (1)영역에 들어 갈 코드를 작성 하시오.

출력결과
sum=150
*/
public class test7 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		//			 0   1  2  3  4   index	
		int sum = 0;
		
		for(int number : arr) {
			
				sum += number; 
			
		}
		
		
		/*
		  	향상된 for 반복문 작성 방법 
		  										      :[1,2,3]		 
		  		for( 배열에서 차례대로 꺼내어 저장할 변수 선언 : 배열 ){
		  		
		  			위 변수에서 전달 받은 값을 반복해서 사용할 코드;
		  		
		  		}
		  
		  
		 */
		System.out.println("sum="+sum);	
	}

}









