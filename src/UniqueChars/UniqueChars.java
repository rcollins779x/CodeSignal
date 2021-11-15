package UniqueChars;

class UniqueChars {
    static String uniqueLetters(String s1) {
        StringBuilder temp = new StringBuilder();
        temp.append(s1.charAt(0));
        for (int i = 0; i < s1.length(); i++) {
            boolean dupe = false;
            for (int j = i; j < s1.length(); j++) {
                boolean check = s1.charAt(i) == s1.charAt(j);
                //System.out.println("i = " + i + "\tj = " + j + " " + s1.charAt(i) + "\t= " + s1.charAt(j) + " " +
                // check);
                if(check) {
                    for (int k = 0; k < temp.length(); k++)
                        if (dupe = (s1.charAt(i) == temp.charAt(k))) break;
                    if (dupe) break; else temp.append(s1.charAt(i));
                }
            }
        }
        return String.valueOf(temp);
    }
}
