package snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         String input;

        do {
            System.out.println("Insert a string (Press 0 to ESC): ");
            input =  scan.nextLine();

            if (input.equals("0")) {
                break;
            }

            char[] chars =  input.toCharArray();

            int digitCounter = 0;
            int letterCounter = 0;
            int symbolCounter = 0;

            for (int i = 0; i < chars.length ; i++) {
                char c = chars[i];
                if (Character.isLetter(c)) {
                    letterCounter++;
                } else if (Character.isDigit(c)) {
                    digitCounter++;
                }
                else {
                    symbolCounter++;
                }
            }

            System.out.println("Number of letters: " + letterCounter);
            System.out.println("Number of digits: " + digitCounter);
            System.out.println("Number of symbols: " + symbolCounter);

        } while (!input.equals("0"));

        scan.close();

    }
}
