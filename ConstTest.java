
public class ConstTest {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�");
		
		System.out.print("�����մϴ�.");
		System.out.print("��� ������");
		
		// ���
		// %d: ������
		// %c: ����
		// %t: �Ǽ���
		// %s: ���ڿ�
		// %����d: ���� ��ŭ ��ĭ
		// %0����d: ���� ��ŭ 0���� ä��
		System.out.printf("����: %d\n", 100);
		System.out.printf("����: %d %d\n", 200, 300);
		
		System.out.printf("%d ~ %d\n", -2147483648, 2147483647);
		System.out.printf("%d ~ %d\n", -2147483649L, 2147483648L);	//4����Ʈ�� 8����Ʈ�� �Ҵ�
		
		// System.out.printf("%d ~ %d\n", -9223372036847758081, 92233720368547758071);
		System.out.printf("%c\n", 'a');
		System.out.printf("%f\n", 123.456);
		System.out.printf("%2.2f\n", 123.456);
		System.out.printf("%.2f\n", 123.456);
		
		System.out.printf("%10d\n", 10);
		System.out.printf("%010d\n", 10);
		
		System.out.printf("%s\n", "�ݰ����ϴ�");
		System.out.printf("%s %d\n", "�ȳ��ϼ���", 200);
	}

}
