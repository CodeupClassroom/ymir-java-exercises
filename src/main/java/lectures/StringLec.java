package lectures;

public class StringLec {
    public static void main(String[] args) {
        // explain string immutability
        String bigString = "The quick brown fox jumped over the lazy dog.";
        String myName = "bob";
        myName = "Robert";

        // explain string conversion via concat
        // show simple way to convert int to string
        int age = 42;
        String formattedAge = "" + age;

//        myName = null;
//        System.out.println(myName.equals("Robert"));
        System.out.println("Robert".equals(myName));

        // startsWith
            // call methods on a string literal. weird
        System.out.println(myName.startsWith("Rob"));
        System.out.println(myName.startsWith("rob"));
        System.out.println("DocRob".startsWith("D"));

        // endsWith
        System.out.println("DocRob".endsWith("Rob"));

        // charAt
        System.out.println("DocRob".charAt(2));

        // indexOf
            // how to do next index?
            // use it to traverse over multiple matches
        System.out.println("DocRob".indexOf("ro"));

        int index = -1;
        do {
            index = bigString.indexOf(" ", index + 1);
            if(index > -1) {
                System.out.println("Found a space at index " + index);
            }
        } while(index > -1);

        // lastIndexOf
        System.out.println(bigString.lastIndexOf(" "));

        // length
        System.out.println(bigString.length());

        // replace
        String converted = bigString.replace(" ", "|");
//        String converted = bigString.replaceAll(" ", "|");
        System.out.println(converted);

        // substring
        System.out.println(bigString.substring(4, 21));

        // toUpperCase and toLowerCase
        System.out.println(bigString.toUpperCase());

        // trim
        System.out.println(" \\  the quick    ".trim() + "XXXXXX");

    }
}
