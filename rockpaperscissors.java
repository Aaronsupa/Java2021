import java.util.*;
public class rockpaperscissors{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        String Answer = "";
        int num=0;
        do{
        System.out.println("Chose your item: Rock, paper, or Scissors!");
        String hand = key.nextLine();
        if(hand.equalsIgnoreCase("rock")){
            num=1;
        }
        else if(hand.equalsIgnoreCase("paper")){
             num=2;
        }
        else if(hand.equalsIgnoreCase("scissors")){
            num=3;
        }
        int compchoice;

        Random computer = new Random();
        compchoice = computer.nextInt(3)+1;
        if(compchoice ==1 ){
            System.out.println("Computer chose rock!");
        }
        if(compchoice ==2){
            System.out.println("Computer chose paper!");
        }
        if(compchoice ==3){
            System.out.println("Computer chose scissors!");
        }
        if(compchoice==num){
            System.out.println("tie!");
        }
        else if(compchoice ==2 && num==1){
            System.out.println("you lose!");
        }
        else if(compchoice ==1 && num ==3){
            System.out.println("you lose!");
        }
        else if(compchoice ==3 && num ==3){
            System.out.println("you lose!");
        }
        else{
            System.out.println("you win!");
        }
        System.out.println("Do you want to play agian? y or n");
        Answer = key.nextLine();
    }
    while(Answer.contains("y"));
        key.close();
    }
}
