package OOPS;

public class inheritence {
   public static void main(String[] args) {
        // fish f1=new fish();
        // f1.eat();
        dog d1=new dog();
        d1.legs=4;
        System.out.println(d1.legs);

    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
class fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swin in water");
    }
}
class mammals extends Animal{
    int legs;

}
class dog extends mammals{
    String breed;
}

