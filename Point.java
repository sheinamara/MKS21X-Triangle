public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distance(Point first, Point second){
    double xMinus = second.getX() - first.getX();
    double yMinus = second.getY() - first.getY();
    return Math.abs(Math.sqrt((xMinus * xMinus) + (yMinus * yMinus)));
  }

  public double distanceTo(Point given){
    double xMinus = given.getX() - this.getX();
    double yMinus = given.getY() - this.getY();
    return Math.abs(Math.sqrt((xMinus * xMinus) + (yMinus * yMinus)));
  }

  public String toString(){
    return "Point (" + x + ", " + y + ")";
  }
}
