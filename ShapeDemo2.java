abstarct class Shape
{
    String colour;
    double area;
    public abstract void calculateArea();
    public void showArea()
    {
        System.out.println("Area= "+area);
    }
    public void showColour()
    {
        System.out.println("     ");
    }
}
class Rectangle extends Shape
{
    double L,B;
    public Rectangle(String colour,double L,double B)
    {
        super(colour);
        this.L=L;
        this.B=B;
    }
    @Override
    public void calculateArea()
    {
        area=L*B;
    }
}
class Circle extends Shape
{
    double radius;
    double Circle(String colour,double radius)
    {
        super(colour);
        this.radius=radius;
    }
    @Override
    public void calculateArea()
    {
        area=3.142*radius*radius;
    }
}
public class ShapeDemo2{
    public static void displayArea(Shape s)
    {
        if(s instanceof Rectangle)
        {
            System.out.println("S hold rectangle instance now");
        }
        else if(s instanceof Circle)
        {
            System.out.println("S holds the Circle instance now");
        }
        s.calculateArea();
        s.showColour();
        s.showArea();
    }
    public static void main(String args[])
   {
       displayArea(new Rectangle("RED",25,24));
       displayArea(new Circle("BLUE",5));
    }
}