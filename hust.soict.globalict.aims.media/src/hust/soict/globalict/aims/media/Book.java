package hust.soict.globalict.aims.media;
import java.util.*;

public class Book extends Media{
	private String authorName;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Book(String title, String category, float cost, String authorName, int id) {
		super(title, category, cost, id);
		this.authorName = authorName;
	}

}
