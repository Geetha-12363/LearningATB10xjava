package loops;

public class Even_Numbers {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i%2==0){
                System.out.println("even number is"+i);
                continue;
            }
            System.out.println("odd number is"+i);
        }
    }
}
