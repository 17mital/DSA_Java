public class Pairs_Array {
    public static void pair(int number[]){
        for( int i=0 ; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+i+","+j+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        pair(number);

    }
}
