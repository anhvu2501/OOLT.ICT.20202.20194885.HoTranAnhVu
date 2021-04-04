package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.media.Media;

import java.time.LocalDate;
import java.util.StringTokenizer;
import hust.soict.globalict.aims.media.Media;

public class DigitalVideoDisc extends Media{
    private static int nbDigitalVideoDisc = 0;
    private LocalDate dateAdded;

    public LocalDate getDateAdded () {
        return this.dateAdded;
    }

    public DigitalVideoDisc (int id, String title, String category, String director, double cost) {
        super(id, title, category, director, cost);
    }

}
