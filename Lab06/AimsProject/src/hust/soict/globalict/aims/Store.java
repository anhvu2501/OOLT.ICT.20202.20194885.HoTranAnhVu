package hust.soict.globalict.aims;

import hust.soict.globalict.aims.media.*;

import java.util.Vector;

public class Store {
    public static final int MAX = 20;
    private static Vector<Media> cart = new Vector<>(MAX);
    public void addMedia (Media media) {
        if (cart.size() < MAX) {
            cart.add(media);
            System.out.println("The disc has been added");
        }
        else
            System.out.println("The cart is full");
    }

    public void removeMedia (Media media) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getTitle().compareTo(media.getTitle()) == 0) {
                cart.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }
}
