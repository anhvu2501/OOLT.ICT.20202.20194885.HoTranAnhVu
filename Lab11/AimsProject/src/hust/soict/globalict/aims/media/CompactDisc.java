package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.Playable;
import hust.soict.globalict.aims.exception.PlayerException;

import java.util.Iterator;
import java.util.Vector;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private Vector<Track> tracks = new Vector<>();

    public CompactDisc(int id, String title, String category, double cost, String artist, Vector<Track> tracks) {
        super(id, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        for (Track t : tracks) {
            if (track.equals(t)) {
                System.out.println("This track's already existed!");
                break;
            } else {
                tracks.add(track);
                System.out.println("This track has been added!");
                break;
            }
        }
    }

    public void removeTrack(Track track) {
        for (int i = 0; i < tracks.size(); i++) {
            if (track.equals(tracks.get(i))) {
                tracks.remove(i);
                System.out.println("This track has been removed successfully");
                break;
            }
        }
    }

    public void totalLength() {
        int totalLength = 0;
        for (Track t : tracks) {
            totalLength += t.getLength();
        }
        System.out.println("The length of the CD is: " + totalLength);
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("CD ID: " + getId());
            System.out.println("CD title: " + getTitle());
            System.out.println("CD category: " + getCategory());
            System.out.println("CD artist: " + getArtist());
            System.out.println("CD cost " + getCost());
            Track nextTrack;
            Iterator iterator = tracks.iterator();
            while (iterator.hasNext()) {
                nextTrack = (Track) iterator.next();
                try {
                    nextTrack.play();
                } catch (PlayerException e) {
                    throw e;
                }
            }
        } else
            throw new PlayerException("ERROR: CD length is non-positive!");
    }
}
