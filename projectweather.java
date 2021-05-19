import java.io.*;
import java.util.*;
public class projectweather{
    private static final String ANSI_BOLD = "\u001b[1m"; //makes text bold  
    private static final String ANSI_RESET = "\033[0m"; //resets the bold text so that all the output isn't bold
    public static String[] date = new String[31]; //declaring my constants
    public static String[] weekday = new String[31];
    public static String[] high = new String[31];
    public static String[] low = new String[31];
    public static int[] highint = new int[31];
    public static int[] lowint = new int[31];
    public static String[] sunrise = new String[31];
    public static String[] sunrisetime = new String[31];
    public static String[] sunset = new String[31];
    public static String[] sunsettime = new String[31];
    public static void main(String[]args) throws FileNotFoundException{ //Main 
        File myFile = new File("/Users/aaronj/Java2021/java project/projectweather.txt");
        Scanner scan = new Scanner(myFile); // Reading my file of weather data
        int i =0;
        while(scan.hasNextLine()){ //While the file has a next line... these arrays are equal to certain parts of the data
            Scanner line = new Scanner(scan.nextLine());
                date[i] = line.next();
                weekday[i] = line.next();
                high[i] = line.next();
                highint[i] = line.nextInt();
                low[i] = line.next();
                lowint[i] = line.nextInt();
                sunrise[i] = line.next();
                sunrisetime[i] = line.next() + line.next();
                sunset[i] = line.next();
                sunsettime[i] = line.next() + line.next();
                i++; //Allows for the arrays to collect all the data
        }
        outline(); //calls for the other methods 
        userinterface();
    }
        public static void outline(){ //The outline is where the data is projected for the user. Since for a lot of the data there are varying lengths, I had to make exceptions for how far away the lines would be
            System.out.println(ANSI_BOLD + "Here is the data for this month" + ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_BOLD + "   Date      Weekday      High     Low       Sunrise          Sunset" + ANSI_RESET);
            for(int strline = 0; strline < 75; strline++){
                System.out.print(ANSI_BOLD + "_" + ANSI_RESET);
            }
            System.out.println();
            for(int z = 0; z < 31; z+=1){
                System.out.print(ANSI_BOLD + "|"+ date[z] + ANSI_BOLD);
            if(z < 9){
                System.out.print("  |");
            }
            else{
                System.out.print(" |");
            }
            System.out.print(ANSI_BOLD + weekday[z] + ANSI_RESET);
            if(z == 0 || z ==4 || z ==6 || z ==7 || z ==11|| z == 13 || z ==14 || z ==18 ||z ==20 || z ==21 || z ==27 || z==28|| z ==25 ){
                System.out.print("    |");
            }
            else if(z==1 || z ==8 || z ==15 || z ==22 || z ==29){
                System.out.print("   |");
            }
            else if(z==2 || z==9 || z ==16 ||z ==23 || z ==30){
                System.out.print(" |");
            }
            else if(z==3 || z==5 || z==10 || z==12 || z==17 || z ==19 || z ==24 || z ==25 || z ==26){
                System.out.print("  |");
            }
            System.out.print(ANSI_BOLD + high[z] + " " + highint[z] + ANSI_RESET);
            if(z != 17){
                System.out.print(" |");
            }
            else{
            System.out.print("  |");
            }
            System.out.print(ANSI_BOLD + low[z] + " " + lowint[z]+ ANSI_RESET);
            if(z == 16 || z==18 || z==19 || z==20){
                System.out.print("  |");
            }
            else{
                System.out.print(" |");
            }
            System.out.print(ANSI_BOLD + sunrise[z] + " " + sunrisetime[z] + " |" + ANSI_RESET);
            System.out.println(ANSI_BOLD + sunset[z] + " " +  sunsettime[z] + " |" + ANSI_RESET);
            }
        }
        private static int lowweather(int getlow){ //This method allows for sorting the lowint array without permanatly changing it which I had problems with (assessor method too)
            Arrays.sort(lowint);
            int lowweather = lowint[0];
            return lowweather;
        }
        private static int highweather(int gethigh){ //This method does the same but with highint and getting the High for the Month
            Arrays.sort(highint);
            int highweather = highint[highint.length-1];
            return highweather;
        }
        public static void userinterface(){ //This method is where questions are asked by the user and responces are given based on their input.
            String[] myreturn = new String[9]; //myreturn is what will be returned at the very end of the code
            Scanner input = new Scanner(System.in);
            int sumhigh = 0;
            int sumlow = 0; 
            for(int q = 0; q < highint.length; q++){
                sumhigh += highint[q];
            }
            for(int lsum = 0; lsum<lowint.length; lsum++){
                sumlow += lowint[lsum];
            }
            sumlow = sumlow/lowint.length;
            sumhigh = sumhigh/highint.length;
            String highest = Integer.toString(sumhigh);
            String next = " ";
            System.out.println();
            try{ // try this but when a incorrect input is entered, catch it 
            do{ // do while loop (this is for the client)
            System.out.println("Welcome to the Weather for January 2021!");
            System.out.println("We have the High temperatures, low temperatures, sunrise and sunset times for everyday this month!");
            System.out.println("Would you like to know the average high for this month? (yes or no)");
            String user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println(sumhigh);
                myreturn[0] = "Average High = " + highest; // this puts their response into the final output for the code
            }
            if(user.equalsIgnoreCase("no")){
                myreturn[0] = "You did not want the average high";
            }
            System.out.println("Would you like to know the high for a specific day?(yes or no)");
            user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println("For what day? NOTE: You only need to put the day value; for example January first would just be 1");
                int answer = input.nextInt();
                System.out.println(high[answer] + " " + highint[answer-1]); //I have to subtract by one arrays start at 0 not 1 so everything is one later than it should be
                myreturn[1] = "For January " + answer + " the high is = " + highint[answer-1];
                System.out.println("Would you like to know the highest high for this month?(yes or no)");
            }
            else if(user.equalsIgnoreCase("no")){
                System.out.println("Would you like to know the Highest High?(yes or no)");
                myreturn[1] = "You did not want the high for a specific day";
            }
            user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println(highweather(date.length)); //Gives highweather method the dates and returns the high 
                myreturn[2] = "The high of the month = " + highweather(date.length); 
            }
            else if(user.equalsIgnoreCase("no")){
                myreturn[2] = "You did not want the Highest high";
            }
            System.out.println("Would you like the average low?(yes or no)");
            user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println(sumlow);
                myreturn[3] = "The average low is " + sumlow;
            }
            else if(user.equalsIgnoreCase("no")){
                myreturn[3] = "You did not want the average low";
            }
            System.out.println("Would you like the low for a specific day?(yes or no)");
            user  = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println("For what day?");
                int answer = input.nextInt();
                System.out.println(low[answer] + " " + lowint[answer-1]);
                myreturn[4] = "For January " + answer + " the low is = " + lowint[answer-1];
            }
            else if(user.equalsIgnoreCase("no")){
                System.out.println("Would you like to know more weather information?(yes or no)");
                myreturn[4] = "You did not want the low for a specific day";
                user = input.next();
                if(user.equalsIgnoreCase("yes")){
                    System.out.println("Would you like to the lowest low?(yes or no)");
                }
                if(user.equalsIgnoreCase("no")){
                    break; //If they don't want any more information then the code "Breaks" and exits program
                }
                user = input.next();
                if(user.equalsIgnoreCase("yes")){
                    System.out.println(lowweather(date.length)); //calls for the lowweather method to return the low for the dates
                    myreturn[5] = "The lowest low for the month is " + lowweather(date.length) ;
                }
                else if(user.equalsIgnoreCase("no")){
                    myreturn[5] = "you did not want the lowest low";
                }
            }
            System.out.println("Would you like the sunrise time for a specific day?(yes or no)");
            user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println("For what day?");
                int answer = input.nextInt();
                System.out.println(sunrise[answer] + " " + sunrisetime[answer-1]);
                myreturn[6] = "The Sunrise for January " + answer + " is " + sunrisetime[answer-1];
                System.out.println("Would you like the sunset time for a specific day?(yes or no)");
            }
            else if(user.equalsIgnoreCase("no")){
                System.out.println("Would you like to know more weather information?(yes or no)");
                myreturn[6] = "you did not want the sunrise times";
                user = input.next();
                if(user.equalsIgnoreCase("no")){
                    break; 
                }
                if(user.equalsIgnoreCase("yes")){
                    System.out.println("Would you like to the sunset time for a specific day?(yes or no)");
                    }
                }
            user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.println("For what day?");
                int answer = input.nextInt();
                System.out.println(sunset[answer] + " " + sunsettime[answer-1]);
                myreturn[7] = "The sunset time for January " + answer + " is " + sunsettime[answer-1];

            }
            else if(user.equalsIgnoreCase("no")){
                myreturn[7] = "you did not want the sunset times"; 
            }
            System.out.println("Would you like to compare two days?(yes or no)");
            user = input.next();
            if(user.equalsIgnoreCase("yes")){
                System.out.print("Day 1 = ");
                int answer = input.nextInt();
                System.out.print("What's the other day? Day 2 = ");
                int answer2 = input.nextInt();
                String aday = date[answer-1];
                String aday2 = date[answer2-1];
                weathercomparision comp = new weathercomparision(aday, aday2); //Calls for the weathercomparision object class
                System.out.println(comp.toString()); 
                System.out.println("Gathering data...");
                System.out.println();
                String[] day1 = {aday + " : high " + highint[answer-1] + " : low " + lowint[answer-1] + " : " + "sunrise " + sunrisetime[answer-1] + " : " + "sunset " + sunsettime[answer-1]}; //Makes an Array for the return data we want
                String[] day2 = {aday2 + " : high " + highint[answer2-1] + " : low " + lowint[answer2-1] + " : " + "sunrise " + sunrisetime[answer2-1] + " : " + "sunset " + sunsettime[answer2-1]};
                System.out.println(Arrays.toString(day1)); //prints the Array we just made 
                System.out.println(Arrays.toString(day2));
                if(highint[answer-1] > highint[answer2-1]){ //Gives us information about the two days we are comparing... whether it is higher, lower, or the same
                    System.out.println(aday + " has a higher high than " + aday2);
                }
                else if(highint[answer-1] < highint[answer2-1]){
                    System.out.println(aday2 + " has a higher high than " + aday);
                }
                else{
                    System.out.println("These days have equal highs");
                }
                if(lowint[answer-1] < lowint[answer2-1]){
                    System.out.println(aday + " has a lower low than " + aday2);
                }
                else if(lowint[answer-1] > lowint[answer2-1]){
                    System.out.println(aday2 + " has a lower low than " + aday);
                }
                else{
                    System.out.println("These days have equal lows");
                }
                System.out.println("The sunrise for " + aday + " is " + sunrisetime[answer-1] + " in comparision to " + sunrisetime[answer2-1] + " for " + aday2);
                System.out.println("The sunrise for " + aday + " is " + sunsettime[answer-1] + " in comparision to " + sunsettime[answer2-1] + " for " + aday);
                myreturn[8] = "The data for the two dates you wanted are:\n" + Arrays.toString(day1) + "\n" + Arrays.toString(day2); //Puts the two dates into the end output
            }
            else if(user.equalsIgnoreCase("no")){
                myreturn[8] = "You did not want to compare two days";
            }
            System.out.println("Would you to start over? (yes or no)");
            next = input.next();
        }
            while(next.contains("yes"));
            while(next == "no"); //if they are done they get a recipt for the questions they asked
            System.out.println(ANSI_BOLD + "Here is a recipt the information you've got today!" + ANSI_RESET);
            for(int go = 0; go < myreturn.length; go++){
                if(myreturn[go] == null){ //If they opt for no more information then there will be "null" information, that doesn't look good so I changed the way the null returns
                    System.out.println(ANSI_BOLD + "No information" + ANSI_RESET);
                }
                else{
                    System.out.println(ANSI_BOLD + myreturn[go] + ANSI_RESET);
                }
            }
        }
        catch(Exception e){ //This catch will happen if they entered something incorrect or outside the array range, it starts them over
            System.out.println("The day or number you have entered is not correct please start over");
            userinterface();
        }
            System.out.println(ANSI_BOLD + "Have a nice day!" + ANSI_RESET);
            input.close();
}
}


