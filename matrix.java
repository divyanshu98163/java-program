import java.util.*;
public class matrix {
    public static boolean Search(int matrix[][],int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j= 0; i<matrix[0].length; i++){
                if(matrix[i][j] == key){
                    System.out.println("key of maitrix index cell  "+"("+i+","+j+")");
                    return  true;
                    
                }
            }
        }
        return false;
    }
    public static void Matrix(int matrix[][]){
        int n =matrix.length;
        int m =matrix[0].length;
        // input 
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i<n; i++){
            for(int j= 0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        for(int i= 0; i<n; i++){
            for(int j= 0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }
    public static void main(String arg[]){
        int matrix[][] = new int[3][4];
        Matrix(matrix);
        Search(matrix, 6);
    }
}
