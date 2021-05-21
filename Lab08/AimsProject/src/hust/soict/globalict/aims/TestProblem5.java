package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class TestProblem5 {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<Media>();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Soul", "Animation", 3.6, 120, "Tom");
        Book b1 = new Book(2, "Aladin", "Math", 2.5);
        Disc disc1 = new Disc (3, "Say you won't let go", "Pop", 2.5, 240, "James");
        mediaList.add(dvd1);
        mediaList.add(b1);
        mediaList.add(disc1);
        for (Media m : mediaList)
            System.out.println(m.toString());

        //When toString() has not been overriden yet: In this case, the toString() method returns the output of the hashcode values of the objects, if I want to print out the
        //values I want I have to implement the desired output in the toString() method by overriding it.

        //When toString() has been overriden: Now, writing System.out.println(m.toString()) will display the output I wanted.
    }
}
