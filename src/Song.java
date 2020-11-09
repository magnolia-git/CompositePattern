public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}
	
	// Your code goes here!
	public String getName() {
		return songName;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void play() {
		System.out.println("Playing " + songName + " by " + artist);
		
	}

	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
		
	}
}