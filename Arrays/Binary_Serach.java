import java.util.Scanner;

public class Binary_Serach {
    public static int BinarySerach(int number[], int key){
        int start=0 , end= number.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if (number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the Key you want to search ");
        int key=sc.nextInt();
        int index=BinarySerach(number, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The key is present at this index in array "+ index);
        }
    }
    
}
