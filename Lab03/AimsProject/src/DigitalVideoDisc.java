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

    public DigitalVideoDisc (String title) {
        this.title = title;
    }

    public DigitalVideoDisc (String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    //Java allow us to create several constructors
    //I think we can overload Constructor DigitalVideoDisc. Just need to declare an object suitable with the constructor we build
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
        System.out.print("Name: " + this.title);
        System.out.print(" - Category: " + this.category);
        System.out.print(" - Director: " + this.director);
        System.out.print(" - Length: " + this.length);
        System.out.println(" - Cost: " + this.cost);
    }
}
