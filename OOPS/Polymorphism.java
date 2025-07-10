package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        // calculator c1=new calculator();
        // System.out.println(c1.sum(1,3));
        // System.out.println(c1.sum((float)1.2,(float) 0));
        // System.out.println(c1.sum(1,2, 3));

        deer d1=new deer();
        d1.eat();

        
    }
    
}
//method overloading
class calculator{
    int sum( int a, int b){
        return a+ b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
//method overriding
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }

}
class  deer extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}
