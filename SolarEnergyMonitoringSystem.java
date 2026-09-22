import java.util.Scanner;

public class SolarEnergyMonitoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ROOFTOP SOLAR ENERGY MONITORING SYSTEM");
        

        System.out.print("Enter solar panel voltage (V): ");
        double voltage = scanner.nextDouble();

        System.out.print("Enter solar panel current (A): ");
        double current = scanner.nextDouble();

        System.out.print("Enter operating time (hours): ");
        double hours = scanner.nextDouble();

        System.out.print("Enter battery percentage (0-100): ");
        double battery = scanner.nextDouble();

        double power = voltage * current;
        double energy = power * hours;

        System.out.println("\nMONITORING REPORT:");
        System.out.printf("Voltage          : %.2f V%n", voltage);
        System.out.printf("Current          : %.2f A%n", current);
        System.out.printf("Generated Power  : %.2f W%n", power);
        System.out.printf("Generated Energy : %.2f Wh%n", energy);
        System.out.printf("Battery Level    : %.2f%%%n", battery);

    
        System.out.println("\nSystem Status:");

        if (voltage < 12) {
            System.out.println("WARNING: Voltage is low.");
        } else {
            System.out.println("Voltage status: Normal");
        }

        if (current > 10) {
            System.out.println("WARNING: Current is above the safe limit.");
        } else {
            System.out.println("Current status: Normal");
        }

        if (battery < 20) {
            System.out.println("WARNING: Battery level is low. Consider charging.");
        } else if (battery > 95) {
            System.out.println("Battery status: Almost fully charged.");
        } else {
            System.out.println("Battery status: Normal");
        }

        if (power <= 0) {
            System.out.println("WARNING: No power is being generated.");
        } else if (power < 100) {
            System.out.println("Power status: Low generation.");
        } else {
            System.out.println("Power status: Good generation.");
        }

        System.out.println("\nThank you for using the monitoring system.");
        scanner.close();
    }
}
