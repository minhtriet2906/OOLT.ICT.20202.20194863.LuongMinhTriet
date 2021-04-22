package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;

	private List<Track> tracks = new ArrayList<Track>();

	
	public CompactDisc(String title, String category, int length, float cost, int id, String artist,
			List<Track> tracks) {
		super(title, category, length, cost, id);
		this.artist = artist;
		this.tracks = tracks;
	}

	public void addTrack(Track track) {
		if(tracks.contains(track))
			return ;
		else 
			tracks.add(track);		
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track))
			tracks.add(track);
		else
			return;
	}
	
	
	public String getArtist() {
		return artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}
	
	public int getLength() {
		int length = 0;
		for(int i = 0; i< tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}

	@Override
	public void play() {
		for(int i = 0; i< tracks.size(); i++)
		{
			System.out.println("Playing CD: " + tracks.get(i).getTitle());
			System.out.println("CD length: " + tracks.get(i).getLength());
			System.out.println("CD artist: " + this.artist);
			System.out.println("CD : " + this.artist);
		}
	}

}
