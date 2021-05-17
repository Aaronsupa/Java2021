import java.util.*;
public class selfcheck{
    public static void main(String [] args){
       question2a();
        question2b();
        question2c();
        question2d();
        ex1();
        GCD();
        toBinary();
        randomx();
        randomlines();
        makeGuesses();
        diceSum();
        randomWalk();
        hopscotch();
        printAverage();
    }


    public static void question2a(){
int x = 1;
while (x < 100) {
System.out.print(x + " ");
x += 10;
}
int y=1;
while(y <= 5){
    System.out.print(y);
    y++;
}
        }

    public static void question2b(){
int total= 25;
int number=1; 
while (number <= total/2){
    System.out.print(total +" "+ number);
    number++;
    total= total-number;
}
    }
    public static void question2c(){
int i=1;
int j=1;
int k=1;
while(i<=2){
    i++;
    while(j<=3){
        j++;
        while(k<=4){
            k++;
            System.out.print("*");
        }
        System.out.print("!");
    }
    System.out.println();
}
    }
    public static void question2d(){
int num= 4; 
int count =1;
while(count<=num){
    System.out.print(num);
    count++;
    num=num/2;
}
    }
    public static void ex1(){
System.out.println();
    int numbr=18;
    int val = numbr;
    int counts = 0;
    while(val % 2 == 0) {
        counts++;
        val /= 2;
    System.out.print(numbr + " = ");
    for(int L= 0; L < counts; L++)
        System.out.print("2 * ");
    System.out.println(val);
    }
}
    public static void GCD(){
    int a = 10;
    int b = 5;
    while (b!=0){
        int c = a%b;
        a=b;
        b=c;
    System.out.println(Math.abs(a));
    }
}
    public static void toBinary(){
    int test= 100;
    System.out.println(Integer.toBinaryString(test));
    }


    public static void randomx() {
        Random random = new Random();
        int x = random.nextInt(15) + 5;
        
        while (x < 15) {
            for (int line = 0; line < x; line++) {
                System.out.print("x");
            }
            System.out.println();
            x = random.nextInt(15) + 5;
        }
        for (int line = 0; line < x; line++) {
            System.out.print("x");
        }
        System.out.println();
    }

    public static void randomlines(){
        Random lines =  new Random();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        int numberlines = 5 + lines.nextInt(6);
        for(int x = 0; x < numberlines; x++) {
            Random length = new Random();
            int lineLength = 1 + length.nextInt(80);
            
            for(int p = 0; p < lineLength; p++) {
                int k = length.nextInt(26);
                char chars = alp.charAt(k);
                System.out.print(chars);
            }
            System.out.println();
        }
    }

    public static void makeGuesses(){
        int count = 0;
        Random r = new Random();
        int guess;
        
        do {
            guess = 1 + r.nextInt(50);
            count++;
            System.out.println("guess = " + guess);
        } while(guess < 48);
        
        System.out.println("total guesses = " + count);
    }
    public static void diceSum(){
        Scanner keys = new Scanner(System.in);
        int mynum = keys.nextInt();
        System.out.println("Desired Dice sum" + mynum);
        int roll1;
        int roll2; 
        Random ranroll = new Random();
        roll1 = ranroll.nextInt(6)+1;
        roll2 = ranroll.nextInt(6)+1;
        int sum = roll1 + roll2;
        System.out.println(roll1 + "and" + roll2 + "=" + sum);
        while(sum != mynum){
            roll1 = ranroll.nextInt(6)+1;
            roll2 = ranroll.nextInt(6)+1;
            sum = roll1 + roll2;
            System.out.println(roll1 + "and" + roll2 + "=" + sum);
        }
        keys.close();
        }

    public static void randomWalk(){
        int step = 0;
        int back = -3;
        System.out.println("Position:" + step);
        Random walk = new Random();

        while(step != 3 && step != -3){
        step = walk.nextInt(3);
        step++;
        if (step == 0){
            step--;
        }
        System.out.println("position= "+step);
        if(step > back){
            back = step;
        }
    }
    System.out.println("Max position= "+ back);
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
        
        












    

