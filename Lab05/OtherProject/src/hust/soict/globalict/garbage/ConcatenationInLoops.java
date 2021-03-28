package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random();
        long start = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 65536; i++) {
            string += r.nextInt(2);
        }
        System.out.println(System.currentTimeMillis());

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i ++) {
            sb.append(r.nextInt(2));
        }
        string = sb.toString();
        System.out.println(System.currentTimeMillis() - start);

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 65536; i++) {
            sbf.append(r.nextInt(2));
        }
        string = sbf.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
