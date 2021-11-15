package _1322.Assignments.Assignment7;

class Calculator implements CalcOps {
    @Override
    public String add(String a, String b) { return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)); }

    @Override
    public String subtract(String a, String b) { return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b)); }

    @Override
    public String multiply(String a, String b) { return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b)); }

    @Override
    public String divide(String a, String b) { return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b)); }

    @Override   //Same method as Rubric's HexDexConv()
    public int hexToDec(String hex) { return Integer.parseInt(hex,16); }
}
