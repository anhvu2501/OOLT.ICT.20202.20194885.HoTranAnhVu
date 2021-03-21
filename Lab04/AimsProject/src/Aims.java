import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
//        String title;
//        String category;
//        String director;
//        int length;
//        double cost;
//        String ans;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Do you want to add DVDs to cart?");
//            ans = sc.nextLine();
//            if (ans.compareTo("YES") == 0 ) {
//                System.out.println("Enter the information of DVDs: ");
//                title = sc.nextLine();
//                category = sc.nextLine();
//                director = sc.nextLine();
//                length = Integer.parseInt(sc.nextLine());
//                cost = Double.parseDouble(sc.nextLine());
//                DigitalVideoDisc d = new DigitalVideoDisc(title, category, director, length, cost);
//                anOrder.addDigitalVideoDisc(d);
//            }
//            else
//                break;
//        }
//        while (!ans.isEmpty());
//        anOrder.displayCart();
//        do {
//            System.out.println("Do you want to remove DVD?");
//            ans = sc.nextLine();
//            if (ans.compareTo("YES") == 0) {
//                System.out.println("Enter the tittle of the DVD?");
//                title = sc.nextLine();
//                DigitalVideoDisc removeDVD = new DigitalVideoDisc(title);
//                anOrder.removeDigitalDisc(removeDVD);
//            }
//            else
//                break;
//        }
//        while (!ans.isEmpty());
//        System.out.println("After removing DVDs: ");
//        anOrder.displayCart();
//        System.out.println("We are calculating your total cost ...");
//        anOrder.totalCost();

        //Another Version
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 24.5);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 19.3);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Tom", 100, 18.2);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Soul", "Animation", "James", 110, 16.1);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.displayCart();
        System.out.println("Sort by cost ascendingly: ");
        anOrder.sortInCartByCost();
        anOrder.displayCart();
        System.out.println("Sort by title descendingly: ");
        anOrder.sortInCartByTittle();
        anOrder.displayCart();
        anOrder.searchInCart(dvd2);
        System.out.println("**********CART**********");
        System.out.println("Ordered items: ");
        anOrder.printCart();
        System.out.println("*************************");
    }
}
