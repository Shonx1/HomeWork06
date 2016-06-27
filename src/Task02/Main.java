
package Task02;

class Car {
	private int price;

	public Car(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.print("The price is" + price);
	}

}

class Automobile extends Car {
	private int consumption;

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	public Automobile(int price, int consumption) {
		super(price);
		this.consumption = consumption;
	}

	public void consume() {
		System.out.println("The consumption is" + consumption);
	}
}

public class Main {

	public static void main(String[] args) {
		Car vehicle[] = new Car[10];

	}
}