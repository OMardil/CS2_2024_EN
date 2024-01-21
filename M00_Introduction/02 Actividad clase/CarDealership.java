package car;

import java.util.Scanner;

public class CarDealership {
	
	public static final double CAR_PRICE_BASIC = 100000;
	public static final double CAR_PRICE_EQUIPPED = 130000;

    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car type (basic/equipped): ");
        String carType = scanner.nextLine();

        System.out.print("Enter the payment method (cash/finance): ");
        String paymentMethod = scanner.nextLine();
        
        double carPrice = 0;        
        double totalPayment = 0;
        
        if (paymentMethod.equalsIgnoreCase("cash") && carType.equalsIgnoreCase("basic")) {
        	carPrice = CAR_PRICE_BASIC;
        	totalPayment = carPrice * 0.90;
        } else if (paymentMethod.equalsIgnoreCase("cash") && carType.equalsIgnoreCase("equipped")) {
        	carPrice = CAR_PRICE_EQUIPPED;
        	totalPayment = carPrice * 0.90;        	
        } else if (paymentMethod.equalsIgnoreCase("finance") && carType.equalsIgnoreCase("basic")) {
        	carPrice = CAR_PRICE_BASIC;
        	totalPayment = carPrice * 1.25;        	
        } else if (paymentMethod.equalsIgnoreCase("finance") && carType.equalsIgnoreCase("equipped")) {
        	carPrice = CAR_PRICE_EQUIPPED;
        	totalPayment = carPrice * 1.25;        	
        }
        
        System.out.println("Total Payment: $" + totalPayment);

        if (paymentMethod.equalsIgnoreCase("finance")) {
            double monthlyPayment = totalPayment / 48;
            System.out.println("Monthly Payment (48 months): $" + monthlyPayment);
        }

        scanner.close();
    }

}
