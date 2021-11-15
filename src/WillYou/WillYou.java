package WillYou;

class WillYou {
    static void main (String[] args) {
        boolean young = true, beautiful = true, loved = true;

        System.out.println(willYou(young,beautiful,loved));

    }
    static boolean willYou(boolean young, boolean beautiful, boolean loved) {
        return (!young || !beautiful) == loved;
    }
}
