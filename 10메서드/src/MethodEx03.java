
public class MethodEx03 {

	
	public static int abs(int data) {

			if(data<0) {
				
				data = -data;
			}
			
			return data; 
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("-1 절대값 => " + abs(-1) );
		System.out.println("-1 절대값 => " + abs(-10) );
	}

}
