package enumprgms;

public class enum_p2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")){
            System.out.println("i want to do something");
        }
    }

}
enum URLS{
    google,restassured,katalon,vwo;
}
