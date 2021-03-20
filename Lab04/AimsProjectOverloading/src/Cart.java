import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
public class Cart {
    public static final int MAX = 20;
    Vector <DigitalVideoDisc> cart = new Vector<DigitalVideoDisc>(MAX);
    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        if (cart.size() < MAX) {
            cart.add(disc);
            System.out.println("The disc has been added");
        }
        else
            System.out.println("The cart is full");
    }

    //Overloading
    //I think the advantage of this method is that we can add large amount of data at once.
    public void addDigitalVideoDisc (DigitalVideoDisc []disc) {
        if (cart.size() < MAX) {
            //If we set size of array is 20 but we don't add data full the array
            //This method will also add all the blank index of array to the collections
            Collections.addAll(cart, disc);
            System.out.println("DVDs have been added succesfully");
        }

        else
            System.out.println("The cart is full");
    }

    //Overloading
    public void addDigitalVideoDisc (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (cart.size() < MAX) {
            cart.add(disc1);
            cart.add(disc2);
            System.out.println("DVDs have been added succesfully");
        }
        else
            System.out.println("The cart is full");
    }

    public void displayCart () {
        System.out.println("DVDs in cart: ");
        for (DigitalVideoDisc digitalVideoDisc : cart) {
            digitalVideoDisc.getInfo();
        }
    }

    //Remove by name
    public void removeDigitalDisc (DigitalVideoDisc disc) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getTitle().compareTo(disc.getTitle()) == 0) {
                cart.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }

    //Remove by other elements is kind of similar.

    public void totalCost () {
        double cost = 0;
        for (int i = 0; i < cart.size(); i++) {
            cost += cart.get(i).getCost();
        }
        System.out.println("Total cost: " + cost);
    }
}
