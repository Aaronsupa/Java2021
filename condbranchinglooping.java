import java.util.*;
public class condbranchinglooping {
    public static void main(String[]args){
        String input = "example";
        swapPairs(input);
        System.out.println(quadrant(4.4,5.5));
        hopscotch();
        printAverage();
    }
    public static void swapPairs(String input){
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length - 2; i+=2) {
            char change = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = change;
        }
        System.out.println(chars);
    }

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        }if (x < 0 && y > 0) {
            return 2;
        }if (x < 0 && y < 0) {
            return 3;
        }if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    public static void hopscotch(){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many hops?");
        int hops = scan.nextInt();
        int start = 1;
        for( int x = 0; hops > x; x++){
        System.out.println("   " +start+"   ");
        int out = start+1;
        int out2 = start+2;
        System.out.print(out + "     " +out2);
        start = out2 + 1;
        System.out.println();
        System.out.println("   "+start+"   ");
        int outs = start +1;
        int outs2 = start+2;
        System.out.println(outs + "     "+outs2);
        start = outs2+1;
    }
    scan.close();
}
    public static void printAverage(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = scan.nextInt();
        int sum = 0;
        int count = 0;
        while(num > 0){
            System.out.println(num);
            sum = sum + num;
            count = count +1;
            System.out.print("Type a number: ");
            num = scan.nextInt();
            if(num < 0){
            double avg = sum/count;
            System.out.println(avg);
            }
        }
        scan.close();
}
}

