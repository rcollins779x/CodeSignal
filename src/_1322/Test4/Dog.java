package _1322.Test4;

class Dog {
    int age;
    private String gender;
    double weight = 10.0;

    Dog() {
    }

    Dog(int age) {
    }

    Dog(int age, String gender, double weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
