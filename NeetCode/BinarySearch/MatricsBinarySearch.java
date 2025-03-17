package NeetCode.BinarySearch;

public class MatricsBinarySearch {
    public static void main(String[] args) {
        int [][] matrix = {{1}};
        System.out.println(searchMatrix(matrix, 1));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length-1 && col>=0) {
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
            
        }
        return false;
    }
}
