import java.util.Scanner;

public class CournierAgency {
    private String location[];
    private float weight[];
    Scanner sc = new Scanner(System.in);

    public void readDetails() {
        location = new String[5];
        weight = new float[5];
        System.out.println("Enter 5 courier parcel weights:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " courier weight in kgs:");
            weight[i] = sc.nextFloat();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " courier location(local/non-local): ");
            location[i] = sc.next();
        }
    }

    public void displayDetails() {
        String x = "local";
        String y = "non-local";
        int rupees = 80;
        double total_price;
        int stamps = 2 * rupees;
        int charges_local = 20 * rupees;
        int charges_nonlocal = 40 * rupees;
        for (int i = 0; i < location.length; i++) {
            if (location[i].equals(x)) {
                total_price = weight[i] * stamps + charges_local;
                System.out.println("The total price of parcel " + (i + 1) + " is " + total_price);
            } else if (location[i].equals(y)) {
                total_price = weight[i] * stamps + charges_nonlocal;
                System.out.println("The total price of parcel " + (i + 1) + " is " + total_price);
            }
        }
    }

    public static void main(String[] args) {
        CournierAgency ca = new CournierAgency();
        ca.readDetails();
        ca.displayDetails();
    }
}

