package _1322.Assignments.Assignment1;

class Cypher {
    private String original, encrypted;
    private StringBuilder decrypted = new StringBuilder();

    Cypher()                 //Default Constructor
    {
        original = "cypher";
        cypherMethod();
        reverseMethod();
    }

    Cypher(String cypher)    //Overloaded Constructor
    {
        original = cypher;
        cypherMethod();
        reverseMethod();
    }

    //Getters
    String getOriginal()
    {
        return original;
    }
    String getEncrypted()
    {
        return encrypted;
    }
    StringBuilder getDecrypted()
    {
        return decrypted;
    }
    //Setters
    void setOriginal(String original)
    {
        this.original = original;
    }
    void setEncrypted(String encrypted)
    {
        this.encrypted = encrypted;
    }
    void setDecrypted(StringBuilder decrypted)
    {
        this.decrypted = decrypted;
    }

    void cypherMethod()      //Begin Encryption
    {
        encrypted="";
        int length = original.length();
        StringBuilder odd = new StringBuilder(), even = new StringBuilder();

        if (length % 2 == 1) original += " ";

        //Store odd chars in odd string and even chars in even string
        for (int i = 0; i < length;)
        {
            odd.append(original.charAt(i++));
            even.append(original.charAt(i++));
        }
        encrypted = odd.toString() + even;
    }

    void reverseMethod()     //Begin Decryption
    {
        decrypted.delete(0,decrypted.length());
        int length = encrypted.length() / 2;

        String odd = encrypted.substring(0, length);
        String even = encrypted.substring(length);
        //Combine each letters of odd and even alternatively into a string
        for (int i = 0; i < length; i++)
        {
            decrypted.append(odd.charAt(i));
            decrypted.append(even.charAt(i));
        }
    }
    //toString override
    @Override
    public String toString()
    {
        return "Original  : " + original + "\nEncrypted : " + encrypted + "\nDecrypted : " + decrypted + "\n";
    }
}
