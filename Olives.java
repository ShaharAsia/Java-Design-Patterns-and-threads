
public class Olives extends Decorator {

	public Olives(Product product) {
		super(product);
	}

	@Override
	public double getTotal() {
		return super.getTotal() + 8;
	}

}