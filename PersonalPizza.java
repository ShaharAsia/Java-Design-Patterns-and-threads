
public class PersonalPizza implements Product {
	String name = "Personal Pizza";
	int calories;
	int price = 20;
	
	@Override
	public double getTotal() {
		return this.price;
	}
}
