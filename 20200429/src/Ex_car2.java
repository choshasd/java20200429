

class Car2{
	String name;
	String brand;
	String color;
	int price;
	
	public Car2(String n, String b, String c, int p) {
		name = n;
		brand = b;
		color = c;
		price = p;
	}
	
	public void doPrint() {
		System.out.println("�ڵ��� �̸� = "+name);
		System.out.println("�ڵ��� ����Ŀ = "+brand);
		System.out.println("�ڵ��� ���� = "+color);
		System.out.println("�ڵ��� ���� = "+price);
	}
	public doInit(String n, String b, String c, int p) {
		name = n;
		brand = b;
		color = c;
		price = p;
	}
	

}
public class Ex_car2 {
	public static void main(String[] args) {
		Car2 car1 = new Car2("���", "���", "Ȳ��", 100);
		Car2 car2 = new Car2("�׷���", "����", "���̺���", 6000);
		Car2 car3 = new Car2("���׽ý�", "����", "����", 10000);
		
		//car1.doInit("���", "���", "Ȳ��", 100);
		//car2.doInit("�׷���", "����", "���̺���", 6000);
		//car3.doInit("���׽ý�", "����", "����", 10000);
		
		car1.doPrint();
		car2.doPrint();
		car3.doPrint();
	}
}
