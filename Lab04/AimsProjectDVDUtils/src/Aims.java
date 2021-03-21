import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
//        Cart anOrder = new Cart();
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
//
//
        //DVDTest Class
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 5.3f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.1f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 3.3f);

        DVDUtils.compareByCost(dvd1, dvd2);
        DVDUtils.compareByTitle(dvd5, dvd3);

        DigitalVideoDisc [] sorted = new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5};
        DVDUtils.sortByCost(sorted);
        System.out.println("Sort by cost: ");
        for (int i = 0; i < sorted.length; i++)
            sorted[i].getInfo();

        DVDUtils.sortByTitle(sorted);
        System.out.println("Sort by title: ");
        for (int i = 0; i < sorted.length; i++)
            sorted[i].getInfo();
    }
}
