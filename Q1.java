package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a five digit number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String num1=Integer.toString(num);
        String result=new String();
        result="";

        for(int i=0;i<num1.length();i++){
            if(Character.getNumericValue(num1.charAt(i))==9){
                result=result+"0";
            }
            if(Character.getNumericValue(num1.charAt(i))!=9){
                result=result+(Character.getNumericValue(num1.charAt(i))+1);

            }

        }

        int num2=Integer.parseInt(result);
        System.out.println(num2);



    }
}
