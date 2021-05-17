public class Line{
    Point p1;
    Point p2;

public Line(Point p1, Point p2){
    this.p1 = p1;
    this.p2 = p2;
}
public Point getp1(){
    return p1;
}
public Point getp2(){
    return p2;
}
public String toString(){
    return "[(" + p1.toString() + "), (" + p2.toString() + ")]";
}
public static double getSlope(Point p3, Point p4){
    if((p3.getx()-p4.getx()) != 0){
        double slope = (p3.gety() - p4.gety())/(p3.getx()-p4.getx());
        return slope;
    }
    else{
    return -0.001;
    }
}
public Line(int x1, int y1, int x2, int y2 ){
    p1 = new Point(x1,y1);
    p2 = new Point(x2,y2);
}
public boolean isCollinear(Point p){
    double slope1 = (p.getx() - p1.getx())/(p.gety() - p1.gety());
    double slope2 = (p.getx() - p2.getx())/(p.gety() - p2.gety());
    return slope1 == slope2;

}
}

