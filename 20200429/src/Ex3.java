import java.util.Scanner;

class Circle{
	public void doArea(int r) {
		System.out.println("�� ���� = "+(r*r*3.14));
	}
	public void doRound(int r) {
		System.out.println("�� �ѷ� = "+(2*3.14*r));
	}
}
	
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan_r = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("�� ������ �Է�");
		int radius1 = scan_r.nextInt();
		
		circle.doArea(radius1);
		circle.doRound(radius1);
		
	}
}
