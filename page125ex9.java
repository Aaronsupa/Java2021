public class page125ex9{
    public static void main(String[]args){
toppline();
System.out.println("");
pattern();
System.out.println("");
numbers();
System.out.println("");
toppline();

    }
public static void toppline(){
    for(int x=0; x< 40; x++){
        System.out.print("-");
    }
}
public static void pattern(){
    for(int x=0; x<10; x++){
        System.out.print("_-^-");

    }
}
public static void numbers(){
        for(int y= 1; y<=20; y++){
            System.out.print(y%10);
            System.out.print(y%10);
        }
    }
}





