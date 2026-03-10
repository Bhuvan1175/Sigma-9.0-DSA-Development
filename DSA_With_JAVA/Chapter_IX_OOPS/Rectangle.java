class RectangleTest{

    // Defined Parameter

    public int length;
    public int breadth;

    // Defined Behaviour
    public int Area(){
        return length*breadth;
    }
    public int Perimeter(){
        return 2*(length+breadth);
    }
}
public class Rectangle{
    public static void main(String[] args) {
        RectangleTest R1=new RectangleTest();
        R1.length=5;
        R1.breadth=10;
        System.out.println("Area of Rectangle : "+R1.Area());
        System.out.println("Perimeter of Rectangle : "+R1.Perimeter());
    }
}