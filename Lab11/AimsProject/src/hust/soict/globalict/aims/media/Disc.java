package hust.soict.globalict.aims.media;

import java.util.Objects;

public class Disc extends Media{
    private int length;
    private String director;
    public Disc (int id, String title, String category, double cost, int length, String director) {
        super (id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc (int id, String title, String category, double cost) {
        super(id, title, category, cost);
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) throws NullPointerException, ClassCastException{
        if (this != null) {
            if (o instanceof Disc) {
                Disc disc = (Disc) o;
                if (this.getTitle() == disc.getTitle() && this.getCost() == disc.getCost())
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
        return Objects.hash(length, director);
    }
}
