public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }

  public Triangle(double xa, double ya, double xb, double yb, double xc, double yc){
    v1 = new Point(xa, ya);
    v2 = new Point(xb, yb);
    v3 = new Point(xc, yc);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int index){
    if (index == 0){
      return new Point(v1);
    }
    if (index == 1){
      return new Point(v2);
    }
    if (index == 2){
      return new Point(v3);
    }
    else {
      return new Point(0, 0);
    }
  }

  public String toString(){
    return "Triangle : A" + v1 + "B" + v2 + "C" + v3;
  }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    if (index == 1){
      v2 = newP;
    }
    if (index == 2){
      v3 = newP;
    }
  }
}
