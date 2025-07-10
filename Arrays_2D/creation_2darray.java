package Arrays_2D;

import java.util.Scanner;

public class creation_2darray {
    public static boolean search(int matrix[][], int target){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    System.out.println("Found at cell :  ("+ i+" , "+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[4][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in matrix :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array matrix is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        search(matrix, 3);
    }
    
}
