package stringfunctions;

public class Functions {
    public static void main(String[] args) {
        String str="geetha";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.concat("tirumanyam"));
        System.out.println(str.contains("ha"));
        System.out.println(str.equals("geetha"));
        System.out.println(str.equalsIgnoreCase("geetha"));
        System.out.println(str.indexOf("h"));
        System.out.println(str.replace("h","H"));
        String str1="geetha@tirumanyam";
        String[] split=str1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        String str2="javaprogram";
        System.out.println(str2.substring(4,7));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.startsWith("j"));
        System.out.println(str2.endsWith("m"));
        System.out.println(str2.trim());
        System.out.println(str2.compareTo("javaprogram"));
        System.out.println(str2.compareToIgnoreCase("javaprogram"));
        /*if we use index out of range we will get an exception like StringIndexoutofbounds
        Exception*/
    }
}
