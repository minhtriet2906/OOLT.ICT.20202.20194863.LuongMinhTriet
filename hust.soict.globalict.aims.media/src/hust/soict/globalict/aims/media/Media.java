package hust.soict.globalict.aims.media;

public class Media {
	
	protected String title;
	protected String category;
	protected float cost;
	protected int id;


	public Media(String title, String category, float cost, int id) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	
	public int getId() {
		return id;
	}

	

}
