package GrowingPlant;

class GrowingPlant {
    static void main (String[] args) {
        int upSpeed = 10, downSpeed = 9, desireHeight = 4;
        System.out.println(growingPlant(upSpeed,downSpeed,desireHeight));
    }
    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int day = 0, height = 0;
        if(height+downSpeed >= desiredHeight) day++;
        while (height+downSpeed < desiredHeight) {
            day++;
            height += upSpeed - downSpeed;
        }
        return day;
    }
}
