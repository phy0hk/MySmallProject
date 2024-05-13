
public class GeometricalObject {
    private double l;
    private double b;
    private double h;
    private double A;
    private int numOfSides;
    private double Apothem;
    private String color;
    private String Type;
    GeometricalObject(String color,double radius){
        this.color = color;
        this.l = radius;
        Type = "Circle";
    }
    GeometricalObject(String color,double lenght,double breadth){
        this.color = color;
        this.l = lenght;
        this.b = breadth;
        Type = "Rectangle";
    }
    public void Triangle(String color,double base,double height){
        this.h = height;
        this.color = color;
        this.l = base;
        Type = "Triangle";
    }
    public void Polygon(String color,int NumberOfSides,double lenght,double Apothem){
        this.l = lenght;
        this.color = color;
        this.numOfSides = NumberOfSides;
        this.Apothem = Apothem;
        Type = "Polygon";
    }
    public double Area(){
        if (Type.equals("Circle")) {
            A = 3.14*l;
        }else if (Type.equals("Tirangle")) {
            A = 0.5*(l*h);
        }else if (Type.equals("Rectangle")) {
            A = l * b;
        }else if (Type.equals("Polygon")) {
            A = (double)(numOfSides*Apothem*l)/2;
        }
        return A;
    }

}
