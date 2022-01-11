package 자동차클래스모델링예제;

public class Car {
//	객체가 가져야할 속성 => 멤버 변수
	private int speed;  //현재 속도
	private int wheelNum;  //바퀴의 수
	private String carName;  //자동차 이름
	
//	생성자1
	public Car(String name) {
		carName = name;
	}
//	생성자2
	public Car(int velocity) {
		speed = velocity;
	}
//	생성자3
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
	/*
	객체가 가져야할 기능(동작, 행위) => 메소드
	[중요] 다형성 구현의 한가지 방법 => 메소드 오버로딩을 통해서 구현 가능하다.
	* 메소드 만드는 방법
	public 반환타입 메소드명(매개변수값1, 매개변수값2, ..., 매개변수n)
	반환타입이 void면 처리하고 반환타입이 없다(무형)
	*/
	public void speedUp() {
		speed = speed + 1;
	}
	public void speedUp(int velocity) {  //메소드 오버로딩(기능은 똑같지만 방법론이 다름)
		speed = speed + velocity;
	}
	public void speedDown() {
		speed = speed - 1;
	}
	public void stop() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("제네시스");  //제네시스라는 문자열의 객체를 생성 myCar = 제네시스
		System.out.println("마이카는 " + myCar.carName + "이다.");
		
		Car yourCar = new Car(120);
		System.out.println("유어카의 현재속도는 " + yourCar.speed + "km이다.");
		
		Car hisCar = new Car("그랜져", 110);
		System.out.println(hisCar.carName + "의 현재속도는 " + hisCar.speed + "km이다.");
		
	}
}
