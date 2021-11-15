package _1322.Test4;

class Domestic extends Animal {
    Domestic() {
        name = "null";
        isDomestic = false;
    }
    Domestic(String name, boolean isDomestic) {
        this.name = name;
        this.isDomestic = isDomestic;
    }

    @Override
    boolean ifDomestic() {
        return false;
    }
}
