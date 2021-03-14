import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        String title;
        String category;
        String director;
        int length;
        double cost;
        String ans;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Do you want to add DVDs to cart?");
            ans = sc.nextLine();
            if (ans.compareTo("YES") == 0 ) {
                System.out.println("Enter the information of DVDs: ");
                title = sc.nextLine();
                category = sc.nextLine();
                director = sc.nextLine();
                length = Integer.parseInt(sc.nextLine());
                cost = Double.parseDouble(sc.nextLine());
                DigitalVideoDisc d = new DigitalVideoDisc(title, category, director, length, cost);
                anOrder.addDigitalVideoDisc(d);
            }
            else
                break;
        }
        while (!ans.isEmpty());
        anOrder.displayCart();
        do {
            System.out.println("Do you want to remove DVD?");
            ans = sc.nextLine();
            if (ans.compareTo("YES") == 0) {
                System.out.println("Enter the tittle of the DVD?");
                title = sc.nextLine();
                DigitalVideoDisc removeDVD = new DigitalVideoDisc(title);
                anOrder.removeDigitalDisc(removeDVD);
            }
            else
                break;
        }
        while (!ans.isEmpty());
        System.out.println("After removing DVDs: ");
        anOrder.displayCart();
        System.out.println("We are calculating your total cost ...");
        anOrder.totalCost();

        //Another Version
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f );
//        anOrder.addDigitalVideoDisc(dvd3);
//        anOrder.displayCart();
//        anOrder.removeDigitalDisc(dvd3);
//        System.out.println("After removing dvd3: ");
//        anOrder.displayCart();
//        anOrder.totalCost();
    }
}
