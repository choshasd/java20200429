class BBB{
	String name;
	
	public BBB(String n) {
		name = n;
	}
	public BBB() {
		
	}
}
public class Ex9 {
	public static void main(String[] args) {
		// BBB 생성 두개하려면 위에 class에 BBB하나더 생성 : 오버로딩
		BBB bb1 = new BBB();
		BBB bb2 = new BBB("");
	}
}
