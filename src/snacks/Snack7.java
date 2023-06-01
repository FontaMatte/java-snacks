package snacks;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert seconds: ");
        int secondsInput = scan.nextInt();

        int seconds = secondsInput % 60;
        int minutes = (secondsInput % 3600) / 60;
        int hours = (secondsInput % 86400) / 3600;
        int days = secondsInput / 86400;

        System.out.println("seconds: " + seconds);
        System.out.println("minutes:" + minutes);
        System.out.println("hours:" + hours);
        System.out.println("days:" + days);

        String formattedString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Formatted Time: " + formattedString);

        scan.close();
    }
}
