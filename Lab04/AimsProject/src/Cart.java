import java.util.Comparator;
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
        Collections.sort(cart, new Comparator<DigitalVideoDisc>() {
            @Override
            public int compare(DigitalVideoDisc o1, DigitalVideoDisc o2) {
                return Double.valueOf(o1.getCost()).compareTo(o2.getCost());
            }
        });

    }

    //Ascending by title
    public void sortInCartByTittle () {
        Collections.sort(cart, new Comparator<DigitalVideoDisc>() {
            @Override
            public int compare(DigitalVideoDisc o1, DigitalVideoDisc o2) {
                return String.valueOf(o1.getTitle()).compareTo(o2.getTitle());
            }
        });

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
