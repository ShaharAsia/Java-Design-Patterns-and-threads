
public class FamilyPizza implements Product {
	String name = "Family Pizza";
	int calories;
	int price = 35;
	
	@Override
	public double getTotal() {
		return this.price;
	}
}
