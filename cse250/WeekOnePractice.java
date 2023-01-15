public class WeekOnePractice {
    public static void main(String[] args) {
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355; // Liters in a 12-ounce can
        double totalVolume = cansPerPack * CAN_VOLUME;

        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" liters.");


        // double BOTTLE_VOLUME = 2; // Two-liter bottle
        // totalVolume = totalVolume +  BOTTLE_VOLUME;

        // System.out.print("A six-pack and a two-liter bottle contain ");
        // System.out.print(totalVolume);
        // System.out.println(" liters.");


        double pricePerPack = 2.59;
        double pricePerLiter = pricePerPack / totalVolume;

        System.out.print("Price per liter: ");
        System.out.println(pricePerLiter);

        int dollars = (int) pricePerLiter;

        System.out.print("Dollars: $ ");
        System.out.println(dollars);

        // multiply by 100 and round to the nearest integer to get price in pennies
        int pennies = (int) Math.round(pricePerLiter * 100);
        System.out.print("Pennies: ");
        System.out.println(pennies);

        int cents = pennies % 100;
        System.out.print("Cents: ");
        System.out.println(cents);
    }
}