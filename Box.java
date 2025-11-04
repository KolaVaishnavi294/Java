public class Box
{
    int l,b,h,area,vol;
    public Box()
    {
        l=b=h=1;
    }
    public Box(int n)
    {
        l=b=h=n;
    }
    public Box(int p,int q,int r)
    {
        l=p;
        b=q;
        h=r;
    }
    public void ShowDimensions()
    {
        System.out.println(l+" "+b+" "+h); 
    }
    public void calcArea()
    {
        area=2*(l*b+b*h+l*h);
        System.out.println("Area= "+area);
    }
    public void calcVolume()
    {
        vol=l*b*h;
        System.out.println("Volume= "+vol);
    }
    public static void main(String args[])
    {
        Box b1=new Box();
        Box b2=new Box(4);
        Box b3=new Box(2,3,4);
        b1.calcArea();
        b1.calcVolume();
        b2.calcArea();
        b2.calcVolume();
        b3.calcArea();
        b3.calcVolume();
        b1.ShowDimensions();
        b2.ShowDimensions();
        b3.ShowDimensions();
    }
}