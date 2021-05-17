package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.media.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookToStoreScreen extends JFrame {
    private TextField tfId;
    private TextField tfTitle;
    private TextField tfCategory;
    private TextField tfCost;

    public AddBookToStoreScreen() {
        ButtonListener btnListener = new ButtonListener();
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6, 2));

        cp.add(new Label("ID: "));
        tfId = new TextField(10);
        cp.add(tfId);

        cp.add(new Label("Title: "));
        tfTitle = new TextField(10);
        cp.add(tfTitle);

        cp.add(new Label("Category: "));
        tfCategory = new TextField(10);
        cp.add(tfCategory);

        cp.add(new Label("Cost: "));
        tfCost = new TextField(10);
        cp.add(tfCost);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton createBook = new JButton("Add Book");
        createBook.addActionListener(btnListener);
        createBook.setAlignmentY(CENTER_ALIGNMENT);
        container.add(createBook);
        cp.add(container);
        setTitle("Add Book");
        setSize(800, 400);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add Book")) {
                int id = Integer.parseInt(tfId.getText());
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                double cost = Double.parseDouble(tfCategory.getText());

                Book book = new Book(id, title, category, cost);
                StoreScreen.store.addMedia(book);
                setVisible(false);
                new StoreScreen(StoreScreen.store);
            }
        }
    }
}
