package ValidTime;

class ValidTime {
    static void main (String[] args) {
        String time = "23:59";
        System.out.println(validTime(time));
    }
    static boolean validTime(String time) {
        return time.matches("[01]\\d:[0-5]\\d|2[0-3]:[0-5]\\d");
    }

}
