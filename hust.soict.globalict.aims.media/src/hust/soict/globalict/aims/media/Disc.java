package hust.soict.globalict.aims.media;

public class Disc extends Media{
	
	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	public Disc(String title, String category, int length, float cost, int id) {
		super(title, category, cost, id);
		this.length = length;
		this.director = director;
	}

	
}
