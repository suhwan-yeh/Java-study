
public class Arr02 {

	public static void main(String[] args) {
	
		//예제.  5개의 실수값 중에서 최대 값 하나 구하기 
		
		/*
		 * 1. 실수 값 5개 저장 시킨 배열 만들기(생성하기)
		 */
		double[]  data = new double[] {9.5, 7.0, 13.6, 7.5, 10.0};
		//								0    1    2     3    4     index
		
		/*
		 * 2. data 배열에 최댓값 하나를 얻어 저장할 max 변수 선언후 0.0 초기화(변수에 값 처음 저장)
		 */
		double max = 0.0;
		
		/*
		 * 3. for반복문을 수행하기 전에  data 배열에  0 index 위치 칸에 저장된 9.5를 꺼내서
		 *    max 변수에 최댓값으로 설정하기 위해 저장 
		 */
		 max = data[0]; //9.5
		 
		 /*
		  * 4. for 반복문을 이용하여 4번 반복하면서   data 배열의 1 index ~ 4 index 위치 칸에 저장된 값을
		  *    반복해서 얻어서  max변수에 저장된 값보다 크면? 최댓값으로 판단해서 max변수에 다시 저장 시키자
		  */
		 for(int i=1;  i<5;   i++) {
			 		 	 
			 if(data[i] > max) {
				 
				 max = data[i];
			 }
		 }
		 /*
		  * 5. data 배열에 저장된 값들 중에서 최댓값 하나는 max변수에 저장되어 있다.
		  *    max 변수값 출력 해보자
		  */
		 System.out.println(" 최댓값 = " + max);
		
		//결론
		// 이 예제는 배열의 첫번째 요소(값)9.5를 최대값으로 먼저 max변수에 저장 해놓고
		// 나머지 요소(값)들과 비교하여 최댓값을 찾아내는 구조로 되어 있는 예제 입니다.
		
		

	}

}
