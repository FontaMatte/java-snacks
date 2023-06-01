package snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        String[] names = {"maria", "giovanni", "paolo", "luca", "giacomo", "sara", "stefania"};
        String[] surnames = {"rossi", "bianchi", "neri", "ferrari", "esposito", "verdi", "rosa"};

        Random random = new Random();

        System.out.println("FAKE LIST");

        for (int i = 0; i < 10; i++) {
            int randomNumberName = random.nextInt(names.length);
            String name = names[randomNumberName];
//            System.out.println(name);

            int randomNumberSurname = random.nextInt(surnames.length);
            String surname = surnames[randomNumberSurname];
//            System.out.println(surname);

            System.out.println(name +" "+ surname);
        }
    }
}
