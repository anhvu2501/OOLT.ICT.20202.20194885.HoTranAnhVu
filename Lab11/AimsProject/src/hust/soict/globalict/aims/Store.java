package hust.soict.globalict.aims;

import hust.soict.globalict.aims.media.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Store {
    public static final int MAX = 20;
    private ArrayList<Media> cart = new ArrayList<>();
    public void addMedia (Media media) {
        if (cart.contains(media) == false) {
            cart.add(media);
            System.out.println("The media has been added");
        }
    }

    public void removeMedia (Media media) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getTitle().compareTo(media.getTitle()) == 0) {
                cart.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return cart;
    }
}
