import java.util.Scanner;

class HouseholdWaterMonitor {

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (H/L): ");
        char waterUsageStatus = sc.next().charAt(0);

        System.out.println("\n--- Household Details ---");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterUsageStatus);

        if (waterConsumed <= 500) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }

        System.out.print("\nEnter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + total + " litres");
    }
}