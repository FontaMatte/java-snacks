package snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {

        int[] numbers = new int[10]; //inizializzo un array vuoto

        Random random = new Random();

        // Genero 10 numeri casuali e riempio l'array
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10);
            numbers[i] = randomNumber;
        }

        // Effettuo la somma dei numeri con indice dispari
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }
}
