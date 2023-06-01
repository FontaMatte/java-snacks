package snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a word: ");
        String word = scan.nextLine();

        StringBuilder strb = new StringBuilder(word);
        String reverseWord = strb.reverse().toString();

        if (word.equals(reverseWord)) {
            System.out.println("The word is Palindroma");
        }
        else {
            System.out.println("The word is not Palindroma");
        }

        scan.close();

    }
}
