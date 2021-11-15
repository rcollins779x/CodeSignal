package FindEmailDomain;

class FindEmailDomain {
    static void main (String[] args) {
        String address = "very.common@gmail.com";
        System.out.println("domain = " + findEmailDomain(address));
    }
    static String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf("@")+1);
    }

}
