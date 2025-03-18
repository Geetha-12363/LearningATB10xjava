package strings;

public class Task3 {
    public static void main(String[] args) {
        String str="geetha";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf(3));
        System.out.println(str.contains("a"));
        System.out.println(str.matches("ee"));
        System.out.println(str.startsWith("g"));
        System.out.println(str.endsWith("a"));
        System.out.println(str.substring(2,5));
    }
}
