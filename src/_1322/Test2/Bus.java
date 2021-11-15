package _1322.Test2;
//Java
class Bus extends Vehicle {
    @Override
    void updateVehicleInfo(String name, boolean isNew) {
        System.out.println("Name: " + name + "\tIs it new? " + isNew);
    }
}