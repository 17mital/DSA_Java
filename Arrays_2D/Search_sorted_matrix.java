package Arrays_2D;

public class Search_sorted_matrix {
    public static boolean starcasesearch1(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+ row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static boolean starcasesearch2(int matrix[][], int key){
        int row=matrix.length-1 , col=0;
        while(row>=0 && col<matrix[0].length ){
            if(matrix[row][col]== key){
                System.out.println("Key found at ("+ row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key=3;
        starcasesearch1(matrix, key);
        starcasesearch2(matrix, key);
    }
    
}
