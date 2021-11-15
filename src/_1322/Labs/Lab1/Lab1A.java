//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab1;

class Lab1A {
    public static void main(String[] args) {

        int maxStars = 10;
        char[][] array = new char[10][10];

        //Stores pattern in the array
        for (int row = 0; row < 10; row++, maxStars--)
            for (int column = 0; column < 10; column++)
                if (column < maxStars)
                    array[row][column] = '*';
                else
                    array[row][column] = '-';

        //Prints array
        for (int row = 0; row < 10; row++)
        {
            for (int column = 0; column < 10; column++)
                System.out.print(array[row][column]);
            System.out.println();
        }
    }
}