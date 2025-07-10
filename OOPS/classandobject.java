package OOPS;

public class classandobject {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.age=21;
        s1.name="mital";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=70;

        Student s2= new Student(s1);
        s1.marks[2]=100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

        //System.out.println(s1.name);

        // s1.calpercentage(56, 97, 89);

        // System.out.println("Your percentage are : "+ s1.percentage);
        // Pen p1= new Pen();
        // p1.color="red";
        // p1.tip=5;
        // p1.getcolor();
        // p1.gettip();
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        // p1.setcolor("blue");
        // p1.settip(10);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        
    }
    
}
class Student{
    String name;
    int age;
    String password;
    int marks[];
    float percentage;
    void calpercentage(int phy, int chem , int math){
        percentage=(phy+chem+math)/3;
    }
    Student(){
        marks=new int [3];
        System.out.println("Constructor is called");
    }
    Student(int age){
        marks=new int [3];
        this.age=age;
    }
    //shallow copy constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.age=s1.age;
    //     this.marks=s1.marks;
    // }
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.age=s1.age;
        for(int i=0; i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }

}
class Pen{
    String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void settip(int newtip){
        this.tip=newtip;
    }
}


