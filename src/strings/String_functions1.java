package strings;

public class String_functions1 {
    public static void main(String[] args) {
        String str="sonal";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        //System.out.println(str.charAt(10)); //string index out of range exception
        System.out.println(str.concat("patel"));
        System.out.println(str.contains("sonal"));
        System.out.println(str.equals("sonal"));
        System.out.println(str.equalsIgnoreCase("sonal"));
        System.out.println(str.indexOf("a"));
        String s1="madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.replace("n","N"));
        String name="Sonal Harish";
        String[] split=name.split(" ");
        String name1="geetha@gmail.com";
        String[] split1=name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        String anotherpalindrome="Niagara O roar again!";
        System.out.println(anotherpalindrome.substring(11,15));
        String ss="hamburger";
        System.out.println(ss.substring(4,8));
        System.out.println(ss.toLowerCase());
        System.out.println(ss.startsWith("h"));
        System.out.println(ss.endsWith("r"));
        System.out.println(" ");
        String aa=" sonal patel ";
        System.out.println(aa.trim());
        System.out.println(s1.compareTo("madam"));

    }
}
