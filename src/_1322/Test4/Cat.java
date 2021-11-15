package _1322.Test4;

class Cat extends Animal {
    private String favoriteFood;

    Cat() {
    }

    Cat(String name, boolean isDomestic, String favoriteFood) {
        //super(name, isDomestic);
        this.favoriteFood = favoriteFood;
    }

    //@Override
    void animalDetail() {
        //System.out.println("name = " + getName());
        //System.out.println("isDomestic = " + getIsDomestic());
        System.out.println("favoriteFood = " + favoriteFood);
    }

    @Override
    boolean ifDomestic() {
        return false;
    }
}
