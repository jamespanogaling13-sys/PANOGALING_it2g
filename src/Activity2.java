import java.util.Scanner;

public class Activity2 {
    public void userGreetings() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CINEMA TICKET SYSTEM ===");
        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int formatChoice = sc.nextInt();

        System.out.print("Enter Screening Hour (24-Hour Format, e.g., 18): ");
        int hour = sc.nextInt();

        String format;
        double basePrice;

        if (formatChoice == 1) {
            format = "REGULAR";
            basePrice = 350.00;
        } else if (formatChoice == 2) {
            format = "3D";
            basePrice = 400.00;
        } else {
            format = "IMAX";
            basePrice = 450.00;
        }

        double peakFee = 0.00;
        if (hour >= 17 && hour <= 20) {
            peakFee = 50.00;
        }

        double totalCost = basePrice + peakFee;

        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + format);
        System.out.println("Base Ticket Price: PHP " + basePrice);
        System.out.println("Peak Hour Fee:     PHP " + peakFee);
        System.out.println("--------------------------------");
        System.out.println("TOTAL TICKET COST: PHP " + totalCost);
        System.out.println("STATUS:            SEAT RESERVED");
    }
}