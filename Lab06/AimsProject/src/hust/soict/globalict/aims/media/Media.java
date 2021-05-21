package hust.soict.globalict.aims.media;

public class Media {
    private int id;
    private String title;
    private String category;
    private String director;
    private double cost;

    public Media (int id, String title, String category, String director, double cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public int getId () {
        return this.id;
    }

    public String getTitle () {
        return this.title;
    }

    public String getCategory () {
        return this.category;
    }

    public String getDirector () {
        return this.director;
    }

    public double getCost () {
        return this.cost;
    }

    public void getInfor () {
        System.out.print("ID: " + getId());
        System.out.print(" - Title: " + getTitle());
        System.out.print(" - Category: " + getCategory());
        System.out.print(" - Director: " + getDirector());
        System.out.println(" - Cost: " + getCost());
    }
}


