package Arrays_2D;
public class Assignment {
    //q1
    public static void frequency(int matrix[][], int key){
        int frq=0;
        for(int i=0 ; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    frq++;
                }
            }
            
        }
        System.out.println("Count of the key "+key+" :"+ frq);
    }
    //q2
    public static void rowsum(int nums[][], int row){
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[row][j];
        }
        System.out.println("Sum of the second row : "+ sum);
    }
    //q3
    public static void transposematrix(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        int transpose[][] = new int [col][row];
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(transpose);

    }
    public static void printmatrix(int matrix[][]){
        System.out.println("transpose matrix is :");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int matrix[][]={{4,7,8},{8,8,7}};
        // int key=7;
        // frequency(matrix, key);
        // int nums[][]={ {1,4,9},{11,4,3},{2,2,3} };
        // int row=2;
        // rowsum(nums, row-1);
        int matrix[][]={{11,12,13},{21,22,23}};
        transposematrix(matrix);
        
   
   

    }
    
}
