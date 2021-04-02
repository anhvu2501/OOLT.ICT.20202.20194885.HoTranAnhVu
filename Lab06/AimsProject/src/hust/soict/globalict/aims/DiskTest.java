package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.cart.Cart;
public class DiskTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("Soul", "Animation", " Tom", 110, 2.5);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Soul1", "Animation", " Tom", 110, 2.5);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Soul2", "Animation", " Tom", 110, 2.5);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc ("Soul3", "Animation", " Tom", 110, 2.5);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd4);
        System.out.println("Result for searching 'Soul': " + dvd1.search("Soul"));
    }

}
