import java.util.Scanner;

class Circle{
	public void doArea(int r) {
		System.out.println("원 넓이 = "+(r*r*3.14));
	}
	public void doRound(int r) {
		System.out.println("원 둘레 = "+(2*3.14*r));
	}
}
	
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan_r = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("원 반지름 입력");
		int radius1 = scan_r.nextInt();
		
		circle.doArea(radius1);
		circle.doRound(radius1);
		
	}
}
