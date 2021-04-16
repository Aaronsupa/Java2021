import java.io.*;
import java.util.*;
public class hours {
    public static void main(String[]args)throws FileNotFoundException{
        File myfile = new File("/Users/aaronj/Java2021/hours.txt");
        Scanner scan = new Scanner(myfile);
        double sum = 0.0; 
        double pay = 0.0;
        int i =0;
        while(scan.hasNextLine()){
            Scanner line = new Scanner(scan.nextLine());
            while(line.hasNext()){
                int id = line.nextInt();
                String names = line.next();
                while(line.hasNextDouble()){
                    sum = sum + line.nextDouble();
                    i++;
                }
                double avg = sum/i;
                System.out.print(names + "(ID#" + id + ")  worked ");
                System.out.printf("%.2f ", sum); 
                System.out.print(" hours" + "(");
                System.out.printf("%.2f ", avg);
                System.out.print(" hours/day)");
                System.out.println();
                sum = 0;

            }


        }
    }
}
    
    
