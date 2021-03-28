package hust.soict.globalict.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();
        File file = new File("D:\\OOLT.ICT.20202.20194885.HoTranAnhVu\\Lab05\\OtherProject\\src\text.txt");
        try {
            Scanner sc = new Scanner(file);
            int count = 1;
            while (sc.hasNext()) {
                if (count % 15 == 0)
                    s += "\n";
                s = s + sc.next() + " ";
                count ++;
            }
            start = System.currentTimeMillis() - start;
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file\n");
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println("This process takes time: " + start/1000 + " seconds!");
    }

}
