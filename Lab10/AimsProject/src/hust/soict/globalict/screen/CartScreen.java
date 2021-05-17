package hust.soict.globalict.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.Disc;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javax.swing.*;
import java.io.IOException;

public class CartScreen extends JFrame {

    public CartScreen(Cart cart) {
        super();

        JFXPanel jfxPanel = new JFXPanel();
        this.add(jfxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass()
                            .getResource("cartscreen.fxml"));
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    Parent root = loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

//    public static void main(String[] args) {
//        Cart cart = new Cart();
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Soul", "Animation", 3.6, 120, "Tom");
//        Book b1 = new Book(2, "Aladin", "Math", 2.5);
//        Disc disc1 = new Disc(3, "Say you won't let go", "Pop", 2.5, 240, "James");
//        cart.addMedia(dvd1);
//        cart.addMedia(b1);
//        cart.addMedia(disc1);
//        new CartScreen(cart);
//    }
}
