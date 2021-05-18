package hust.soict.globalict.aims.disc;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    private static int nbDigitalVideoDisc = 0;
    private LocalDate dateAdded;
    private int id;

    public String getDetail () {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " - " + cost;
    }

    public LocalDate getDateAdded () {
        return this.dateAdded;
    }

    public int getId () {
        return this.id;
    }

    public DigitalVideoDisc (DigitalVideoDisc dvd) {
        this.title = dvd.getTitle();
        this.category = dvd.getCategory();
        this.director = dvd.getDirector();
        this.length = dvd.getLength();
        this.cost = dvd.getCost();
        this.id = dvd.getId();

    }

    public DigitalVideoDisc (int id, String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = id;
    }

    public DigitalVideoDisc (String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc (String title) {
        this.title = title;
    }

    public DigitalVideoDisc (String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    //Java allow us to create several constructors
    //I think we can overload Constructor hust.soict.globalict.aims.disc.DigitalVideoDisc. Just need to declare an object suitable with the constructor we build
    //Other constructors can be built similarly

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }

    public double getCost() {
        return this.cost;
    }

    //Just for testing
    public void getInfo () {
        System.out.println("ID: " + this.id);
        System.out.print(" - Name: " + this.title);
        System.out.print(" - Category: " + this.category);
        System.out.print(" - Director: " + this.director);
        System.out.print(" - Length: " + this.length);
        System.out.println(" - Cost: " + this.cost);
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public void setDirector (String director) {
        this.director = director;
    }

    public void setLength (int length) {
        this.length = length;
    }

    public void setCost (Double cost) {
        this.cost = cost;
    }

    public boolean search (String title) {
        String [] tmp = title.split(" ");
        for (int i = 0; i < tmp.length; i ++ ) {
            if (!this.title.contains(tmp[i]))
                return false;
        }
        return true;
    }
}
