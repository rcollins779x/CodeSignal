package _1322.Test4;

class Car {
    private String vin;
    static String make;
    String model;
    private int mileage;
    String getVin() { return vin; }
    void setVin(String carID) { this.vin = carID;}
    int getMileage() { return mileage;}
    void setMileage(int m) {this.mileage = m;}
    static void carDetail() {
        System.out.println("yey");/*… */}
}
//class CarMain {
//    public static void main(String[] args) {
//        Car c1 = new Car();
//        /* A) */ Car.model = "CRV";
//        /* B) */ c1.setVin("2020S91010");
//        /* C) */ c1.setModel();
//        /* D) */ Car.carDetail();
//        /* E) */ c1.make = "Mustang";
//        /* F) */ Car.make = "Mustang";
//        /* G) */ Car.setVin();
//        /* H) */ c1.getVin();
//        /* I) */ c1.getMileage();
//        /* J) */ c1.vin = "20348PS";
//        /* K) */ Car.vin = "20348PS";
//        /* L) */ carDetail();
//    }
//}