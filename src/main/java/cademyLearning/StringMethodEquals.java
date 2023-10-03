package cademyLearning;

public class StringMethodEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1.equals("Hello")); //true

        System.out.println(s2.equals("Hello")); // false

        System.out.println(s2.equalsIgnoreCase("world")); //true
    }
}
