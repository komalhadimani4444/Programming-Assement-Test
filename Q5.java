package com.company;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the lower bound:");
        Scanner in=new Scanner(System.in);
        int low=in.nextInt();
        System.out.println("Enter the upper bound:");
        int up=in.nextInt();
        int flag;
        System.out.printf("\nPrime numbers between %d and %d are: ", low, up);


        for(int i=low+1;i<=up-1;i++){
            if(i==1||i==0){
                continue;
            }
            flag=1;

            for(int j=2;j<=i/2;++j){
                if(i%j==0){
                    flag=0;
                    break;

                }
            }

            if(flag==1){
                System.out.println(i);
            }


        }


    }
}
