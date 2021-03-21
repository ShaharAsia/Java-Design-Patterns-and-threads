
public class Tomatoes extends Decorator {

	public Tomatoes(Product product) {
		super(product);
	}

	@Override
	public double getTotal() {
		return super.getTotal() +8;
	}

}

