package AddBorder;

import java.util.Arrays;

class PictureFrame {
    static void main (String[] args) {
        String[] a = {"abc",
                      "ded"};
        System.out.println(Arrays.toString(addBorder(a)));
    }
    static String[] addBorder(String[] picture) {
        String[] frame = new String[picture.length+2];

        int max = Integer.MIN_VALUE;
        for (String s : picture) if (max < s.length()) max = s.length();
        System.out.println(max);
        Arrays.fill(frame, "");
        for (int i = 0;i <= max+1; i++) {
            frame[0] = frame[frame.length-1] += "*";
        }
        for (int i = 0;i < picture.length; i++) {
            frame[i+1] = "*"+picture[i]+"*";
        }

        return frame;
    }

}
