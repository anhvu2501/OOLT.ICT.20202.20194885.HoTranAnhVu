package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.Track;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class AddCompactDiscToStoreScreen extends JFrame {
    private TextField tfId;
    private TextField tfTitle;
    private TextField tfCategory;
    private TextField tfCost;
    private TextField tfArtist;
    private TextField tfTrack1Title;
    private TextField tfTrack2Title;
    private TextField tfTrack3Title;
    private TextField tfTrack1Length;
    private TextField tfTrack2Length;
    private TextField tfTrack3Length;

    public AddCompactDiscToStoreScreen() {
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

        cp.add(new Label("Artist: "));
        tfArtist = new TextField(10);
        cp.add(tfArtist);

        cp.add(new Label("Track 1 Title: "));
        tfTrack1Title = new TextField(10);
        cp.add(tfTrack1Title);

        cp.add(new Label("Track 1 Length: "));
        tfTrack1Length = new TextField(10);
        cp.add(tfTrack1Length);

        cp.add(new Label("Track 2 Title: "));
        tfTrack2Title = new TextField(10);
        cp.add(tfTrack2Title);

        cp.add(new Label("Track 2 Length: "));
        tfTrack2Length = new TextField(10);
        cp.add(tfTrack2Length);

        cp.add(new Label("Track 3 Title: "));
        tfTrack3Title = new TextField(10);
        cp.add(tfTrack3Title);

        cp.add(new Label("Track 3 Length: "));
        tfTrack3Length = new TextField(10);
        cp.add(tfTrack3Length);


        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton createCd = new JButton("Add CD");
        createCd.addActionListener(btnListener);
        createCd.setAlignmentY(CENTER_ALIGNMENT);
        container.add(createCd);
        cp.add(container);
        setTitle("Add Compact Disc");
        setSize(800, 400);
        setVisible(true);

    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add CD")) {
                int id = Integer.parseInt(tfId.getText());
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                double cost = Double.parseDouble(tfCategory.getText());
                String artist = tfArtist.getText();

                Vector<Track> tracks = new Vector<>();
                Track track1 = new Track(tfTrack1Title.getText(), Integer.parseInt(tfTrack1Length.getText()));
                Track track2 = new Track(tfTrack2Title.getText(), Integer.parseInt(tfTrack2Length.getText()));
                Track track3 = new Track(tfTrack3Title.getText(), Integer.parseInt(tfTrack3Length.getText()));
                tracks.add(track1);
                tracks.add(track2);
                tracks.add(track3);

                CompactDisc cd = new CompactDisc(id, title, category, cost, artist, tracks);
                StoreScreen.store.addMedia(cd);
                setVisible(false);
                new StoreScreen(StoreScreen.store);
            }
        }
    }
}
