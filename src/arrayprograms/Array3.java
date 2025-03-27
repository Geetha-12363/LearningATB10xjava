package arrayprograms;

public class Array3 {
    public static void main(String[] args) {
        String[] name={"pramod","amit","lucky"};
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        String[] name_atb10x=new String[3];
        name_atb10x[0]="adithi";
        name_atb10x[1]="jathin";
        name_atb10x[2]="nikitha";
        System.out.println(name_atb10x[0]);
        System.out.println(name_atb10x[1]);
        System.out.println(name_atb10x[2]);
        System.out.println(name_atb10x.length);

        boolean[] is_male_data=new boolean[2];
        is_male_data[0]=false;
        is_male_data[1]=true;
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);


    }
}
