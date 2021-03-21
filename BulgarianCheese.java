
public class BulgarianCheese extends Decorator {

	public BulgarianCheese(Product product) {
		super(product);
	}

	@Override
	public double getTotal() {
		return super.getTotal() + 8;
	}
	
}
