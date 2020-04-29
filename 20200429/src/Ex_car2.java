

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
		System.out.println("자동차 이름 = "+name);
		System.out.println("자동차 메이커 = "+brand);
		System.out.println("자동차 색깔 = "+color);
		System.out.println("자동차 가격 = "+price);
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
		Car2 car1 = new Car2("모닝", "기아", "황금", 100);
		Car2 car2 = new Car2("그랜져", "현대", "아이보리", 6000);
		Car2 car3 = new Car2("제네시스", "현대", "검정", 10000);
		
		//car1.doInit("모닝", "기아", "황금", 100);
		//car2.doInit("그랜져", "현대", "아이보리", 6000);
		//car3.doInit("제네시스", "현대", "검정", 10000);
		
		car1.doPrint();
		car2.doPrint();
		car3.doPrint();
	}
}
