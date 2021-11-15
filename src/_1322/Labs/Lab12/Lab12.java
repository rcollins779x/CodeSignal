//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab12;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Lab12 {
    public static void main (String[] args) {
        String directory = "src/" + Lab12.class.getPackageName().replaceAll("\\.","/") + "/";
        File file = new File(directory + "HungerGames.txt");
        File output = new File(directory + "output.txt");
        Scanner read = new Scanner(System.in);                               //Read lines from source.txt

        System.out.println("This program gives the number of words, characters and number of lines in a file.");
        System.out.println("Current directory: " + file.getAbsolutePath() + "\\");
        while (!file.canRead()) {                                                    //verify that the file can be read before proceeding further
            System.out.print("\033[0;31mUnable to open " + file + "\n\u001B[0mEnter file1 name: ");
            file = new File(read.nextLine());
        }

        try {
            read = new Scanner(file);                                            //reads line from file
            int words = 0, chars = 0, lines = 0;
            String line, result;
            while (read.hasNextLine()) {                                         //repeat until end of file
                line = read.nextLine();
                lines++;
                if (!line.matches(".*\\S.*")) continue;                     //if line is blank, skip it
                chars += line.replaceAll("\\s", "").length();     //count characters excluding spaces
                line = line.replaceAll("\t", " ").replaceAll("\\s+", " ").trim();    //clean up line
                words += line.split("\\s").length;                          //add all the words
                System.out.println(Arrays.toString(line.split("\\s")) + "\nlines: " + lines + " chars: " + chars + " words: " + words);
            }
            read.close();

            boolean ck = output.delete();
            ck = output.createNewFile();                                          //Creating/Overriding output.txt file
            FileWriter write = new FileWriter("output.txt");              //Opens output.txt for writing
            System.out.print("The " + file + " statistics are saved at: " + output.getAbsolutePath());
            System.out.println(result = "\nTotal lines: " + comma(lines) + "\nTotal words: " + comma(words) + "\nTotal chars: " + comma(chars));

            write.write("The file statistics for file: " + file.getAbsolutePath());
            write.write(result);                                                  //write to output.txt
            write.close();

        } catch (FileNotFoundException error) {
            System.out.println("Unable to access " + output + " file. Verify file is located in the following directory and can be accessed.\n" + output.getAbsolutePath());
        } catch (IOException error) {
            System.out.println("IOException error.");
            error.printStackTrace();
        } catch (Exception error) {
            System.out.println("Unknown Error. Program Exiting.");
            error.printStackTrace();
        }
    }
    private static StringBuilder comma (int num) {
        StringBuilder comma = new StringBuilder();
        String answer = String.valueOf(num);
        for (int i = 0; i < answer.length(); i++)
            comma.append((i > 0 && i % 3 == 0) ? "," : "").append(answer.charAt(answer.length()-i-1));
        return comma.reverse();
    }
}
