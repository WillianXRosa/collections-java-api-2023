package ordenacao;

public class Pessoa implements Comparable<Pessoa> {

	/**Attributes(Nome, idade, altura)**/
	private String name;
	private int age;
	private double height;
	
	/**Getters**/
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	/**Constructors**/
	public Pessoa(String name, int age, double height) {
		this.name = name;		
		this.age = age;
		this.height = height;		
	}
	
	@Override
	public int compareTo(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return Integer.compare(age, pessoa.getAge());
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	
	
	
	
	
}
