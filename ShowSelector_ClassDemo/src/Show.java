
public class Show {

//list the instance variables (attributes)
	private String name;
	private String genre;
	private int length;
	private String network;

	public Show(String name, String genre, int length, String network) {
		super();
		this.name = name;
		this.genre = genre;
		this.length = length;
		this.network = network;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	@Override
	public String toString() {
		return "Show [name=" + name + ", genre=" + genre + ", length=" + length + ", network=" + network + "]";
	}

}
