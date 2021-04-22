package hust.soict.globalict.aims.media;
import java.util.*;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost, List<String> authors, int id) {
		super(title, category, cost, id);
		this.authors = authors;
	}	

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	void addAuthor(String authorName) {
		if (authors.contains(authorName)) 
			return;
		else 
			authors.add(authorName);
	}
	void removeAuthor(String authorName) {
		if (authors.contains(authorName)) 
			authors.remove(authorName);
		else 
			return;
	}
}
