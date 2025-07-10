package Bitwise_Manipulation;

import java.util.Scanner;

public class Assignment {
    //q1
    public static void swap( int n1, int n2){
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("after swaping n1 :"+n1+" and n2 :"+ n2);
    }
    //q3
    public static int add1(int n){
        n=~(~n)+1;
        return n;
    }
    //q4
    public static void uppertolower(char ch){
        System.out.println((char)(ch | ' '));
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter n1:");
        // int n1=sc.nextInt();
        // System.out.println("Enter n2:");
        // int n2=sc.nextInt();
        // swap(n1, n2);
        //System.out.println(add1(3));
        uppertolower('A');

        
    }
    
}
