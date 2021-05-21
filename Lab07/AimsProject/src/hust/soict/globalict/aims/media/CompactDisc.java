package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.Playable;

import java.util.Vector;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private Vector <Track> tracks = new Vector<>();

    public CompactDisc (int id, String title, String category, double cost, String artist, Vector <Track> tracks) {
        super (id, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack (Track track) {
        for (Track t : tracks) {
            if (track.equals(t)) {
                System.out.println("This track's already existed!");
                break;
            }
            else {
                tracks.add(track);
                System.out.println("This track has been added!");
                break;
            }
        }
    }

    public void removeTrack (Track track) {
        for (int i = 0; i < tracks.size(); i++) {
            if (track.equals(tracks.get(i))) {
                tracks.remove(i);
                System.out.println("This track has been removed successfully");
                break;
            }
        }
    }

    public void totalLength () {
        int totalLength = 0;
        for (Track t : tracks) {
            totalLength += t.getLength();
        }
        System.out.println("The length of the CD is: " + totalLength);
    }

    public void play () {
        System.out.println("CD ID: " + getId());
        System.out.println("CD title: " + getTitle());
        System.out.println("CD category: " + getCategory());
        System.out.println("CD artist: " + getArtist());
        System.out.println("CD cost " + getCost());
        for (int i = 0; i < tracks.size(); i++) {
            System.out.println("Track title: " + tracks.get(i).getTitle());
            System.out.println("Track length: " + tracks.get(i).getLength());
        }
    }
}
