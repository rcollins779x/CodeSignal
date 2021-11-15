package _1322.Assignments.Assignment7;

// using double instead of float to support larger number calculations
interface CalcOps {
    String add(String a, String b);
    String subtract(String a, String b);
    String multiply(String a, String b);
    String divide(String a, String b);
    int hexToDec(String hex);   //Same method as Rubric's HexDexConv()
}
