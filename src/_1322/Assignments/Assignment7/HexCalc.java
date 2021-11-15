package _1322.Assignments.Assignment7;

class HexCalc extends Calculator{
    @Override
    public String add(String a, String b) { return Integer.toHexString(Integer.parseInt(super.add(""+hexToDec(a), ""+hexToDec(b)))); }

    @Override
    public String subtract(String a, String b) { return Integer.toHexString(Integer.parseInt(super.subtract(""+hexToDec(a), ""+hexToDec(b)))); }

    @Override
    public String multiply(String a, String b) { return Integer.toHexString(Integer.parseInt(super.multiply(""+hexToDec(a), ""+hexToDec(b)))); }

    @Override
    public String divide(String a, String b) { return Integer.toHexString(Integer.parseInt(super.divide(""+hexToDec(a), ""+hexToDec(b)))); }

    @Override   //Same method as Rubric's HexDexConv()
    public int hexToDec(String hex) { return super.hexToDec(hex); }
}
