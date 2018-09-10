
public class Stuffy {

	private int id;
	private String name;
	private String type;
	private String color;
	private static int objectCount = 0; //this is a static variable
	
	// write constructor (in is referencing input)
	public Stuffy(String inName, String inType, String inColor) {
		id = 0; // id is 0 as a database is not set up.
		name = inName;
		type = inName;
		color = inColor;		
	}
	
	public int getId( ) {
		return id;
	}
	public void setId(int inId) {
		id = inId;
	}
	public String getName( ) {
		return name;
	}
	public void setName(String inName) {
		name = inName;
	}
	public String getType( ) {
		return type;
	}
	public void setType(String inType) {
		type = inType;
	}
	public String getColor( ) {
		return color;
	}
	public void setColor(String inColor) {
		color = inColor;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", objectCount=" + objectCount + "]";
	}
	
}
