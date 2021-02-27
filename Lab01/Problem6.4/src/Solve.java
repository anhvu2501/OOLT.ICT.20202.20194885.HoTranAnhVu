import java.util.Scanner;
public class Solve {
    public static void main(String[] args) {
        String month;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        month = sc.nextLine();
        switch (month) {
            case "1": case "January": case "Jan.": case "Jan":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "3": case "March": case "Mar.": case "Mar":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "5": case "May": case "May.":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "7": case "July": case "Jul.": case "Jul":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "8": case "August": case "Aug.": case "Aug":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "10": case "October": case "Oct.": case "Oct":
                System.out.println(month + " has 31 days");
                break;
            case "12": case "December": case "Dec.": case "Dec":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "4": case "April": case "Apr.": case "Apr":
                System.out.println("Month " + month + " has 30 days");
                break;
            case "6": case "June": case "Jun.": case "Jun":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "9": case "September": case "Sep.": case "Sep":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "11": case "November": case "Nov.": case "Nov":
                System.out.println("Month " + month + " has 31 days");
                break;
            case "2": case "February": case "Feb.": case "Feb":
                System.out.println("Enter year: ");
                year = sc.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(month + " of " + year + " has 29 days.");
                } else {
                    System.out.println(month + " of " + year + " has 28 days.");
                }
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}
