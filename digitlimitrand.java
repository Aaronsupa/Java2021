import java.util.*;
public class digitlimitrand{
    public static void main(String [] args){
        Random rand = new Random();
        int[] num1 = new int[49];
        int[] num2 = new int[49];
        int randnums = 0; 
        int[] sum = new int[50]; 
        for(int i=0; i<num1.length-1; i++){
            num1[i] = rand.nextInt(9);
            num2[i] = rand.nextInt(9);
            randnums = num1[i] + num2[i] %10;
            sum[i] = randnums%10;
            randnums = randnums%10;
        }
        sum[0] = randnums%10;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(sum));

}
}


