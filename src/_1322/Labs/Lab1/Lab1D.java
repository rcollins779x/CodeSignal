//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab1;

class Lab1D {
    public static void main(String[] args) {
        int size = 10, dashes = size/2 - 1, stars = dashes + 1;
        char[][] array = new char[size][size];

        //Stores pattern in the array
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++)
                //Prints max '-' then prints max '*'
                if (column < dashes)
                    array[row][column] = ' ';
                else if (column < stars)
                    array[row][column] = '*';
                else array[row][column] = ' ';

            //Adjusts max '-' and '*' for next row
            dashes += (Math.round((float)row/size)+1)*2-3;
            stars += (Math.round((float)row/size)-1)*-2-1;
            if (dashes < 0) dashes = 0;
            if (stars > size - 1) stars = size - 1;
        }
        //Prints array
        for (int row = 0; row < size; row++)
        {
            for (int column = 0; column < size; column++)
                System.out.print(array[row][column]);
            System.out.println();
        }
    }
}