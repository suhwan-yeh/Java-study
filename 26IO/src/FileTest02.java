import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {

			//참고
			//-> 현재 작성하고 있는 FileTest02.java 파일 저장된 폴더 전체 절대 경로
			
			// 현재 26IO 디렉터리 정보를 얻기 위한 File 클래스의 객체 메모리 생성
			File fileDir = new File(".");
			String[] strs = fileDir.list();
			
			for(int i=0; i<strs.length; i++) {
				System.out.println(strs[i]);
			}
					
	}

}
