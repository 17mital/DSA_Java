package OOPS;

public class Asssignment {
    public static void main(String[] args) {
        Complex c1=new Complex(3, 4);
        Complex c2=new Complex(4, 5);

        Complex s=Complex.sum(c1, c2);
        Complex d=Complex.diff(c1, c2);
        Complex p=Complex.prod(c1, c2);

        s.Printcomplex();
        d.Printcomplex();
        p.Printcomplex();

        
    }
    
}

class Complex{
    int real;
    int img;
    public Complex(int r , int i){
        real=r;
        img=i;
    }
    public static Complex sum(Complex a , Complex b){
        return new Complex((a.real+b.real),(a.img+b.img)) ;

    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.img-b.img));
    }
    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.img*b.img)), ((a.real*b.img)-(a.img+b.real)));
    }
    public void Printcomplex(){
        if(real ==0 && img!=0){
            System.out.println(img+"i");
        }
        else if(real!=0 && img ==0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+" +img+"i");
        }

    }
}