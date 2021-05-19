import java.util.*;
public class mastermind {
    private static int both = 0;
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        int master = (int)(Math.random()*9000)+1000;
        System.out.println(master);
        int mas = master;
        int yip;
        int[] guess = new int[4];
        int[] get = new int[4];
        for(int z = 3; z >= 0 ; z--){
            yip = mas % 10;
            get[z] = yip;
            mas /= 10;
        }
        System.out.println(Arrays.toString(get));
        Arrays.fill(guess, 0);
        System.out.println(Arrays.toString(guess));
        while(both < 4){
            for(int x = 0; x < 4; x++){
                System.out.print("You've Guessed " + (x+1) + " ");
                guess[x] = inp.nextInt();
                }
            System.out.println(Arrays.toString(guess));
            Check(guess, get, master);
        }
        
    }
    public static void Check(int[] guesses, int[] get, int master){
        int correctnum = 0;
        for (int x= 0; x < 4; x++) {
            for(int i = 0; i < 4; i++){
                if(guesses[x] == get[x]){
                    correctnum += 1;
                }
            }
            if(guesses[x] == get[x]){
                    both += 1;
                }
    }
    System.out.println(correctnum + " of the numbers are correct.");
    System.out.println(both + " of the correct numbers are in the right spot.");
   if(both == 4){
        System.out.println("Correct... The answer was " + master);
     }else{
         both = 0;
}
}
}