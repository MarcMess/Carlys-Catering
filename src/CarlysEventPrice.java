
import java.util.Scanner;
import java.text.DecimalFormat;


public class CarlysEventPrice {

    static final double PRICE_PER = 35.0;

    public static void main(String[] args) {

        CarlysMotto.motto();
        int cGuests = getGuests();
        double cTotalPrice = doCalcs(cGuests);
        boolean cIsLarge = largeParty(cGuests);
        output(cGuests, cTotalPrice, cIsLarge);


    }

    private static boolean largeParty(int cGuests) {

        boolean cIsLarge = false;

        if (cGuests >= 50){
            cIsLarge = true;
        }

        return cIsLarge;
    }

    private static void output(int cGuests, double cTotalPrice, boolean cIsLarge) {
        DecimalFormat money = new DecimalFormat("$###,###.00");


        System.out.printf("\n\n%20s %7s", "Number of guests:", cGuests);
        System.out.printf("\n%20s %10s" , "Price per guest:" , money.format(Math.round(PRICE_PER * 100.0) / 100.0));
        System.out.printf("\n%20s %10s" , "Total price:" , money.format(Math.round(cTotalPrice * 100.0) / 100.0));

        System.out.printf("\n\n%20s %s\n\n" , "Large event:" , cIsLarge);

    }

    private static double doCalcs(int cGuests) {

        double cTotalPrice = cGuests * PRICE_PER;

        return cTotalPrice;
    }

    private static int getGuests() {
        System.out.printf("\n\n%s" , "How many guests will be attending?: ");

        Scanner Guests = new Scanner(System.in);
        int cGuests;
        try {
            cGuests = Integer.parseInt(Guests.nextLine());
        }
        catch (Exception e){
            cGuests = 35;
            System.out.printf("\n\nYour entry was not a valid whole number so the number of guests has defaulted to 35.\n");
        }
        return cGuests;
    }
blah blah blah a test

}
