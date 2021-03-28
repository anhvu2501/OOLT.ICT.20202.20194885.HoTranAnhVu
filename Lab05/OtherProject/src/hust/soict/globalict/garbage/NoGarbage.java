package hust.soict.globalict.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NoGarbage {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("1");
        long start = System.currentTimeMillis();
        File file = new File("D:\\OOLT.ICT.20202.20194885.HoTranAnhVu\\Lab05\\OtherProject\\src\text.txt");
        try {
            Scanner sc = new Scanner (file);
            int count = 1;
            while (sc.hasNext()) {
                if (count % 15 == 0)
                    stringBuffer.append("\n");
                stringBuffer.append(sc.next()).append(" ");
                count ++;
            }
            start = System.currentTimeMillis() - start;
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open this file!\n");
            e.printStackTrace();
        }
        String string = stringBuffer.toString();
        System.out.println(string);
        System.out.println("This process takes time: " + start + " miliseconds!");
    }
}
