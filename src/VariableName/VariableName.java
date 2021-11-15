package VariableName;

class VariableName {
    static void main (String[] args) {
        String name = "variable0";
        System.out.println(variableName(name));
    }
    static boolean variableName(String name) {
    return name.matches("^[^0-9\\s][a-zA-Z0-9_]*$");
    }
}
