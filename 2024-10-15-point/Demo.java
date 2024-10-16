public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY() - b.getY()),2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    Point p4 = new Point(p1);
    Point p5 = new Point(0, 0);
    Point p6 = new Point(10, 1);
    System.out.println(p4);
    System.out.println(distance(p5, p6));
    System.out.println(Point.distance(p4, p6));
    System.out.println(p5.distanceTo(p5));

    Point t1 = new Point(0, 0);
    Point t2 = new Point(1, 0);
    //Point t3 = new Point((t1.getX + t2.getX) / 2, Math.sqrt())
    Point t3 = new Point(0.5, Math.sqrt(0.75));
    System.out.println("t1: " + t1);
    System.out.println("t2: " + t2);
    System.out.println("t3: " + t3);
    System.out.println("Distance from t1 to t2: " + distance(t1,t2));
    System.out.println("Distance from t2 to t3: " + distance(t3,t2));
    System.out.println("Distance from t1 to t3: " + distance(t1,t3));
  }
}
