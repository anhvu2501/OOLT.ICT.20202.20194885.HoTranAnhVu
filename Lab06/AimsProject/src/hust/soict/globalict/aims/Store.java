package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

import java.util.Vector;

public class Store {
    public static final int MAX = 20;
    private static Vector <DigitalVideoDisc> store = new Vector<>(MAX);
    public void addDVDs (DigitalVideoDisc disc) {
        if (store.size() < MAX) {
            store.add(disc);
            System.out.println("The disc has been added");
        }
        else
            System.out.println("The cart is full");
    }

    public void removeDVDs (DigitalVideoDisc disc) {
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getTitle().compareTo(disc.getTitle()) == 0) {
                store.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }

    public void displayStore () {
        System.out.println("DVDs in cart: ");
        for (DigitalVideoDisc disc : store) {
            disc.getInfo();
        }
    }
}
