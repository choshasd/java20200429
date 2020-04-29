import java.util.Scanner;

// class는 new를 사용해야 생성
class Recur{
	public int recur(int n) {
		if(n>0)
			return recur(n-1)*2; // jae(2) * 2
									 // jae(1) * 2 * 2
									 // jae(0) * 2 * 2 * 2
									 // 1 * 2 * 2 * 2
		else
			return 1;  			// 1
	}
}
public class Ex4 {
	public static void main(String[] args) {
		Scanner scan_num = new Scanner(System.in);
		Recur recur = new Recur();
		System.out.println("몇 제곱 할래?");
		int num = scan_num.nextInt();
		int result = recur.recur(num);
		System.out.println("2의 "+num+"제곱 = "+result);
	}
}
