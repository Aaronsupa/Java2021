import java.util.*;
public class collegeapquestion{
    public static void main(String [] args){
        Scanner keys = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name1 = keys.next();
        System.out.println("What is your gpa? ");
        double gpa1 = keys.nextDouble();
        System.out.println("What is your sat score? ");
        int sat1 = keys.nextInt();
        System.out.println("What is your act score? ");
        int act1 = keys.nextInt();
        System.out.println("name = " +name1 + " gpa = " + gpa1 + " sat = "+ sat1 + " act = " +  act1);
        System.out.println();
        System.out.println("What is your name? ");
        String name2 = keys.next();
        System.out.println("What is your gpa? ");
        double gpa2 = keys.nextDouble();
        System.out.println("What is your sat score? ");
        int sat2 = keys.nextInt();
        System.out.println("What is your act score? ");
        int act2 = keys.nextInt();
        System.out.println("name = " +name2 + " gpa = " + gpa2 + " sat = "+ sat2 + " act = " +  act2);
        System.out.println();

        if(gpa1 > gpa2 && sat1>sat2 && act1>act2){
            System.out.println(name1 + " is more qualified");
        }
            else if(gpa1 < gpa2 && sat1 > sat2 && act1 > act2){
                System.out.println(name1 + " is more qualified");
            }
            else if(gpa1 > gpa2 && sat1 > sat2 && act1 < act2){
                System.out.println(name1 + " is more qualified");
            }
            else if(gpa1 > gpa2 && sat1 < sat2 && act1 > act2){
                System.out.println(name1 + " is more qualified");
            }
            else if(gpa2 > gpa1 && sat1 < sat2 && act1 < act2){
                System.out.println(name2  + " is more qualified");
            }
            else if(gpa2 < gpa1 && sat1 < sat2 && act1 < act2){
                System.out.println(name2 + " is more qualified");
            }
            else if(gpa2 > gpa1 && sat1 < sat2 && act1 > act2){
                System.out.println(name2 + " is more qualified");
            }
            else if(gpa2 > gpa1 && sat1 > sat2 && act1 < act2){
                System.out.println(name2 + " is more qualified");
            }
            else{
                System.out.println(name1+ " and "+ name2+ " are equally qualified");
            }
    
        keys.close();
    }
    
}
