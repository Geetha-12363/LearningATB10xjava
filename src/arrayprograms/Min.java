package arrayprograms;

public class Min {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int min=a1[0];
        for(int i=0;i<a1.length;i++){
            if(a1[i]<min){
                min=a1[i];
}}
System.out.println(min);
}
}

