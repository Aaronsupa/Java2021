import java.util.*;
import java.io.*;
public class testfile {
    public static void main(String [] args)throws FileNotFoundException{
        File myfile = new File("/Users/aaronj/Java2021/test.txt");
        Scanner scan = new Scanner(myfile);
        while(scan.hasNextLine()){
            Scanner line = new Scanner(scan.nextLine());
            while(line.hasNext()){
                     if(line.hasNextDouble()){
                         String trash = line.next();
            }
            else{
                System.out.print(line.next() + " ");
            }

        }

    }
    
}
}