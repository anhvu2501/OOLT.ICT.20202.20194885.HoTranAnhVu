import java.util.Vector;
import java.util.Collections;

public class Cart {
    public static final int MAX = 20;
    private static Vector <DigitalVideoDisc> cart = new Vector<>(MAX);
    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        if (cart.size() < MAX) {
            cart.add(disc);
            System.out.println("The disc has been added");
        }
        else
            System.out.println("The cart is full");
    }

    public void displayCart () {
        System.out.println("DVDs in cart: ");
        for (DigitalVideoDisc disc : cart) {
            disc.getInfo();
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
        for (DigitalVideoDisc disc : cart) {
            cost += disc.getCost();
        }
        System.out.println("Total cost: " + cost);
    }

    //The result is not as expected
    public void swap (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc(disc1);

        disc1.setTitle(disc2.getTitle());
        disc1.setCategory(disc2.getCategory());
        disc1.setDirector(disc2.getDirector());
        disc1.setLength(disc2.getLength());
        disc1.setCost(disc2.getCost());

        disc2.setTitle(tmp.getTitle());
        disc2.setCategory(tmp.getCategory());
        disc2.setDirector(tmp.getDirector());
        disc2.setLength(tmp.getLength());
        disc2.setCost(tmp.getCost());
    }

    //Ascending
    public void sortInCartByCost () {
        for (int i = 0; i < cart.size() - 1; i ++) {
            int min_idx = i;
            for (int j = i + 1; j < cart.size(); j ++) {
                if (cart.get(i).getCost() < cart.get(min_idx).getCost())
                    min_idx = j;
                //Method swap
                swap(cart.get(i), cart.get(min_idx));
            }
        }

    }

    //Descending
    public void sortInCartByTittle () {
        for (int i = 0; i < cart.size() - 1; i ++) {
            int min_idx = i;
            for (int j = i + 1; j < cart.size(); j ++) {
                if (cart.get(i).getTitle().compareTo(cart.get(min_idx).getTitle()) > 0)
                    min_idx = j;
                //Method swap
                swap(cart.get(i), cart.get(min_idx));
            }
        }

    }

    public void searchInCart (DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : cart) {
            if (disc.getId() == digitalVideoDisc.getId()) {
                System.out.println("Searching successfully!!");
                break;
            }
            else {
                System.out.println("No match is found");
            }
        }
    }

    public void printCart (){
        displayCart();
        totalCost();
    }
}
