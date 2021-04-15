import java.io.*;
import java.util.*; 
public class weather {
    public static void main(String[]args)throws FileNotFoundException{
        File myfile = new File("/Users/aaronj/Java2021/weather.txt");
        Scanner scan = new Scanner(myfile);
        double one = 0;
        if(scan.hasNextDouble()){
            one = scan.nextDouble(); 
        }
        double two = 0;
        double change;
        while(scan.hasNextLine()){
            Scanner line = new Scanner(scan.nextLine());
            while(line.hasNext()){
            if(line.hasNextDouble()){
                    two = line.nextDouble();                                                                                        
            }else{
                String trash = line.next();
            }
                change = two - one;
                System.out.printf("%.2f \n",change);
                two = one;

            }
            
        } 
        scan.close();
    }

    }

