
public class Chinese {
	private String name;// dopeshi static i posmotri chto budet

	public Chinese(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}
	
	
}
