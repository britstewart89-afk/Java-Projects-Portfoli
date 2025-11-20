package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
        // 0 1 2 3(index)
        // 1 2 3 4
        // 5 6 7 8
        // 9 8 7 2
        
        int[][] testArr = new int[3][4];
        //[1][2] = 7
        //System.out.println(testArr[0].length);
        
        Scanner input = new Scanner(System.in);
        
        // Input values into the array
        for(int i = 0; i < testArr.length; i++) {
            for(int j = 0; j < testArr[i].length; j++) {
                testArr[i][j] = input.nextInt();
            }
        }
        
        System.out.println(testArr[1][2]);
        
        // Calculate and print column sums
        for(int j = 0; j < testArr[0].length; j++) {
            int sumColumn = sumColumn(testArr, j);
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn);
        }
        
        input.close(); // Close the scanner
    }
    
    public static int sumColumn(int[][] m, int columnIndex) {
        int total = 0;
        for(int i = 0; i < m.length; i++) {
            total += m[i][columnIndex];
        }
        return total;
    }
}