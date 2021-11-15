//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment11;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Assignment11 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Scanner scan = new Scanner(System.in);

        System.out.println(file1.getAbsoluteFile() + "\n" + file2.getAbsoluteFile());
        while (!(file1.canRead())) {                                  //verify that file1 can be read before proceeding further
                System.out.print("\033[0;31mUnable to open " + file1 + "\n\u001B[0mEnter file1 name: ");
                file1 = new File(scan.nextLine());
        }
        while (!file2.canRead()) {                                  //verify that file2 can be read before proceeding further
                System.out.print("\033[0;31mUnable to open " + file2 + "\n\u001B[0mEnter file2 name: ");
                file2 = new File(scan.nextLine());
        }
        scan.close();
        compare(file1,file2);                                       //calls compare method
    }
    static void compare (File file1, File file2) {
        try {
            Scanner read1 = new Scanner(file1);
            Scanner read2 = new Scanner(file2);
            int lines = 0, errors = 0;
            while (read1.hasNextLine() && read2.hasNextLine()) {    //Loops until reaching the end of the file
                lines++;
                String buffer1 = read1.nextLine();
                String buffer2 = read2.nextLine();
                if (!buffer1.equals(buffer2)) {                     //If a discrepancy is found, print line from both files
                    int min = Math.min(buffer1.length(), buffer2.length());
                    System.out.print("Line " + lines + "\n< " + buffer1 + "\n  ");
                    for (int i = 0; i < min; i++,errors++) System.out.print((buffer1.charAt(i) == buffer2.charAt(i)) ? " " : "↕");
                    while ((Math.max(buffer1.length(), buffer2.length()) - min++)>0) System.out.print("↕");
                    System.out.println("\n> " + buffer2);
                }
            }                                                       //If files have different total lines, throw error
            if (read1.hasNextLine() || read2.hasNextLine()) throw new NotEnoughDataException("");
            if (errors ==0) System.out.println("No errors found."); //If no errors found, then let the user know.
            read1.close();
            read2.close();
        } catch (FileNotFoundException error) {
            System.out.println("\033[0;31mUnable to read file.");
            error.printStackTrace();
        } catch (NotEnoughDataException error) {
            System.out.println(error.getMessage());
        } catch (Exception error){
            System.out.println("\033[0;31mUnknown Error. Exiting Program.");
            error.getStackTrace();
        }
    }
}