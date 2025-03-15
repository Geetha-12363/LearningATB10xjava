package loops_conditions;

public class Switch_Jdk_13concept {
    public static void main(String[] args) {
        int itemcode=001;
        switch(itemcode){
            case 001,002,003:
                System.out.println("all of them are electronic gadgets");
                break;
            case 004,006,007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("none");
        }
    }
}
