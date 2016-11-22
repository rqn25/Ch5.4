
public class Cars2 {
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	private static int count = 0;

	public Cars2() {
		color = "White";
		horsePower = 250;
		engineSize = 4;
		make = "Toyota";
		count++;
		count++;

	}

	public Cars2(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
		count++;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;

	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;

	}

	public void setMake(String make) {
		this.make = make;

	}

	public static int getCount() {
		return count;

	}

	public String getColor() {
		return color;

	}

	public int getHorsePower() {
		return horsePower;

	}

	public double getEngineSize() {
		return engineSize;

	}

	public String getMake() {
		return make;

	}

	public boolean equals(Cars2 car) {
		return this.color.equals(car.color) & this.horsePower == car.horsePower & this.engineSize == car.engineSize & this.make.equals(car.make);

	}

	public String toString() {
		return "Color = " + color + ", Horse power = " + horsePower + ", Engine size = " + engineSize + ", Make = " + make;

	}

}
