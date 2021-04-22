package hust.soict.globalict.aims.media;

import java.util.*;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	

	public DigitalVideoDisc(String title, String category,String director, int length, float cost, int id) {
		super(title, category, length, cost, id);
		this.director = director;
	}


	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	

	
}
