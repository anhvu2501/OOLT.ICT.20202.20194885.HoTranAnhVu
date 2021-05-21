package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.Playable;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Disc;

import java.time.LocalDate;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDisc = 0;
    private LocalDate dateAdded;

    public LocalDate getDateAdded () {
        return this.dateAdded;
    }

    public DigitalVideoDisc (int id, String title, String category, double cost, int length, String director) {
        super (id, title, category, cost, length, director);
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else
            throw new PlayerException("ERROR: DVD length is non-positive!");
    }
}
