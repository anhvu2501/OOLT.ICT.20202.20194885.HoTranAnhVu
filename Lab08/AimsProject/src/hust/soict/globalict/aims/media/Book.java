package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book (int id, String title, String category, double cost) {
        super (id, title, category, cost);
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

    public String getDetail () {
        Map <String, Integer> map = new HashMap<String, Integer>();
        String [] words = this.getTitle().split("w");
        for (String w : words) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            }
            else {
                map.put(w, map.get(w) + 1);
            }
        }

        StringBuffer ret = new StringBuffer();
        ret.append("ID: " + this.getId() + " Title: " + this.getTitle() + " Category: " + this.getCategory() + " Cost " + this.getCost());
        ret.append("Author = ");
        for (String author : authors)
            ret.append(author + ", ");
        for (Map.Entry<String, Integer> entry : map.entrySet())
            ret.append(entry.getKey() + ": " +entry.getValue() + ",");
        ret.append("Cost = " + this.getCost());
        return ret.toString();
    }
}
