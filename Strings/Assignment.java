package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    //q1
    public static int vowelcounter(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(ch == 'a' || ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
                count++;
            }
        }
        return count;
    }
    //q4 Anagram  brute force o(n^2)
    public static boolean anagram(String s1, String s2){
        
        int totalcount=0;
        if(s1.length()==s2.length()){
            for(int i=0; i<s1.length();i++){
                int count=0;
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                        if(count==1){
                            totalcount++;
                        }
                    }
                  
                }
                
            }
            if(totalcount==s1.length()){
                System.out.println("Strings are Anagram");
                return true;
            }
            else{
                System.out.println("Strings are not Anagram");
                return false;

            }

        }
        else{
            System.out.println("Strings are not Anagram");
            return false;

        }

    }
    //q4 optimised approch O(1)
    public static boolean anagram2(String s1, String s2){
        if(s1.length()==s2.length()){
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            char[] s1array=s1.toCharArray();
            char[] s2array=s2.toCharArray();
            Arrays.sort(s1array);
            Arrays.sort(s2array);
            if(Arrays.equals(s1array,s2array)){
                System.out.println("Strings are Anagram");
                return true;

            }
            else{
                System.out.println("Strings are not Anagram");
                return false;
            }

        }
        else{
            System.out.println("Strings are not Anagram");
            return false;
        }
    }

    public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the string");
    // String str=sc.nextLine(); 
    // System.out.println(vowelcounter(str));   
    String s1="care";
    String s2="race";
    anagram2(s1, s2);
    }
    
}
