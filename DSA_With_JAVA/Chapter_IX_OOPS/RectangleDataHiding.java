class Rectangle{
    private int  length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public void setLength(int l){
        if(l>0){
            length=l;
        }else{
            length=0;
        }
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        if(b>0){
            breadth=b;
        }else{
            breadth=0;
        }
    }
    public int area(){
        return getLength()*getBreadth();

    }
}

public class RectangleDataHiding{
    public static void main(String[] args) {
        Rectangle R1=new Rectangle();
        R1.setLength(10);
        R1.setBreadth(20);
        System.out.println("Area of Rectangle : "+R1.area());
    }
}