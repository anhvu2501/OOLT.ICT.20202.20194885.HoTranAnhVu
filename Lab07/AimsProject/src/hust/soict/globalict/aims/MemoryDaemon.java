package hust.soict.globalict.aims;

import java.lang.Runnable;
import java.lang.Runtime;

public class MemoryDaemon implements Runnable{
    long memoryUsed;
    public void run () {
        Runtime rt = Runtime.getRuntime();
        long used;
        while (true) {
            used = rt.totalMemory() - rt.freeMemory();
            if (used != memoryUsed) {
                System.out.println("Memory used = " + used);
                memoryUsed = used;
            }
        }
    }

}
