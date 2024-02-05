package com.tnsif.asg2;

import java.util.Scanner;

class BookingAutomation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        BookingProcessor bookingProcessor = new BookingProcessor();
        String result = bookingProcessor.processBooking(input);

        System.out.println(result);
    }
}

class BookingProcessor {
    public String processBooking(String input) {
        String[] details = input.split(":");
        
        String customerName = details[0];
        int numberOfAdults = Integer.parseInt(details[1]);
        int numberOfChildren = Integer.parseInt(details[2]);
        int numberOfDays = Integer.parseInt(details[3]);

        if (numberOfAdults < 0) {
            return "Invalid input for number of adults";
        }

        if (numberOfChildren < 0) {
            return "Invalid input for number of children";
        }

        if (numberOfDays <= 0) {
            return "Invalid input for number of days";
        }

        int totalCost = calculateTotalCost(numberOfAdults, numberOfChildren, numberOfDays);
        return customerName + " your booking is confirmed and the total cost is " + totalCost;
    }

    private int calculateTotalCost(int numberOfAdults, int numberOfChildren, int numberOfDays) {
        int adultPrice = 1000;
        int childPrice = 650;

        int totalAdultCost = numberOfAdults * adultPrice;
        int totalChildCost = numberOfChildren * childPrice;

        return (totalAdultCost + totalChildCost) * numberOfDays;
    }
}
