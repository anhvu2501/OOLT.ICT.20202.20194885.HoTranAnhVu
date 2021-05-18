package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.Playable;
import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Media;

import java.time.LocalDate;
import java.util.Collections;
import java.util.StringTokenizer;
import hust.soict.globalict.aims.media.Media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDisc = 0;
    private LocalDate dateAdded;

    public LocalDate getDateAdded () {
        return this.dateAdded;
    }

    public DigitalVideoDisc (int id, String title, String category, double cost, int length, String director) {
        super (id, title, category, cost, length, director);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
