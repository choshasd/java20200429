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
		// BBB ���� �ΰ��Ϸ��� ���� class�� BBB�ϳ��� ���� : �����ε�
		BBB bb1 = new BBB();
		BBB bb2 = new BBB("");
	}
}
