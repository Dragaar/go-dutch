package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        int sum, friends, partOfSum, a = 0;
        Scanner scanner = new Scanner(System.in);
        sum = scanner.nextInt();
        friends = scanner.nextInt();


        if (sum<0){System.out.println("Bill total amount cannot be negative");}
        else if(friends<=0) { System.out.println("Number of friends cannot be negative or zero");}
        else {
            a = (sum/100)*10;
            partOfSum = (sum+a)/friends;
            System.out.println(partOfSum);
        }
    }
}
