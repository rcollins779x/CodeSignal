package _1322.Test1.a;

    //Java
    class Furniture {
        String name;
        double price;
        private boolean isGood;
        Furniture () { isGood = false; } //Default Constructor
        Furniture (String name, double price) {} //OverloadedConstructor
        boolean getIsGood() { return isGood; }
        void setIsGood(boolean isGood) { this.isGood = isGood; }
        boolean isAffordable() { return true; }

        @Override
        public String toString() {
            return "Furniture name: " + name + "\tPrice: $" + price + "\tis Good? " + isGood + "\tIs Affordable? Yes." ;
        }
    }

    class Couch extends Furniture {
        Couch(String name,double price) {
            this.name = name;
            this.price = price;
        }
        boolean isLeather;
        @Override
        boolean isAffordable() { return price <= 1000; }
        @Override
        public String toString() {return "Couch name: " + name + "\tPrice: $" + price + "\tis Good? " + getIsGood() + "\tIs Affordable? Yes.";}
    }

    class Chair extends Furniture {
        Chair(String name,double price) {
            this.name = name;
            this.price = price;
        }
        boolean isRevolving;
        @Override
        boolean isAffordable() { return price <= 100; }
        @Override
        public String toString() {return "Chair name: " + name + "\tPrice: $" + price + "\tis Good? " + getIsGood() + "\tIs Affordable? Yes." ;}
    }

    class Main {
        public static void main(String[] args) {
            Furniture chair = new Couch("Recliner", 100.0);
            Furniture couch = new Chair("Love Couch", 200.0);
            System.out.println("Furniture name: " + couch.name + "\tPrice: $" + couch.price + "\tis Good? "+ couch.getIsGood() +"\tIs Affordible? Yes.");
            System.out.println("Furniture name: " + chair.name + "\tPrice: $" + chair.price + "\tis Good? "+ chair.getIsGood() +"\tIs Affordible? Yes.");
        }
    }

