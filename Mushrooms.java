
public class Mushrooms extends Decorator {

	public Mushrooms(Product product) {
		super(product);
	}

	@Override
	public double getTotal() {
		return super.getTotal() + 8;
	}

}