package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.Store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store anOrder = new Store();
        String title;
        String category;
        String director;
        int length;
        double cost;
        int id;
        String ans;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Do you want to add DVDs to cart?");
            ans = sc.nextLine();
            if (ans.compareTo("YES") == 0 ) {
                System.out.println("Enter the information of DVDs: ");
                id = Integer.parseInt(sc.nextLine());
                title = sc.nextLine();
                category = sc.nextLine();
                director = sc.nextLine();
                length = Integer.parseInt(sc.nextLine());
                cost = Double.parseDouble(sc.nextLine());
                DigitalVideoDisc d = new hust.soict.globalict.aims.disc.DigitalVideoDisc(id, title, category, director, length, cost);
                anOrder.addDVDs(d);
            }
            else
                break;
        }
        while (!ans.isEmpty());
        anOrder.displayStore();
        do {
            System.out.println("Do you want to remove DVD?");
            ans = sc.nextLine();
            if (ans.compareTo("YES") == 0) {
                System.out.println("Enter the tittle of the DVD?");
                title = sc.nextLine();
                hust.soict.globalict.aims.disc.DigitalVideoDisc removeDVD = new hust.soict.globalict.aims.disc.DigitalVideoDisc(title);
                anOrder.removeDVDs(removeDVD);
            }
            else
                break;
        }
        while (!ans.isEmpty());
        System.out.println("After removing DVDs: ");
        anOrder.displayStore();
    }
}
