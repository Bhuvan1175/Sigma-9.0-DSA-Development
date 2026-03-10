class circleTest{

    // Defined Propertise
    public double radius;

    // Defined Behaviours
    public double Area(){
        return Math.PI * radius*radius;
    }
    public double Perimeter(){
        return 2* Math.PI * radius ;
    }
    public double Circumfernce(){
        return Perimeter() ;
    }

}
public class Circle{
    public static void main(String[] args){
        circleTest c1=new circleTest();
        c1.radius=7;
        System.out.println("Area of circle :"+c1.Area());
        System.out.println("Perimeter of circle :"+c1.Perimeter());
        System.out.println("Circumfernce of circle :"+c1.Circumfernce());
    }
}