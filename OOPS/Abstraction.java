package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        horse h1= new horse();
        h1.walk();
        System.out.println(h1.color);
        h1.changecolor();
        System.out.println(h1.color);
        chicken c1= new chicken();
        c1.walk();        
    }    
}
abstract class Animal{
    String color;
    Animal(){
        color ="Brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("horse walk with 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("Chicken walk with 2 legs ");
    }
}
