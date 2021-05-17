public class Pointdata{
    public static void main(String[]args){
    Point p1 =new Point(3,5);
    Point p2 = new Point(4,7); 
    Line l1 = new Line(p1, p2);
    System.out.print(l1.toString());
    double slope = Line.getSlope(p1, p2);
    double slope1 = Line.getSlope(p1, p2);
    double slope2 =Line.getSlope(p1, p2);
    if(slope == -0.001){
        System.out.println("slope is undefined");
    }
    else{
        System.out.println("The slope of the line is " + slope);
    }
    if(slope1 == slope2){
        System.out.println("colinear");
    }
    else{
    System.out.println("not colinear");
    }
    }
}
