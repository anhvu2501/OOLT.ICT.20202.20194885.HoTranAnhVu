package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.Store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreScreen extends JFrame {

    protected static Store store;

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());

        return north;
    }

    JMenuBar createMenuBar() {
        ButtonListener btnListener = new ButtonListener();
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        smUpdateStore.add(addBook);
        addBook.addActionListener(btnListener);

        JMenuItem addCd = new JMenuItem("Add CD");
        smUpdateStore.add(addCd);
        addBook.addActionListener(btnListener);

        JMenuItem addDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(addDVD);
        addBook.addActionListener(btnListener);

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        ButtonListener btnListener = new ButtonListener();
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View Cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < 9; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    public StoreScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("View Cart")) {
                setVisible(false);
            } else if (button.equals("Add DVD")) {
                setVisible(false);
                new AddDigitalVideoDiscToStoreScreen();
            } else if (button.equals("Add Book")) {
                setVisible(false);
                new AddBookToStoreScreen();
            } else if (button.equals("Add CD")) {
                setVisible(false);
                new AddCompactDiscToStoreScreen();
            }
        }
    }


    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Soul", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Lion King", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Peter Pan", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(3, "Aladin", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(3, "Harry Potter", "Animation", 3.6, 120, "Tom");
        DigitalVideoDisc dvd6 = new DigitalVideoDisc(3, "Love, Rosie", "Romantic", 3.6, 120, "Tom");
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(3, "Iron man", "Scientific", 3.6, 120, "Tom");
        DigitalVideoDisc dvd8 = new DigitalVideoDisc(3, "Captain America", "Scientific", 3.6, 120, "Tom");
        DigitalVideoDisc dvd9 = new DigitalVideoDisc(3, "Thor", "Scientific", 3.6, 120, "Tom");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        store.addMedia(dvd9);
        store.getItemsInStore().stream()
                .forEach(System.out::println);
        new StoreScreen(store);
    }

}
