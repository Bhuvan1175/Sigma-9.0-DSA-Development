public class BinaryToDecimal{

    public static void BinToDec(int BinNum){
        int MyNum=BinNum;
        int pow=0;
        int DecNum=0;
        while(BinNum>0){
            int lastDigit=BinNum%10;
            DecNum=DecNum+(lastDigit*(int)Math.pow(2, pow));

            pow++;
            BinNum/=10;
        }
        System.out.println("Binary To Decimal of "+MyNum+" is : "+DecNum);
    }

    public static void main(String[] args) {
        BinToDec(111);
    }
}