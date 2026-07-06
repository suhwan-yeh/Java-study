




public class E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan; //단수를 저장하는 변수 선언
		int n; // 곱하는 수를 저장하는 변수 선언
		for(dan=2; dan<=9; dan++) {
			
			System.out.println("**" + dan + "단 **");
			for(n=1; n<=9; n++){
				
				System.out.println(dan + "X" + n + "=" + dan*n);
			}//n
		}//dan

	}

}
