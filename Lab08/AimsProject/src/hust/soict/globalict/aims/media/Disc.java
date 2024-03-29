package hust.soict.globalict.aims.media;

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
}
