package SumUpNumbers;

class SumUpNumbers {
    static void main(String[] args) {
        String inputString = "there are some () digits  in this  string ";
        System.out.println(sumUpNumbers(inputString));
    }
    static int sumUpNumbers(String inputString) {
        String[] temp = (inputString + " 0").replaceAll("\\D+", " ").trim().split(" ");
        int sum = 0;
        for (String num : temp) sum += Integer.parseInt(num);
        return sum;
    }
}
