import java.util.Scanner;

class ToBinary{
	public String doBinary(int deciNum) {
		if(deciNum ==0 || deciNum ==1)
			return deciNum+"";
		else 
			return doBinary(deciNum/2)+deciNum%2;
	}
}
public class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("10진수 입력 : ");
		int a = scan.nextInt();
		ToBinary tb = new ToBinary();
		String bin = tb.doBinary(a);
		System.out.println(a+" = "+bin);
		
	}
}
