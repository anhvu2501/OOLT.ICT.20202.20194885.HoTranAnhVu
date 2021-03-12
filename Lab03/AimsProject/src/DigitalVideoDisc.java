public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    public DigitalVideoDisc (String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

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
        System.out.println("Name: " + this.title);
    }
}
