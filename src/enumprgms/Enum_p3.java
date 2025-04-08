package enumprgms;

public class Enum_p3 {
    public static void main(String[] args) {
        System.out.println(Colours.RED.gethexcode());
    }
}
enum Colours{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");
    private String hexcode;
    Colours(String hexcode){
        this.hexcode=hexcode;

    }
    String gethexcode(){
        return this.hexcode;
    }
}
