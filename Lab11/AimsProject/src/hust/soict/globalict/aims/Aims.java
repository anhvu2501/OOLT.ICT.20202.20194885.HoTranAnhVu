package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.Disc;

import javax.naming.LimitExceededException;


public class Aims {

    public static void showMenu () {
        System.out.println("AIMs: ");
        System.out.println("-------------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu () {
        System.out.println("Options: ");
        System.out.println("-------------------------------------");
        System.out.println("1. See a DVD's details");
        System.out.println("2. Add a DVD to cart");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void cartMenu () {
        System.out.println("Options: ");
        System.out.println("-------------------------------------");
        System.out.println("1. Filter DVDs in cart");
        System.out.println("2. Sort DVDs in cart");
        System.out.println("3. Remove DVD from cart");
        System.out.println("4. Get a lucky item from cart");
        System.out.println("5. Place order");
        System.out.println("0. Exit");
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) throws LimitExceededException {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Soul", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Lion King", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Peter Pan", "Animation", 3.6, 120, "Tom");
        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(dvd3);
//        anOrder.displayCart();
        //Problem 2: Override compareTo in class Media
//        System.out.println("Sort by title: ");
//        anOrder.sortInCartByTittle();
//        anOrder.displayCart();

        Book b1 = new Book(4, "Aladin", "Math", 2.5);
        Book b2 = new Book(5, "Physics", "Study", 2.5);
        Book b3 = new Book(6, "Chemistry", "Literature", 2.5);
        anOrder.addMedia(b1);
        anOrder.addMedia(b2);
        anOrder.addMedia(b3);
        Disc disc1 = new Disc (7, "Say you won't let go", "Pop", 2.5, 240, "James");
        Disc disc2 = new Disc (8, "Try", "Rock", 2.5, 240, "James");
        Disc disc3 = new Disc (9, "Baby", "R&B", 2.5, 240, "James");
        anOrder.addMedia(disc1);
        anOrder.addMedia(disc2);
        anOrder.addMedia(disc3);
        anOrder.displayCart();
        System.out.println("Sort: ");
        anOrder.sortInCartByTittle();
        anOrder.displayCart();

//        MemoryDaemon md = new MemoryDaemon ();
//        showMenu();
//        int choice;
//        Store store = new Store ();
//        Disc d = new Disc (1, "Say you won't let go", "Pop", 2.5, 240, "James");
//        DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Soul", "Animation", 3.6, 120, "Tom");
//        Track track1 = new Track("Track 1", 20);
//        Track track2 = new Track("Track 2", 15);
//        Track track3 = new Track("Track 3", 30);
//        Vector<Track> track = new Vector<>();
//        track.add(track1);
//        track.add(track2);
//        track.add(track3);
//        CompactDisc c = new CompactDisc(3, "Night changes", "Pop", 2.8, "One Direction", track);
//        store.addMedia(d);
//        store.addMedia(dvd);
//        store.addMedia(c);
//        Cart anOrder = new Cart();
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter your choice: ");
//            choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    storeMenu();
//                    do {
//                        System.out.println("Enter you choice in store menu: ");
//                        choice = Integer.parseInt(sc.nextLine());
//                        switch (choice) {
//                            case 1:
//                                break;
//                            case 2:
//                                Disc disc = new Disc (1, "Say you won't let go", "Pop", 2.5, 240, "James");
//                                anOrder.addMedia(disc);
//                                DigitalVideoDisc dvd1= new DigitalVideoDisc(2, "Soul", "Animation", 3.6, 120, "Tom");
//                                anOrder.addMedia(dvd1);
//                                dvd1.play(); // Play DVD
//                                Track track10 = new Track("Track 1", 20);
//                                Track track20 = new Track("Track 2", 15);
//                                Track track30 = new Track("Track 3", 30);
//                                Vector<Track> tracks = new Vector<>();
//                                tracks.add(track1);
//                                tracks.add(track2);
//                                tracks.add(track3);
//                                Track track4 = new Track("Track 2", 15);
//                                tracks.add(track4);
//                                CompactDisc cd = new CompactDisc(3, "Night changes", "Pop", 2.8, "One Direction", tracks);
//                                anOrder.addMedia(cd);
//                                cd.play(); // Play Compact Disc
//                                break;
//                            case 3:
//                                do {
//                                    cartMenu();
//                                    System.out.println("Enter your choice in cart menu: ");
//                                    choice = Integer.parseInt(sc.nextLine());
//                                    String Schoice;
//                                    switch (choice) {
//                                        case 1:
//                                            System.out.println("Which type of filter do you want? ");
//                                            Schoice = sc.nextLine();
//                                            if (Schoice.compareTo("ID") == 0) {
//                                                System.out.println("Enter the ID: ");
//                                                int id = Integer.parseInt(sc.nextLine());
//                                                anOrder.searchInCartById(id);
//                                            }
//                                            if (Schoice.compareTo("Title") == 0) {
//                                                System.out.println("Enter the title: ");
//                                                String title = sc.nextLine();
//                                                anOrder.searchInCartByTitle(title);
//                                            }
//                                            break;
//                                        case 2:
//                                            System.out.println("Which type of Sort do you want? ");
//                                            Schoice = sc.nextLine();
//                                            if (Schoice.compareTo("Title") == 0) {
//                                                anOrder.sortInCartByTittle();
//                                                System.out.println("After sorting by Title: ");
//                                                anOrder.displayCart();
//                                            }
//                                            if (Schoice.compareTo("Cost") == 0)
//                                                anOrder.sortInCartByCost();
//                                            System.out.println("After sorting by Cost: ");
//                                            anOrder.displayCart();
//                                            break;
//                                        case 3:
//                                            System.out.println("Enter the ID of the object you want to move?");
//                                            int id = Integer.parseInt(sc.nextLine());
//                                            anOrder.removeMedia(id);
//                                            break;
//                                        case 4:
//                                            System.out.println("Waiting ....");
//                                            anOrder.getALuckyItem();
//                                            break;
//                                        case 5:
//                                            System.out.println("Your total cost: ");
//                                            anOrder.totalCost();
//                                            break;
//                                        case 0:
//                                            break;
//                                    }
//                                } while (choice >0 && choice <= 5);
//                                break;
//                            case 0:
//                                break;
//                        }
//                    } while (choice >0 && choice <= 4);
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 0:
//                    break;
//            }
//        }
//        while (choice >0 && choice <= 4);
//        md.run();
        

//        Store inStore = new Store();
////        String title;
////        String category;
////        String director;
////        int length;
////        double cost;
////        String ans;
////        Scanner sc = new Scanner(System.in);
////        do {
////            System.out.println("Do you want to add DVDs to cart?");
////            ans = sc.nextLine();
////            if (ans.compareTo("YES") == 0 ) {
////                System.out.println("Enter the information of DVDs: ");
////                title = sc.nextLine();
////                category = sc.nextLine();
////                director = sc.nextLine();
////                length = Integer.parseInt(sc.nextLine());
////                cost = Double.parseDouble(sc.nextLine());
////                hust.soict.globalict.aims.disc.DigitalVideoDisc d = new hust.soict.globalict.aims.disc.DigitalVideoDisc(title, category, director, length, cost);
////                anOrder.addDigitalVideoDisc(d);
////            }
////            else
////                break;
////        }
////        while (!ans.isEmpty());
////        anOrder.displayCart();
////        do {
////            System.out.println("Do you want to remove DVD?");
////            ans = sc.nextLine();
////            if (ans.compareTo("YES") == 0) {
////                System.out.println("Enter the tittle of the DVD?");
////                title = sc.nextLine();
////                hust.soict.globalict.aims.disc.DigitalVideoDisc removeDVD = new hust.soict.globalict.aims.disc.DigitalVideoDisc(title);
////                anOrder.removeDigitalDisc(removeDVD);
////            }
////            else
////                break;
////        }
////        while (!ans.isEmpty());
////        System.out.println("After removing DVDs: ");
////        anOrder.displayCart();
////        System.out.println("We are calculating your total cost ...");
////        anOrder.totalCost();
//
//        //Another Version
////        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 24.5);
////        anOrder.addDigitalVideoDisc(dvd1);
////        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 19.3);
////        anOrder.addDigitalVideoDisc(dvd2);
////        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Tom", 100, 18.2);
////        anOrder.addDigitalVideoDisc(dvd3);
////        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Soul", "Animation", "James", 110, 16.1);
////        anOrder.addDigitalVideoDisc(dvd4);
////        anOrder.displayCart();
////        System.out.println("Sort by cost ascendingly: ");
////        anOrder.sortInCartByCost();
////        anOrder.displayCart();
////        System.out.println("Sort by title descendingly: ");
////        anOrder.sortInCartByTittle();
////        anOrder.displayCart();
////        anOrder.searchInCart(dvd2);
////        System.out.println("**********CART**********");
////        System.out.println("Ordered items: ");
////        anOrder.printCart();
////        System.out.println("*************************");
//
//        showMenu();
//        int choice;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter your choice: ");
//            choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    storeMenu();
//                    do {
//                        System.out.println("Enter your choice in store menu: ");
//                        choice = Integer.parseInt(sc.nextLine());
//                        switch (choice) {
//                            case 1:
//                                inStore.displayStore();
//                                System.out.println("Do you want to add that DVD to the current cart?");
//                                break;
//                            case 2: //Add to cart
//                                String title;
//                                String category;
//                                String director;
//                                int length;
//                                double cost;
//                                System.out.println("Enter the information of DVDs: ");
//                                title = sc.nextLine();
//                                category = sc.nextLine();
//                                director = sc.nextLine();
//                                length = Integer.parseInt(sc.nextLine());
//                                cost = Double.parseDouble(sc.nextLine());
//                                DigitalVideoDisc d = new hust.soict.globalict.aims.disc.DigitalVideoDisc(title, category, director, length, cost);
//                                anOrder.addDigitalVideoDisc(d);
//                                break;
//                            case 3:
//                                cartMenu();
//                                do {
//                                    System.out.println("Enter your choice in cart menu: ");
//                                    choice = Integer.parseInt(sc.nextLine());
//                                    switch (choice) {
//                                        case 1:
//                                            System.out.println("Which type do you want to use: Filter by ID or Filter by Title?");
//                                            String sortChoice;
//                                            sortChoice = sc.nextLine();
//                                            if (sortChoice.compareTo("By ID") == 0) {
//                                                int id;
//                                                id = Integer.parseInt(sc.nextLine());
//                                                System.out.println("Filter by ID: ");
//                                                anOrder.searchInCartById(id);
//                                            }
//                                            if (sortChoice.compareTo("By Title") == 0) {
//                                                String filterTitle = sc.nextLine();
//                                                System.out.println("Filter by Title: ");
//                                                anOrder.searchInCartByTitle(filterTitle);
//                                            }
//                                            break;
//                                        case 2:
//                                            System.out.println("Which type do you want to use: Sort by cost or Sort by Title?");
//                                            String filterChoice;
//                                            filterChoice = sc.nextLine();
//                                            if (filterChoice.compareTo("By Cost") == 0) {
//                                                System.out.println("Sort by Cost: ");
//                                                anOrder.sortInCartByCost();
//                                            }
//                                            if (filterChoice.compareTo("By Title") == 0) {
//                                                System.out.println("Sort by Title: ");
//                                                anOrder.sortInCartByTittle();
//                                            }
//
//                                            break;
//                                        case 3:
//                                            break;
//                                        case 4:
//                                            break;
//                                    }
//                                } while (choice >=0 && choice <= 4);
//                                break;
//                            case 4:
//                                break;
//                        }
//                    }
//                    while (choice >= 0 && choice <= 4);
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 0:
//                    break;
//            }
//        }
//        while (choice >= 0 && choice <= 4);
//
    }
}
