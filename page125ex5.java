public class page125ex5{
    public static void main(String[]args){
    for(int line=1; line<=5;line++){
        for(int space=0; space<-line+1; space++){
            System.out.print(" ");
        }
        for(int num=0; num<line; num++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}