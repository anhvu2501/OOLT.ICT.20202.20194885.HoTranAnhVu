public class NewCart {
    //Array implement
    public static final int MAX = 20;
    public int qtyOrdered;
    DigitalVideoDisc [] cart = new DigitalVideoDisc[MAX];

    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        if (qtyOrdered < MAX) {
            cart[qtyOrdered] = new DigitalVideoDisc(disc);
            qtyOrdered ++;
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The cart is full");
        }
    }

    public void displayCart () {
        System.out.println("DVDs in cart: ");
        for (int i = 0; i < qtyOrdered; i++)
            cart[i].getInfo();
    }

    public void totalCost () {
        double cost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += cart[i].getCost();
        }
        System.out.println("Total cost: " + cost);
    }

    public static void swap (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
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
    public void sortInCartByCost (DigitalVideoDisc [] cart) {
        for (int i = 0; i < qtyOrdered - 1; i ++) {
            int min_idx = i;
            for (int j = i + 1; j < qtyOrdered; j ++) {
                if (cart[i].getCost() < cart[min_idx].getCost())
                    min_idx = j;
                //Method swap
                swap(cart[i], cart[min_idx]);
            }
        }

    }

    public void sortInCartByTitle () {
        for (int i = 0; i < cart.length - 1; i ++) {
            int min_idx = i;
            for (int j = i + 1; j < cart.length; j ++) {
                if (cart[i].getTitle().compareTo(cart[min_idx].getTitle()) > 0)
                    min_idx = j;
                //Method swap
                swap(cart[i], cart[min_idx]);
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
