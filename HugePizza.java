
public class HugePizza implements Product {
	String name = "Huge Pizza";
	int calories;
	int price = 55;
	
	@Override
	public double getTotal() {
		return this.price;
	}
}
