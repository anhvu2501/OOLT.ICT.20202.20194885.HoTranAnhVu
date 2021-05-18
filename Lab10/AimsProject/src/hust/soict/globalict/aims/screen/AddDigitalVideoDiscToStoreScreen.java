package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends JFrame {
    private TextField tfId;
    private TextField tfTitle;
    private TextField tfCategory;
    private TextField tfCost;
    private TextField tfLength;
    private TextField tfDirector;

    public AddDigitalVideoDiscToStoreScreen() {
        ButtonListener btnListener = new ButtonListener();
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(10, 2));

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

        cp.add(new Label("Length: "));
        tfLength = new TextField(10);
        cp.add(tfLength);

        cp.add(new Label("Director: "));
        tfDirector = new TextField(10);
        cp.add(tfDirector);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton createDVD = new JButton("Add DVD");
        createDVD.addActionListener(btnListener);
        createDVD.setAlignmentY(CENTER_ALIGNMENT);
        container.add(createDVD);
        
        cp.add(container);
        setTitle("Add Digital Video Disc");
        setSize(800, 400);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add DVD")) {
                int id = Integer.parseInt(tfId.getText());
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                double cost = Double.parseDouble(tfCategory.getText());
                int length = Integer.parseInt(tfLength.getText());
                String director = tfDirector.getText();

                DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, cost, length, director);
                StoreScreen.store.addMedia(dvd);
                setVisible(false);
                new StoreScreen(StoreScreen.store);
            }
        }
    }
}
