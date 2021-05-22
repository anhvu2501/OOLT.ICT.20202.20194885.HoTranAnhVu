package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.naming.LimitExceededException;
import java.util.Collections;

public class Cart {
    public static final int MAX = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public void addMedia(Media media) throws LimitExceededException {
        if (itemsOrdered.size() < MAX) {
            itemsOrdered.add(media);
            System.out.println("The disc has been added");
        } else
            throw new LimitExceededException("ERROR: The number of " + "media has reached its limit");
    }

    ////    private static Vector <DigitalVideoDisc> cart = new Vector<>(MAX);
////    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
////        if (cart.size() < MAX) {
////            cart.add(disc);
////            System.out.println("The disc has been added");
////        }
////        else
////            System.out.println("The cart is full");
////    }
////
    public void displayCart() {
        System.out.println("In cart: ");
        for (Media media : itemsOrdered) {
            media.getInfor();
        }
    }
////
////    //Remove by name


    public void removeMedia(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == id) {
                itemsOrdered.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }

    public void removeMedium(Media media) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).equals(media)) {
                itemsOrdered.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }

    ////
////    //Remove by other elements is kind of similar.
////
//    public void totalCost() {
//        double cost = 0;
//        for (Media media : itemsOrdered) {
//            cost += media.getCost();
//        }
//        System.out.println("Total cost: " + cost);
//    }

    public double totalCost() {
        double cost = 0;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }
        return cost;
    }

    public void getALuckyItem() throws LuckyException {
        double threshold = Math.random();
        threshold = threshold * 100 + 1; //Range [1,100]
        int randomInt = (int) threshold;
        if (totalCost() >= threshold) {
            for (Media media : itemsOrdered) {
                if (media.getId() == randomInt) {
                    System.out.println("Congratulations! You have a special gift!!");
                    break;
                }
            }
        } else
            throw new LuckyException("Cannot get lucky items");
    }

    public ObservableList<Media> getItemsInCart() {
        return itemsOrdered;
    }


//
//    //The result is not as expected
//    public void swap (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
//        DigitalVideoDisc tmp = new DigitalVideoDisc(disc1);
//
//        disc1.setTitle(disc2.getTitle());
//        disc1.setCategory(disc2.getCategory());
//        disc1.setDirector(disc2.getDirector());
//        disc1.setLength(disc2.getLength());
//        disc1.setCost(disc2.getCost());
//
//        disc2.setTitle(tmp.getTitle());
//        disc2.setCategory(tmp.getCategory());
//        disc2.setDirector(tmp.getDirector());
//        disc2.setLength(tmp.getLength());
//        disc2.setCost(tmp.getCost());
//    }
//
//    //Ascending - PROBLEM 4 - COMPARATOR
//    public void sortInCartByCost () {
//        Collections.sort(cart, new Comparator<Media>() {
//            @Override
//            public int compare(Media m1, Media m2) {
//                return Double.valueOf(m1.getCost()).compareTo(m2.getCost());
//            }
//        });
//
//    }

    //Problem 3 - COMPARABLE
    public void sortInCartByTitle() {
        Collections.sort(itemsOrdered);
    }

    ////
//    //Ascending by title: PROBLEM 4 - COMPARATOR
    public void sortInCartByTittle() {
        itemsOrdered.sort((m1, m2) -> String.valueOf(m1.getTitle()).compareTo(m2.getTitle()));

    }

    ////
    public void searchInCartById(int id) {
        for (Media media : itemsOrdered) {
            if (id == media.getId()) {
                System.out.println("Searching successfully!!");
                break;
            } else {
                System.out.println("No match is found");
            }
        }
    }

    ////
    public void searchInCartByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (title.compareTo(media.getTitle()) == 0) {
                System.out.println("Searching successfully!!");
                break;
            } else {
                System.out.println("No match is found");
            }
        }
    }
//
//
//
//    public void printCart (){
//        displayCart();
//        totalCost();
//    }


}
