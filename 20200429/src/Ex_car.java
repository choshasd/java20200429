
class Car{
	String name;
	String brand;
	String color;
	int price;
	
	public void doPrint() {
		System.out.println("�ڵ��� �̸� = "+name);
		System.out.println("�ڵ��� ����Ŀ = "+brand);
		System.out.println("�ڵ��� ���� = "+color);
		System.out.println("�ڵ��� ���� = "+price);
	}
	
	public void doInit(String n, String b, String c, int p) {
		name = n;
		brand = b;
		color = c;
		price = p;
	}

}
public class Ex_car {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.doInit("���", "���", "Ȳ��", 100);
		car2.doInit("�׷���", "����", "���̺���", 6000);
		car3.doInit("���׽ý�", "����", "����", 10000);
		
		car1.doPrint();
		car2.doPrint();
		car3.doPrint();
	}
}
