public class DVDUtils {
    public static void compareByCost (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (disc1.getCost() < disc2.getCost())
            System.out.println(disc1.getTitle() + " has cost cheaper than " + disc2.getTitle());
        else
            System.out.println(disc1.getTitle() + " has cost more expensive than " + disc2.getTitle());
    }

    public static void compareByTitle (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (disc1.getTitle().compareTo(disc2.getTitle()) < 0)
            System.out.println(disc1.getTitle() + " has title smaller than " + disc2.getTitle());
        if (disc1.getTitle().compareTo(disc2.getTitle()) > 0)
            System.out.println(disc1.getTitle() + " has title longer than " + disc2.getTitle());
        if (disc1.getTitle().compareTo(disc2.getTitle()) == 0)
            System.out.println(disc1.getTitle() + " has title equal to " + disc2.getTitle());
    }

    public static void swap (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc(disc1);

        disc1.setTitle(disc2.getTitle());
        disc1.setCategory(disc2.getCategory());
        disc1.setDirector(disc2.getDirector());
        disc1.setLength(disc2.getLength());
        disc1.setCost(disc2.getCost());

        disc2.setTitle(tmp.getTitle());
        disc2.setCategory(tmp.getCategory());
        disc2.setDirector(tmp.getDirector());
        disc2.setLength(tmp.getLength());
        disc2.setCost(tmp.getCost());
    }

//Ascending
    public static void sortByCost (DigitalVideoDisc [] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j].getCost() < sorted[min_idx].getCost())
                    min_idx = j;
                swap(sorted[i], sorted[min_idx]);
            }
        }

    }
    
//Descending
    public static void sortByTitle (DigitalVideoDisc [] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j].getTitle().compareTo(sorted[min_idx].getTitle()) > 0)
                    min_idx = j;
                swap(sorted[i], sorted[min_idx]);
            }
        }
    }
}
