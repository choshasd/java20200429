import java.util.Scanner;

class ABS{
	public void doABS(int a, int b) {
		if(a>b)
			System.out.println("�μ������� ���밪 = "+(a-b));
		else
			System.out.println("�μ������� ���밪 = "+(b-a));
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Scanner scan_num = new Scanner(System.in);
		System.out.println("ù ��° �� : ");
		int num1 = scan_num.nextInt();
		System.out.println("�� ��° �� : ");
		int num2 = scan_num.nextInt();
		
		ABS abs_ = new ABS();
		abs_.doABS(num1,  num2);
	}
}
