package snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("insert a number: ");
        String stringNumber = scan.nextLine();

        int intNumber = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            char c = stringNumber.charAt(i);
            int digit = c - '0';
            intNumber = intNumber * 10 + digit;
        }

        System.out.println("Converted integer: " + intNumber);


    }
}
