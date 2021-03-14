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

    public void displayCart () {
        System.out.println("DVDs in cart: ");
        for (int i = 0; i < cart.size(); i++) {
            cart.get(i).getInfo();
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
