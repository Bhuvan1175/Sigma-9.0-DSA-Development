public class DecimalToBinary {

    public static void decimalToBinary(int decimalNumber) {

        int originalNumber = decimalNumber; 
        int power = 0;
        int binaryNumber = 0;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = binaryNumber + (remainder * (int)Math.pow(10, power));

            power++;
            decimalNumber /= 2;
        }

        System.out.println("Decimal to Binary of " + originalNumber + " is: " + binaryNumber);
    }

    public static void main(String[] args) {
        decimalToBinary(7);
    }
}
