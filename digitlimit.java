import java.util.*;
public class digitlimit{
    public static void main(String [] args) {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a integer up to 50 digits: ");
        int keysint1 = keys.nextInt();
        System.out.println();
        int[] first = new int [keysint1];
        System.out.print("Enter another integer up to 50 digits: ");
        int keysint2 = keys.nextInt();
        int[] second = new int [keysint2];
        int first_total = 0;
        for(int i = 0; i < first.length; i++){
            first_total += first[i];
        }
        int second_total = 0; 
        for(int i = 0; i < second.length; i++){
            second_total += second[i];
        }
        int sum = first_total + second_total;
        System.out.println("Your total is equal to: " + sum);
        

        keys.close();

        






        
    }
}