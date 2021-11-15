package MakeArrayConsecutive2;


import java.util.Arrays;

class MakeArrayConsecutive2 {
    static void sort(int[] statues) {
        for(int i = 1, temp; i < statues.length; i++)
            if (statues[i - 1] > statues[i]) {
                temp = statues[i];
                statues[i] = statues[i - 1];
                statues[i - 1] = temp;
                i = 0;
            }
    }

    static void main(String[] args) {
        int[] statues = {6,2,3,8};
        sort(statues);
        System.out.println(Arrays.toString(statues));
        int j = 0;
        for(int i = 1; i < statues.length; i++) {
            int temp = statues[i - 1];
            while (statues[i] - temp > 1) {
                j++;
                ++temp;
            }
        }
        System.out.println(j);
    }
}
