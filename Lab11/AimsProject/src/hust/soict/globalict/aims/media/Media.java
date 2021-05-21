package hust.soict.globalict.aims.media;

public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private double cost;

    public Media (int id, String title, String category, double cost) {
        this.id = id;
        this.title = title;
        this.category = category;
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

    public double getCost () {
        return this.cost;
    }

    public void getInfor () {
        System.out.print("ID: " + getId());
        System.out.print(" - Title: " + getTitle());
        System.out.print(" - Category: " + getCategory());
        System.out.println(" - Cost: " + getCost());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Media))
            return false;
        Media media = (Media) obj;
        return id == media.id
                && title.compareTo(media.title) == 0
                && category.compareTo(media.category) == 0
                && Double.compare(cost, media.cost) == 0;
    }

    //Problem 3 - COMPARABLE
    @Override
    public int compareTo(Media o) {
        if (this.title.compareTo(o.getTitle()) == 0)
            return this.category.compareTo(o.getCategory());
        else
            return this.title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "ID: " + id + " Title: " + title + " Category: " + category + " Cost " + cost;
    }
}


