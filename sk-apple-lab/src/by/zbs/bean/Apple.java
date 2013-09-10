package by.zbs.bean;

public class Apple {
	private int weight;
	private int condition;

	public Apple(int weight, int condition) {
		this.weight = weight;
		this.condition = condition;
	}

	public String toString() {
		return "Apple [weight=" + weight + ", condition=" + condition + "]";
	}

}
