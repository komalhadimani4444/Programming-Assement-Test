import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a four digit number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String num1=Integer.toString(num);
        int n=num1.length();
        int[] deno =new int[n];
        deno= new int[]{1000, 100, 10, 1};
        for(int i=0;i<num1.length();i++){
            int result= deno[i] * Character.getNumericValue(num1.charAt(i));
            System.out.println(Character.getNumericValue(num1.charAt(i))+"*"+deno[i]+"="+result);


        }

    }
}
