package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.Playable;
import hust.soict.globalict.aims.exception.PlayerException;

public class Track implements Playable, Comparable<Track> {
    private String title;
    private int length;

    public Track (String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void play() throws PlayerException {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Track other = (Track) obj;
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }

        if (this.length != other.length) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Track o) {
        return this.title.compareTo(o.getTitle());
    }
}
