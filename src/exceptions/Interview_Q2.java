package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Interview_Q2 {
    public static void main(String[] args) {
        try {
            FileReader f= new FileReader(new File("c://abc.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
