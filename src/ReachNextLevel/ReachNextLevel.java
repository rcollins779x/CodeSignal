package ReachNextLevel;

class ReachNextLevel {
    static void main(String[] args) {
        int experience = 10, threshold = 15, reward = 5;
        System.out.println(reachNextLevel(experience,threshold,reward));
    }
    static boolean reachNextLevel(int experience, int threshold, int reward) {
        return threshold <= experience + reward;
    }
}
