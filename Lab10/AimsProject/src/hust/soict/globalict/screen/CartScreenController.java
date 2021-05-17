package hust.soict.globalict.screen;

import hust.soict.globalict.aims.Playable;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class CartScreenController {
    private Cart cart;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TextField tfFilter;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    public void initialize() {
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<>("Title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<>("Category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<>("Cost"));
        tblMedia.setItems(this.cart.getItemsInCart());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        updateButtonBar(newValue);
                    }
                }
        );
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        btnPlay.setVisible(media instanceof Playable);
    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedium(media);
    }

    void showFilteredMedia(String string) {
        ObservableList<Media> media = FXCollections.observableArrayList();
        if (radioBtnFilterTitle.isSelected()) {
            for (Media media1 : cart.getItemsInCart()) {
                if (media1.getTitle().toLowerCase().contains(string.toLowerCase())) {
                    media.add(media1);
                }
            }
            tblMedia.setItems(media);
        } else {

        }
        if (radioBtnFilterId.isSelected()) {
            for (Media media1 : cart.getItemsInCart()) {
                if (String.valueOf(media1.getId()).toString().toLowerCase().contains(string.toLowerCase())) {
                    media.add(media1);
                }
            }
            tblMedia.setItems(media);
        } else {

        }
    }

    @FXML
    void placeOrder(MouseEvent event) {
        String message;
        message = "Place order";
        JOptionPane.showMessageDialog(null,
                message, "Ordered Successfully", JOptionPane.INFORMATION_MESSAGE);
        cart = new Cart();
        tblMedia.setItems(cart.getItemsInCart());
    }

}
