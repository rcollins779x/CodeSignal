package _1322.ExtraCredit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class ExtraCredit {
    public static void main(String[] args) throws InterruptedException, IOException {
        String directory = "src/" + (ExtraCredit.class.getPackage().getName()).replaceAll("\\.","/") + "/";
        File file = new File(directory + "Got ya.txt");
        boolean f = file.createNewFile();
        FileWriter write = new FileWriter(file);              //Opens txt for writing
        write.write("The file statistics for file: " + file.getAbsolutePath());

        for (int i = 1; i < 7; i++) {
            int[] line = {78,101,118,101,114,32,103,111,110,110,97,32};
            System.out.print(recurse(line,""));
            write.write(recurse(line,""));

            switch (i) {
                case 1 : line = new int[]{103,2,13,-17,-69,89,-10,6,-85,85,-5}; break;
                case 2 : line = new int[]{108,-7,15,-84,89,-10,6,-85,68,11,8,-9}; break;
                case 3 : line = new int[]{114,3,-7,-78,65,17,-3,6,-7,-10,-68,65,13,-10,-68,68,1,14,-14,13,2,-84,89,-10,6}; break;
                case 4 : line = new int[]{109,-12,10,-6,-69,89,-10,6,-85,67,15,7}; break;
                case 5 : line = new int[]{115,-18,24,-89,71,8,0,-11,-2,23,-20}; break;
                case 6 : line = new int[]{116,-15,7,0,-76,65,-65,76,-3,-4,-69,65,13,-10,-68,72,13,-3,2,-84,89,-10,6}; break;
            }
            char temp;
            for (int chorus = 0,s = 0; s < line.length; s++) {
                temp = (char) (chorus += line[s]);
                System.out.print(temp);
                write.write(temp);
            Thread.sleep(70);
            }
            System.out.println();
            write.write("\n");
        }
        write.close();

    }

    protected static String recurse(int[] line,String z) {
        if(z.length() < line.length) z = recurse(line,z + (char) line[z.length()]);
        return z;
    }
}
