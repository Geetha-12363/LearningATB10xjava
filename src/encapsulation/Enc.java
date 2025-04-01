package encapsulation;

import java.sql.SQLOutput;

public class Enc {
    public static void main(String[] args) {
        Bank b1=new Bank("jeevan",2000);
        System.out.println(b1.getBal());
        boolean isCashier=true;
        b1.setBal(6000,isCashier);
        System.out.println(b1.getBal());

    }
}

class  Bank{
    String name;
    int bal;

    Bank(String name, int bal){
        this.name=name;
        this.bal=bal;

    }
    public String getName(String name){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public int getBal(){
        return bal;
    }
    public void setBal(int bal,boolean isCashier){
        if(isCashier){
            this.bal=bal;
        }
        else{
            System.out.println("ur not allowed to change");
        }

    }
}