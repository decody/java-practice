
public class ConstTest {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		System.out.print("감사합니다.");
		System.out.print("어디 가세요");
		
		// 상수
		// %d: 정수값
		// %c: 문자
		// %t: 실수형
		// %s: 문자열
		// %숫자d: 숫자 만큼 빈칸
		// %0숫자d: 숫자 만큼 0으로 채움
		System.out.printf("정수: %d\n", 100);
		System.out.printf("정수: %d %d\n", 200, 300);
		
		System.out.printf("%d ~ %d\n", -2147483648, 2147483647);
		System.out.printf("%d ~ %d\n", -2147483649L, 2147483648L);	//4바이트를 8바이트로 할당
		
		// System.out.printf("%d ~ %d\n", -9223372036847758081, 92233720368547758071);
		System.out.printf("%c\n", 'a');
		System.out.printf("%f\n", 123.456);
		System.out.printf("%2.2f\n", 123.456);
		System.out.printf("%.2f\n", 123.456);
		
		System.out.printf("%10d\n", 10);
		System.out.printf("%010d\n", 10);
		
		System.out.printf("%s\n", "반갑습니다");
		System.out.printf("%s %d\n", "안녕하세요", 200);
	}

}
