package ch04;

public class _08_StudentMain {
	public static void main(String[] args) {
			
		_08_Student hong = new _08_Student("홍길동", 2, 5000); 
		_08_Bus bus = new _08_Bus(100);
		hong.takeBus(bus);
		hong.takeBus(bus);
	
		_08_Subway greenLine = new _08_Subway(2);
		hong.takeSubway(greenLine);
		
		hong.showInfo();
		bus.showInfo();
		greenLine.showInfo();
		
		System.out.println("===============");
		
		_08_Student park = new _08_Student("박박박", 1, 10000);
		_08_Subway goldLine = new _08_Subway(9);
		park.takeSubway(goldLine);
		park.showInfo();
		goldLine.showInfo();
		
		System.out.println("===============");

		_08_Student kim = new _08_Student("김철수", 3, 15000);
		_08_Taxi taxi = new _08_Taxi("모범");
		kim.takeTaxi(taxi);
		kim.showInfo();
		taxi.showInfo();
	}
}
