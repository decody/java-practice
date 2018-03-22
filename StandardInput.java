import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		try {
			/*
			int a1 = System.in.read();
			// 글자 하나만 입력했을 때 캐리지리턴 처리
			System.in.read();
			System.in.read();
			System.out.println("a1: " + a1);
			int a2 = System.in.read();
			System.out.println("a2: " + a2);
			*/
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			String str = br.readLine();
			System.out.println(str);
			
			char c1 = (char) System.in.read();
			System.out.println("c1: " + c1);
			
			
		} catch (Exception e) {
			
		}

	}

}
