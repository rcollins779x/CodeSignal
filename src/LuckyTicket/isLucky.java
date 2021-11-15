package LuckyTicket;

class isLucky {
    static void main (String[] args) {
        System.out.print(isLucky(132006));
    }
    static boolean isLucky(int ticket) {
        int temp = ticket, counter=0, part1, part2, sum1=0, sum2=0;
        while (temp >0) {
            temp /= 10;
            counter++;
        }
        counter /=2;
        counter = (int) Math.pow(10,counter);
        part1 = ticket/counter;
        part2 = ticket%counter;

        while (part1>0) {
            sum1 += part1%10;
            sum2 += part2%10;
            part1 = (part1 - part1%10)/10;
            part2 = (part2 - part2%10)/10;
        }
        return sum1==sum2;
    }
}
