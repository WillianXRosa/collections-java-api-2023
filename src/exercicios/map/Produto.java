package exercicios.map;

public class Produto {

	/**Attributes**/
	private String name;//nome
	private double price;//preço
	private int amount;//quantidade
	
	/**Getters and Setters**/
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getAmount() {
		return amount;
	}
	
	/**Constructors**/
	public Produto(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	/**ToString**/
	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}

	
}
