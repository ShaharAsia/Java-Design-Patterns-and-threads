
public abstract class Decorator implements Product{

	private Product product;

	public Decorator(Product product) {
		this.product = product;
	}
	
	public double getTotal() {
		return product.getTotal();
	}

}
