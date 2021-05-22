package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.Playable;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.Disc;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) throws NullPointerException, ClassCastException{
        if (this != null) {
            if (o instanceof DigitalVideoDisc) {
                DigitalVideoDisc dvd = (DigitalVideoDisc) o;
                if (this.getTitle() == dvd.getTitle() && this.getCost() == dvd.getCost())
                    return true;
                else
                    return false;
            } else
                throw new ClassCastException("The media is not a CD");
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateAdded);
    }
}
