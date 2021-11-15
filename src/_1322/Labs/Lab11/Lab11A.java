//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab11;

class Lab11A {
    public static void main (String[] args) {
        int[] array = {5, 7, 11, 3, 0};
        for (int i = 0; i <= array.length;i++)                                                      //Loop through array
            try { System.out.println(array[i]); }                                                   //Try to print the value of each index
                catch (Exception e) { System.out.print("You went out of limits in the array"); }    //If Error
    }
}
