package Strings;

import java.util.Scanner;

public class string_basic {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    // char arr[]={'a', 'b', 'c', 'd'};
    // String str="abc";
    // String str2=new String("xyz");
    //           Input and Output of Strings
    // Scanner sc=new Scanner(System.in);
    // String name ;
    // name = sc.nextLine();
    // System.out.println(name);
    //        1   length function of string 
    // String fullname="Mital patil";
    // System.out.println(fullname.length());
    //        2   concatenate function
         String firstname="Mital";
         String lastname="Patil";
         String fullname=firstname+" "+lastname;
        // System.out.println(fullname);
    //        3    charAt Function
       // System.out.println(fullname.charAt(0));
       printletter(fullname);
    }
    
}
