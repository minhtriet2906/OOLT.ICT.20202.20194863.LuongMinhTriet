package hust.soict.globalict.aims.media;

import java.util.*;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
		super(title, category, cost, id);
		this.director = director;
		this.length = length;
	}
	

	
}
