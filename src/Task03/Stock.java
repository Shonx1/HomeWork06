package Task03;


public abstract class Stock {
	private int price;
	private boolean available;

	public Stock(int price, boolean available) {
		super();
		this.price = price;
		this.available = available;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean available() {
		System.out.println("Is the stock available?");
		return true;
	}
}

class Meat extends Stock {
	private float weight;
	private String kind;

	public Meat(int price, boolean available, float weight, String kind) {
		super(price, available);
		this.weight = weight;
		this.kind = kind;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Meat [weight=" + weight + ", kind=" + kind + "]";
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
}

class Vegitables {
	private String vitamins;
	private int calories;

	public Vegitables(String vitamins, int calories) {
		super();
		this.vitamins = vitamins;
		this.calories = calories;
	}

	public String getVitamins() {
		return vitamins;
	}

	public void setVitamins(String vitamins) {
		this.vitamins = vitamins;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
}

class Fruits {
private int energy;
private String type;
public int getEnergy() {
	return energy;
}
public void setEnergy(int energy) {
	this.energy = energy;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Fruits(int energy, String type) {
	super();
	this.energy = energy;
	this.type = type;
}
}