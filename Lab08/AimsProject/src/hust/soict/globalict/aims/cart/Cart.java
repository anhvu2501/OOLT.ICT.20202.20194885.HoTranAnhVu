package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cart {
    public static final int MAX = 20;
    private static List<Media> cart = new ArrayList<Media>(MAX);

    public void addMedia(Media media) {
        if (cart.size() < MAX) {
            cart.add(media);
            System.out.println("The disc has been added");
        } else
            System.out.println("The cart is full");
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
        for (Media media : cart) {
            media.getInfor();
        }
    }
////
////    //Remove by name


    public void removeMedia(int id) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getId() == id) {
                cart.remove(i);
                System.out.println("Remove successfully");
            }
        }
    }

    ////
////    //Remove by other elements is kind of similar.
////
    public void totalCost() {
        double cost = 0;
        for (Media media : cart) {
            cost += media.getCost();
        }
        System.out.println("Total cost: " + cost);
    }

    public void getALuckyItem() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 100 + 1; //Range [1,100]
        int randomInt = (int) randomDouble;
        for (Media media : cart) {
            if (media.getId() == randomInt) {
                System.out.println("Congratulations! You have a special gift!!");
                break;
            }
        }
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
        Collections.sort(cart);
    }

    ////
//    //Ascending by title: PROBLEM 4 - COMPARATOR
    public void sortInCartByTittle() {
        cart.sort((m1, m2) -> String.valueOf(m1.getTitle()).compareTo(m2.getTitle()));

    }

    ////
    public void searchInCartById(int id) {
        for (Media media : cart) {
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
        for (Media media : cart) {
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
