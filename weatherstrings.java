import java.util.Arrays;

public class weatherstrings{
    private String day1;
    private String day2;

public weatherstrings(String day1, String  day2){
    this.day1 = day1;
    this.day2 = day2;
}
public String getday1(){
    return day1;
}
public String getday2(){
    return day2;
}
public String toString(){
    return "( " + day1.toString() + " " + day2.toString() + ")";
}
}
 