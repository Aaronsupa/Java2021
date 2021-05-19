import java.util.Arrays;

public class weathercomparision { 
    String aday;
    String aday2;

public weathercomparision(String aday, String aday2){ // This is the object class for the weather comparision 
    this.aday = aday;
    this.aday2 = aday2; 
}
public String getaday(){ //assessor method
    return aday;
}
public String getaday2(){
    return aday2;
}
public String toString(){ //toString 
    return aday.toString() + " is being compared to " + aday2.toString(); //This is what will print when we declare it as "comp" in the "userinterface" method
}
public weathercomparision(String[] date, String[] date2){ //Since the data is from String arrays I need to make the perameters arrays, I had problems with this earlier but was able to figure it out
    aday = new String(); //With the array string we create aday and aday2 which will be able to take the Strings
    aday2 = new String();
}
}

