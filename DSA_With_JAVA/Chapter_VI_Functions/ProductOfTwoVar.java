
public class ProductOfTwoVar {

    public static int multiple(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int result = multiple(a, b);
        System.out.println(a + " X " + b + " = " + result);
    }
}
