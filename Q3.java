import java.util.Scanner;

public class NoOfDigitsInInteger {
    public static void main(String[] args) {
        System.out.println("Enter the integer number:");
        Scanner in=new Scanner(System.in);
        long num=in.nextLong();
        int count=0;
        while(num!=0){
            num /=10;
            ++count;
        }
        System.out.println("The number of digits:"+count);
    }
}
