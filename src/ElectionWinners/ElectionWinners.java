package ElectionWinners;

class ElectionWinners {
    static void main (String[] args) {
        int[] votes = {5, 1, 3, 4, 1};
        int k = 0;
        System.out.println(electionsWinners(votes, k));
    }
    static int electionsWinners(int[] votes, int k) {
        int max = Integer.MIN_VALUE, counter = 0, tie = 0;
        for (Integer candidate : votes) max = Math.max(max,candidate);
        for (Integer candidate : votes) {
            if (candidate + k > max) counter++;
            if (candidate == max) tie++;
        }
        if(counter > 0) return counter;
        else if (tie%2 != 0) return tie;
        else return 0;
    }
}
