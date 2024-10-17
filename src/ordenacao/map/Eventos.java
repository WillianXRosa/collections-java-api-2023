package ordenacao.map;

import java.util.Objects;

public class Eventos {

	/**Attributes**/
	private String name;
	private String attraction;
	
	/**Getters**/
	public String getName() {
		return name;	}
		
	public String getAttraction() {
		return attraction;
	}
	
	/**Constructors**/
	public Eventos(String name, String attraction) {
		this.name = name;
		this.attraction = attraction;
	}
	
	/**ToString**/
	@Override
	public String toString() {
		return "Eventos [name=" + name + ", attraction=" + attraction + "]";
	}

	/**HashCode and Equals**/
	@Override
	public int hashCode() {
		return Objects.hash(attraction, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eventos other = (Eventos) obj;
		return Objects.equals(attraction, other.attraction) && Objects.equals(name, other.name);
	}
	
	
}
