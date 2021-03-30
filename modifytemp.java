import java.util.*;
public class modifytemp {
    public static void main(String [] args){
        Scanner key = new Scanner(System.in);
        System.out.println("How many days temps?: ");
        int days = key.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for( int i = 0; i < days; i++){
            System.out.println("Day" + (i+1) + "'s high temp: " );
            temps[i]= key.nextInt();
            sum += temps[i];
        }
        double avg = (double) sum / days; 
        System.out.println();
        System.out.println("Average temp = " + avg);
        int aboveavg = 0;
        for(int i=0; i<temps.length; i++){
            if(temps[i]>avg){
                aboveavg++;
            }
        }
        System.out.println(aboveavg + " Days over avg");
        key.close();
        System.out.println(Arrays.toString(temps));

        Arrays.sort(temps);
        System.out.println("The lowest temps are " + temps[0] + " " + temps[1]);
        System.out.println("The highest temps are " + temps[temps.length-1] + " " + temps[temps.length-2]);



        



        

    }
}
    

