import java.util.Scanner;

class ABS{
	public void doABS(int a, int b) {
		if(a>b)
			System.out.println("두수의차의 절대값 = "+(a-b));
		else
			System.out.println("두수의차의 절대값 = "+(b-a));
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Scanner scan_num = new Scanner(System.in);
		System.out.println("첫 번째 수 : ");
		int num1 = scan_num.nextInt();
		System.out.println("두 번째 수 : ");
		int num2 = scan_num.nextInt();
		
		ABS abs_ = new ABS();
		abs_.doABS(num1,  num2);
	}
}
