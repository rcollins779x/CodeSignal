package Sandbox;

import java.util.Scanner;
import java.util.Random;

class Main {
    static void main(String[] args) {
        int largest = 0, highest, geno = 0, person = 0;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("How large should the array be? ");
        largest = input.nextInt();
        System.out.print("What should be the highest number in the sequence? ");
        highest = input.nextInt();

        int[] original = new int[largest];
        int[] array = new int[largest];

        for (int i = 0; i < largest; i++) {
            array[i] = original[i] = rand.nextInt(highest);
            System.out.print(original[i] + ", ");
        }
        do {
            System.out.println("\n[Options]\n1) Reset the array\n2) Sort (Smallest to Largest)\n3) (Sort (Largest to Smallest)\n4) Quit");
            System.out.print("Choice? ");
            person = input.nextInt();
            switch (person) {
                case 1:
                    for(int i = 0; i < array.length; i++) {
                        array[i] = original[i];
                    }
                    break;
                case 2:
                    for (int x = 0; x < array.length; x++) {
                        int key = array[x];
                        int position = x;
                        while (position > 0 && key < array[position - 1]) {
                            int temp = array[position];
                            array[position] = array[position - 1];
                            array[position - 1] = temp;
                            position--;
                        }
                        array[position] = key;
                        System.out.print(array[x] + ", ");
                    }
                    break;
                case 3:
                    break;
            }


        } while (person != 4);
    }
}