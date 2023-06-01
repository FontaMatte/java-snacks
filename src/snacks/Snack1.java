package snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a number: ");
        int userNumber = scan.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println(userNumber);
        } else {
            System.out.println(userNumber + 1);
        }

        scan.close();
    }
}
