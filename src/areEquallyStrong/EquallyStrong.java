package areEquallyStrong;

class EquallyStrong {
    static void main(String[] args) {
        int yourLeft= 5;
        int yourRight= 5;
        int friendsLeft= 10;
        int friendsRight= 10;
        System.out.println(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight));
    }
    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return (yourLeft + yourRight) == (friendsLeft + friendsRight) && Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight);

    }

}
