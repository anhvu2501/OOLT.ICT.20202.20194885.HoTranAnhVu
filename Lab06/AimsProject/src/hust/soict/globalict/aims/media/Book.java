package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();
    public Book (int id, String title, String category, float cost) {
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

    public float getCost () {
        return this.cost;
    }

    public void addAuthor (String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authorName.compareTo(authors.get(i)) == 0) {
                System.out.println("This author has already existed!");
                break;
            }
            else {
                authors.add(authorName);
                break;
            }
        }
    }

    public void removeAuthor (String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authorName.compareTo(authors.get(i)) == 0) {
                authors.remove(i);
                break;
            }
            else {
                System.out.println("This author does not exist in list");
                break;
            }
        }
    }
}
