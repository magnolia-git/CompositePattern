import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist;

	public Playlist(String playlistName) {
		super();
		this.playlist = new ArrayList<>();
		this.playlistName = playlistName;
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}
	
	public void add(IComponent component) {
		
		playlist.add(component);
	}
	
	public void play() {
		System.out.println("Loading the Playlist " + playlistName);
		for (IComponent c : playlist) {
			c.play();
		}
	}
	public String getName() {
		return playlistName;
	}
	
	public void setPlaybackSpeed(float speed) {
		for (IComponent c : playlist) {
			c.setPlaybackSpeed(speed);
		}
	}

}