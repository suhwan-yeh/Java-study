
public class Car2 {
	String brand;
	String color;
	int    speed;
	
	void accelerate() {
		speed+=10;
		
	}
	void breaks() {
		speed-=10;
	}

	public static void main(String[] args) {
		Car2 kia = new Car2();
		
		kia.brand = "kia";
		kia.color = "black";
		kia.speed = 0;
	}

}
