package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        System.out.println("Cinema:");
        System.out.print("  ");
        for (int y = 1; y <= seats; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            for (int z = 1; z <= seats; z++) {
                System.out.print("S ");
            }
            System.out.println();
        }

        System.out.println("Enter a row number:");
        int rowNum = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNum = scanner.nextInt();
        int ticketPrice;
        int total = 0;
        if (seats * rows < 60) {
            ticketPrice = 10;
        } else {
            int divRows = rows / 2;
            int rowsRem = rows % 2;
            //int frontHalf = divRows * seats * 10;
            //int backHalf = (divRows + rowsRem) * seats * 8;
            if (rowNum <= divRows) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }
        System.out.println("Ticket price: $" + ticketPrice);

        System.out.println("Cinema:");

        System.out.print("  ");
        for (int y = 1; y <= seats; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            for (int z = 1; z <= seats; z++) {
                if (i == rowNum && z == seatNum) {
                    System.out.print("B ");
                } else {
                    System.out.print("S ");
                }

            }
            System.out.println();
        }
    }
}